package org.snva.emspring;

import org.snva.emspring.config.UserConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(UserConfig.class);
        annotationConfigApplicationContext.refresh();
        BufferedReader bufferedReader = (BufferedReader) annotationConfigApplicationContext.getBean("reader");
       Runner runner = (Runner) annotationConfigApplicationContext.getBean("runner");
       runner.checkUserOptions();
        try {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("...........");
    }
}