package semicolon.africa.jijiMoji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import semicolon.africa.jijiMoji.dtos.requests.RegisterListerRequest;
import semicolon.africa.jijiMoji.services.ListerService;

public class ListerController {
    @Autowired
    private ListerService listerService;

    @PostMapping
    public ResponseEntity<?> register(@RequestBody RegisterListerRequest request)
}
