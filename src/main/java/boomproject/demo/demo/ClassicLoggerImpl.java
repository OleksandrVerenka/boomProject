package boomproject.demo.demo;

import org.springframework.stereotype.Component;

public class ClassicLoggerImpl implements Logger {

    @Override
    public void log() {
        System.out.println("Classic log");
    }
}
