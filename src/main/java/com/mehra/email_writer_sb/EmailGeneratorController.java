package com.mehra.email_writer_sb;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generatorEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.generatorEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

}
