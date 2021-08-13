package com.bridgelabz.hellomessagingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

// lombok annotations to avoid writing of getters,setters and constructors
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String fname;
    private String lname;
}