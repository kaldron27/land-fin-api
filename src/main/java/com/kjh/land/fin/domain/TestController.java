package com.kjh.land.fin.domain;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/data")
    public ResponseEntity<String> getTestData(){


        return ResponseEntity.ok("test ok");
    }
}
