package ru.netology.controller;

import ru.netology.repository.JdbcRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcController {
    private final JdbcRepository repositoryJdbcApp;

    public JdbcController(JdbcRepository repositoryJdbcApp) {
        this.repositoryJdbcApp = repositoryJdbcApp;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        return repositoryJdbcApp.getProductName(name);
    }
}
