package com.example.api.service.logService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private final Logger logger = LoggerFactory.getLogger(LogService.class);

public void createLog(String studentName) {
    logger.info("Starting student creation. Student Name: {}", studentName);

    try {
        // Business logic to save student

        logger.info("Student created successfully. Student Name: {}", studentName);

    } catch (IllegalArgumentException ex) {
        logger.warn("Invalid student data. Student Name: {}, Reason: {}",
                studentName, ex.getMessage());

    } catch (Exception ex) {
        logger.error("Failed to create student. Student Name: {}",
                studentName, ex);
    }
}
    
}
