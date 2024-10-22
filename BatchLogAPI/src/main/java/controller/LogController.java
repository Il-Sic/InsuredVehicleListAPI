package controller;

import entity.LogEntryEntity;
import entity.PayloadEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.openapitools.api.LogApi;
import org.openapitools.model.LogPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import service.LogService;

import java.util.Optional;

@RestController
@RequestMapping("/log")
public class LogController implements LogApi
{
    private final LogService logService;

    @Autowired
    public LogController(LogService logService)
    {
        this.logService = logService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest()
    {
        return LogApi.super.getRequest();
    }

    @Override
    @Operation(
            operationId = "logPost",
            summary = "Log data from batch process",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Log successfully received"),
                    @ApiResponse(responseCode = "400", description = "Bad request")
            }
    )
    @PostMapping(consumes = "application/json")
    public ResponseEntity<Void> logPost(@RequestBody LogPostRequest logPostRequest)
    {
        try
        {
            LogEntryEntity logEntry = new LogEntryEntity();
            logEntry.setTimeOfInvocation(logPostRequest.getTimeOfInvocation());
            logEntry.setRecordNumber(logPostRequest.getRecordNumber());

            PayloadEntity payload = getPayloadEntity (logPostRequest);

            logEntry.setActualPayload(payload);

            logService.saveLogEntry(logEntry, payload);

            System.out.println(logEntry);
            System.out.println(payload);

            return ResponseEntity.status(HttpStatus.OK).build();
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    private static PayloadEntity getPayloadEntity(LogPostRequest logPostRequest)
    {
        PayloadEntity payload = new PayloadEntity();
        payload.setIdPol(logPostRequest.getActualPayload().getIdPol());
        payload.setCdescr(logPostRequest.getActualPayload().getCdescr());
        payload.setDexpcur(logPostRequest.getActualPayload().getDexpcur());
        payload.setCplate(logPostRequest.getActualPayload().getCplate());
        payload.setCbrand(logPostRequest.getActualPayload().getCbrand());
        payload.setCmodel(logPostRequest.getActualPayload().getCmodel());
        payload.setCver(logPostRequest.getActualPayload().getCver());
        return payload;
    }
}
