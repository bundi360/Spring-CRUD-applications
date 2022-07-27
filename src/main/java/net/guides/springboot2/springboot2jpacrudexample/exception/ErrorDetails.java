package net.guides.springboot2.springboot2jpacrudexample.exception;

import java.util.Date;

/**
 * @author Titus Murithi Bundi
 */
//Creating a custom error response bean.
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
