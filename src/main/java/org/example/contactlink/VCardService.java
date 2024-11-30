package org.example.contactlink;

import org.springframework.stereotype.Service;

@Service
public class VCardService {

    public String generateVCard(String name, String phone, String email, String jobTitle,String companyName, String base64Picture) {
        return "BEGIN:VCARD\n" +
                "VERSION:3.0\n" +
                "FN:" + name + "\n" +
                "TEL:" + phone + "\n" +
                "EMAIL:" + email + "\n" +
                "TITLE:" + jobTitle + "\n" +
                "ORG:" + companyName + "\n" +
                "URL:https://www.unicredit.ba\n" +
                "PHOTO;ENCODING=BASE64;TYPE=JPEG:" + base64Picture + "\n" +
                "END:VCARD";

    }
}

