package com.aman.controller;

import com.aman.model.TestJavaClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class TestApplicationJavaClass {

    @GetMapping(value = "testJavaClass",produces = "application/json")
    public ResponseEntity<TestJavaClass> testJavaClass(){

        TestJavaClass testJavaClass=new TestJavaClass();
        testJavaClass.setId(1);
        testJavaClass.setName("Aman");
        testJavaClass.setCity("Pune");

        return new ResponseEntity<>(testJavaClass, HttpStatus.OK);

    }
}
