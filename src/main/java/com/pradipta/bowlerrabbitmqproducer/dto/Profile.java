package com.pradipta.bowlerrabbitmqproducer.dto;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
public class Profile implements Serializable {
    private String name;
    private String phoneNumber;
    private String email;
}
