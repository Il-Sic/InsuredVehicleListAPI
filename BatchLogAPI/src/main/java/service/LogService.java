package service;

import entity.LogEntryEntity;
import entity.PayloadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.LogEntryRepository;
import repository.PayloadRepository; // Assuming you have this repository

import java.util.Optional;

@Service
public class LogService {

    private final LogEntryRepository logEntryRepository;
    private final PayloadRepository payloadRepository; // Add a repository for PayloadEntity

    @Autowired
    public LogService(LogEntryRepository logEntryRepository, PayloadRepository payloadRepository) {
        this.logEntryRepository = logEntryRepository;
        this.payloadRepository = payloadRepository; // Inject the payload repository
    }

    @Transactional
    public void saveLogEntry(LogEntryEntity logEntry, PayloadEntity payload) {
        // Save both entities
        logEntryRepository.save(logEntry);
        payloadRepository.save(payload);
    }

    public Optional<LogEntryEntity> getLogEntryById(Long id) {
        return logEntryRepository.findById(id);
    }

    @Transactional
    public void deleteLogEntry(Long id) {
        logEntryRepository.deleteById(id);
    }
}
