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

    // Using @RequestParam to pass name as query parameter
    @GetMapping("/queryParam")
    public String hello(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname) {
        return "Hello " + fname + " " + lname;
    }

    // Using @pathVariable to pass variable in method
    @GetMapping("/hello/{fname}/{lname}")
    public String helloName(@PathVariable("fname") String fname, @PathVariable("lname") String lname) {
        return "Hello " + fname +" " + lname;
    }
}