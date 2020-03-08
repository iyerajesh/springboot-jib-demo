package io.xylia.platform.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}

