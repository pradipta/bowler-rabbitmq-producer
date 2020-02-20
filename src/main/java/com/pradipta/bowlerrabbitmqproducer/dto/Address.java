package com.pradipta.bowlerrabbitmqproducer.dto;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
public class Address implements Serializable {
    private String addressType;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
}
