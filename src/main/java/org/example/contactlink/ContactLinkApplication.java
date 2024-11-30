package org.example.contactlink;

import io.unlogged.Unlogged;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactLinkApplication {
    @Unlogged
    public static void main(String[] args) {
        SpringApplication.run(ContactLinkApplication.class, args);
    }

}
