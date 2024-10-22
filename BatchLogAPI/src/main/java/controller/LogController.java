package controller;

import entity.LogEntryEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.openapitools.api.LogApi;
import org.openapitools.model.LogPostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.LogService;

import javax.validation.Valid;

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

    @Operation(
            operationId = "logPost",
            summary = "Log data from batch process",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Log successfully received"),
                    @ApiResponse(responseCode = "400", description = "Bad request")
            }
    )

    public void logInvocation (@RequestBody LogEntryEntity logEntry)
    {
        System.out.println("Time of Invocation: " + logEntry.getTimeOfInvocation());
        System.out.println("Record Number: " + logEntry.getRecordNumber());
        System.out.println("Actual Payload: " + logEntry.getActualPayload().toString());
    }
}
