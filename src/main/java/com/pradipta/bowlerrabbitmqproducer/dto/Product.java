package com.pradipta.bowlerrabbitmqproducer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private Long price;

//    @Override
//    public String toString() {
//        return "{\n\tname = "+name+",\n\tprice= "+price+"\n}\n";
//    }
}
