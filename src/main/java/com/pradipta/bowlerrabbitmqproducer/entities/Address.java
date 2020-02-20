package com.pradipta.bowlerrabbitmqproducer.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class Address implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String addressType;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
}
