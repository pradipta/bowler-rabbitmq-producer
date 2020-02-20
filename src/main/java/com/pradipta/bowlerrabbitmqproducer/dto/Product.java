package com.pradipta.bowlerrabbitmqproducer.dto;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
public class Product implements Serializable {
    private String name;
    private Long price;
}
