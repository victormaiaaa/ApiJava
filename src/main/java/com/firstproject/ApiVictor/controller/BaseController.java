package com.firstproject.ApiVictor.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BaseController {

        @GetMapping
        private String info () {
            return "Server Ativo";
        }
}
