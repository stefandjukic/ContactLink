package org.example.contactlink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactLinkController {

    @Autowired
    private VCardService vCardService;

    @GetMapping("/generate-vcard")
    public ResponseEntity<byte[]> generateVCard(@RequestParam String name,
                                                @RequestParam String phone,
                                                @RequestParam String email) {
        String vCard = vCardService.generateVCard(name, phone, email);
        byte[] vCardBytes = vCard.getBytes();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDispositionFormData("attachment", "contact.vcf");

        return ResponseEntity.ok().headers(headers).body(vCardBytes);
    }
}

