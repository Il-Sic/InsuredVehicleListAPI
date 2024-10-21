package controller;

import model.LogEntry;
import org.springframework.web.bind.annotation.*;
import com.api.LogApi;

@RestController
@RequestMapping("/log")
public class LogController implements LogApi{

    @PostMapping
    public void logInvocation(@RequestBody LogEntry logEntry) {

        System.out.println("Time of Invocation: " + logEntry.getTimeOfInvocation());
        System.out.println("Record Number: " + logEntry.getRecordNumber());
        System.out.println("Actual Payload: " + logEntry.getActualPayload().toString());
    }
}
