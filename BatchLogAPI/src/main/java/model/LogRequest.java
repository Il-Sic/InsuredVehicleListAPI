package model;

import java.time.LocalDateTime;

class LogRequest
{
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timeOfInvocation;
    private int recordNumber;
    private String actualPayload;


    public LocalDateTime getTimeOfInvocation()
    {
        return timeOfInvocation;
    }

    public void setTimeOfInvocation(LocalDateTime timeOfInvocation)
    {
        this.timeOfInvocation = timeOfInvocation;
    }

    public int getRecordNumber()
    {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber)
    {
        this.recordNumber = recordNumber;
    }

    public String getActualPayload()
    {
        return actualPayload;
    }

    public void setActualPayload(String actualPayload)
    {
        this.actualPayload = actualPayload;
    }
}
