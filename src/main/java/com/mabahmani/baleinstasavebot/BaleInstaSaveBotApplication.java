package com.mabahmani.baleinstasavebot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BaleInstaSaveBotApplication implements CommandLineRunner {

    private final Environment env;
    public static String botToken;
    public static String userAgent;
    public static String cookie;

    public BaleInstaSaveBotApplication(Environment env) {
        this.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(BaleInstaSaveBotApplication.class, args);
    }

    @Override
    public void run(String... args) {
        botToken = env.getProperty("token");
        userAgent = env.getProperty("userAgent");
        cookie = env.getProperty("cookie");
    }
}
