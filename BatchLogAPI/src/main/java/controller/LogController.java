package controller;

import entity.LogEntryEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import model.LogEntry;
import org.openapitools.model.LogPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LogService;

import javax.validation.Valid;

@RestController
@RequestMapping("${openapi.logging.base-path:}")
public class LogController {

    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @Operation(
            operationId = "logPost",
            summary = "Log data from batch process",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Log successfully received"),
                    @ApiResponse(responseCode = "400", description = "Bad request")
            }
    )
    @PostMapping(value = "/log", consumes = "application/json")
    public ResponseEntity<Void> logPost(
            @Parameter(name = "LogPostRequest", description = "Request body containing log details", required = true)
            @Valid @RequestBody LogPostRequest logPostRequest
    ) {
        // Creazione dell'oggetto LogEntryEntity
        LogEntryEntity logEntry = new LogEntryEntity();
        logEntry.setTimeOfInvocation(logPostRequest.getTimeOfInvocation());
        logEntry.setRecordNumber(logPostRequest.getRecordNumber());

        // Assicurati di gestire correttamente l'oggetto payload
        // Potresti dover mappare LogPostRequest.getActualPayload() su un oggetto PayloadEntity
        // Esempio di mappatura (assumendo che PayloadEntity sia correttamente definita):
        // PayloadEntity payloadEntity = new PayloadEntity();
        // payloadEntity.setData(logPostRequest.getActualPayload()); // Modifica in base alla struttura
        // logEntry.setActualPayload(payloadEntity);

        logService.saveLogEntry(logEntry);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
