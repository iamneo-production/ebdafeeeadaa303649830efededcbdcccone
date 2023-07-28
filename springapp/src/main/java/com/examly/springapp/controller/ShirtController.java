package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Shirt;
import com.examly.springapp.service.ApiService;

@RestController
public class ShirtController {
    @Autowired
    public ApiService apiService;

    @GetMapping("/")
    public List<Shirt> getAllShirt() {
        return apiService.getAllShirt();
    }

    @GetMapping("/{shirtId}")
    public Shirt getOneShirt(@PathVariable int shirtId) {
        return apiService.getOneShirt(shirtId);
    }

    @PostMapping("/")
    public boolean addNewShirt(@RequestBody Shirt shirt) {
        return apiService.addNewShirt(shirt);
    }

    @PutMapping("/{shirtId}")
    public Shirt updateShirt(@RequestBody Shirt shirt, @PathVariable int shirtId) {
        return apiService.updateShirt(shirt, shirtId);
    }

    @DeleteMapping("/{shirtId}")
    public boolean deleteOneShirt(@PathVariable int shirtId) {
        apiService.deleteOneShirt(shirtId);
        return true;
    }
}
