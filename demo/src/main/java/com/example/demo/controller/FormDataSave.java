package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repo.UserRapo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

    @Controller
    public class FormDataSave {

        @Autowired
        private UserRapo userRepository;

        @PostMapping("/submitForm")
        public String submitForm(@RequestBody User user) {
            userRepository.save(user);
            return "redirect:/successPage"; // Redirect to a success page
        }
    }


