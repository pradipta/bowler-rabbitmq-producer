package com.pradipta.bowlerrabbitmqproducer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receipient {
    private Profile basicProfile;
    private List<Address> addresses;
}
