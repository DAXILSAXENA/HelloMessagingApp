/**
 * RestController to demonstrate various Http Methods
 *
 * @author DAXIL SAXENA
 * @since 12.08.2021
 */

package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hellomessaging")

public class HelloMessageController {
    
    //	Annotations for mapping web requests on methods in request-handling classes with flexible method signatures.
    @GetMapping("/get")
    public String hello() {
        return "Hello from Bridgelabz";
    }
}