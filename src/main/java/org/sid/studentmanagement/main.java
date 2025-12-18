package org.sid.studentmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger =
            LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        StudentService service = new StudentService();

        logger.info("Application started");
        logger.info("Average = {}", service.calculateAverage());
    }
}
