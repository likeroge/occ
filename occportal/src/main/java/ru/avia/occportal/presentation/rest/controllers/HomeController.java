package ru.avia.occportal.presentation.rest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Egor
 * @name HomeController
 * @date 18.09.2025
 */

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {
     @GetMapping
     public ResponseEntity<?> home() {
          return ResponseEntity.ok().body("Hello, this is home endpoint");
     }
}
