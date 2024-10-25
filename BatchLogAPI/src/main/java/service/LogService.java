package service;

import entity.LogEntryEntity;
import entity.PayloadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.LogEntryRepository;
import repository.PayloadRepository;


@Service
public class LogService {

    private final LogEntryRepository logEntryRepository;
    private final PayloadRepository payloadRepository;

    @Autowired
    public LogService(LogEntryRepository logEntryRepository, PayloadRepository payloadRepository) {
        this.logEntryRepository = logEntryRepository;
        this.payloadRepository = payloadRepository;
    }

    @Transactional
    public void saveLogEntry(LogEntryEntity logEntry, PayloadEntity payload) {
        logEntryRepository.save(logEntry);
        payloadRepository.save(payload);
    }
}
