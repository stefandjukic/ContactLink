package org.example.contactlink;

import org.springframework.stereotype.Service;

@Service
public class VCardService {

    public String generateVCard(String name, String phone, String email) {
        return "BEGIN:VCARD\n" +
                "VERSION:3.0\n" +
                "FN:" + name + "\n" +
                "TEL:" + phone + "\n" +
                "EMAIL:" + email + "\n" +
                "END:VCARD";
    }
}

