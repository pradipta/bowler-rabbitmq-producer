package com.pradipta.bowlerrabbitmqproducer.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Entity
public class Receipient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(targetEntity = Profile.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Receipient_Profile_FK", referencedColumnName = "id")
    private Profile basicProfile;
    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Receipient_Address_FK", referencedColumnName = "id")
    private List<Address> addresses;
}
