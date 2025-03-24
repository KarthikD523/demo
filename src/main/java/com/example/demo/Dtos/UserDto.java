package com.example.demo.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    public String name;
    public String email;

    public String getName() {
        return name;
    }
    public  String getEmail() {
        return email;
    }
}
