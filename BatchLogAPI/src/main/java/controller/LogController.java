package controller;

import entity.Invocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.InvocationRepository;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    private InvocationRepository invocationRepository;

    @PostMapping
    public void logInvocation(@RequestBody Invocation invocation)
    {

        System.out.println("Time of Invocation: " + invocation.getTimeOfInvocation());
        System.out.println("Record Number: " + invocation.getRecordNumber());
        System.out.println("Actual Payload: " + invocation.getActualPayload());

        invocationRepository.save(invocation);

    }
}