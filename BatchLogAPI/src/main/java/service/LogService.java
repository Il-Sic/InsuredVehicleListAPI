package service;

import entity.LogEntryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.LogEntryRepository;

import java.util.Optional;

@Service
public class LogService {

    private final LogEntryRepository logEntryRepository;

    @Autowired
    public LogService(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    @Transactional
    public LogEntryEntity saveLogEntry(LogEntryEntity logEntry) {
        return logEntryRepository.save(logEntry);
    }

    public Optional<LogEntryEntity> getLogEntryById(Long id) {
        return logEntryRepository.findById(id);
    }

    @Transactional
    public void deleteLogEntry(Long id) {
        logEntryRepository.deleteById(id);
    }
}
