package com.example.schoolmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    private String firstName;


    private String lastName;


    private String email;



    private Gender gender;

    private String date_of_birth;

    private String phone;

    private Boolean verificationStatus;



    private String password;

    private String address;

    private boolean isActive = true;

}
