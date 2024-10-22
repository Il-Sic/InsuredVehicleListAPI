package controller;

import entity.LogEntryEntity;
import entity.PayloadEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.openapitools.model.LogPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LogService;

import javax.validation.Valid;

@RestController
@RequestMapping("/log")
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

    @PostMapping
    public void logPost (@RequestBody LogPostRequest logPostRequest)
    {
        LogEntryEntity logEntry = new LogEntryEntity();
        logEntry.setTimeOfInvocation(logPostRequest.getTimeOfInvocation());
        logEntry.setRecordNumber(logPostRequest.getRecordNumber());

        PayloadEntity payLoad = new PayloadEntity();
        payLoad.setIdPol(logPostRequest.getActualPayload().getIdPol());
        payLoad.setCdescr(logPostRequest.getActualPayload().getCdescr());
        payLoad.setDexpcur(logPostRequest.getActualPayload().getDexpcur());
        payLoad.setCplate(logPostRequest.getActualPayload().getCplate());
        payLoad.setCbrand(logPostRequest.getActualPayload().getCbrand());
        payLoad.setCmodel(logPostRequest.getActualPayload().getCmodel());
        payLoad.setCver(logPostRequest.getActualPayload().getCver());

        System.out.println(logEntry.getTimeOfInvocation());
        System.out.println(logEntry.getRecordNumber());
        System.out.println(payLoad.toString());

    }
}
