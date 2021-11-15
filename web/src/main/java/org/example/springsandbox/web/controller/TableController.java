package org.example.springsandbox.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TableController {
    @GetMapping("/tables/{id}")
    public String findById(
            @PathVariable long id) {
        return new String("tables");
    }
}
