package com.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class PayLoadController {

    @Autowired
    PayLoadService payLoadService;

    @PostMapping("/add")
    public ResponseEntity<String> addLoad(@RequestBody PayLoad payLoad) {
        payLoadService.addLoad(payLoad);
        return ResponseEntity.ok("Load details added successfully");
    }
}
