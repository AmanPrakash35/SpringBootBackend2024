package com.aman.controller;

import com.aman.model.TestApplicationHealth;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "app")
public class TestApplication {

    @GetMapping(value = "health",produces = "application/json")
    public ResponseEntity getApplicationHealth(){
        TestApplicationHealth testApplicationHealth=new TestApplicationHealth();
        testApplicationHealth.setMsg("Application is Up...");

        return ResponseEntity.ok(testApplicationHealth);
    }
}
