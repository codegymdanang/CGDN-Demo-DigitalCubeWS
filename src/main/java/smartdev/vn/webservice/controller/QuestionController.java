package smartdev.vn.webservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import smartdev.vn.webservice.response.JwtResponse;

@RestController
@CrossOrigin
public class QuestionController {


    @PostMapping
    @PreAuthorize("hasRole('Admin')")
    public ResponseEntity<?> createQuestion() {

        return ResponseEntity.ok("OKIE");
    }


}
