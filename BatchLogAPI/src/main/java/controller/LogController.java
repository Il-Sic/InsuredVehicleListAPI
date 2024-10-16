package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController
{
    @PostMapping
    public String logData(@RequestBody LogRequest request)
    {
        System.out.println("Time of Invocation: " + request.getTimeOfInvocation());
        System.out.println("Record Number: " + request.getRecordNumber());
        System.out.println("Actual Payload: " + request.getActualPayload());
        return "Log received";
    }
}
