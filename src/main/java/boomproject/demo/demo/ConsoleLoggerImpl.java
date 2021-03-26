package boomproject.demo.demo;

import org.springframework.stereotype.Component;

public class ConsoleLoggerImpl implements Logger {

    @Override
    public void log() {
        System.out.println("LOGGGGGG");
    }
}
