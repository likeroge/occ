package ru.avia.occportal.presentation.rest.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.avia.occportal.core.entities.UserDummy;
import ru.avia.occportal.core.repos.UserDummyRepo;

/**
 * @author Egor
 * @name UserDummyController
 * @date 19.09.2025
 */

@RestController
@RequestMapping("/user-dummy")
@RequiredArgsConstructor
public class UserDummyController {

    private final UserDummyRepo userDummyRepo;

    @GetMapping
    public ResponseEntity<Iterable<UserDummy>> findAll() {
        return ResponseEntity.ok().body(userDummyRepo.findAll());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDummy> findById(@RequestParam Long id) {
        return ResponseEntity.ok(userDummyRepo.findById(1L).orElseThrow(() -> new RuntimeException("UserDummy not found")));

    }
}
