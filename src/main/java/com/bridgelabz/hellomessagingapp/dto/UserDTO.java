package com.bridgelabz.hellomessagingapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String fname;
    private String lname;
}