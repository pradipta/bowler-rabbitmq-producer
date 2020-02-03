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
public class OrderRequest {
    private String orderId;
    private List<Product> products;
    private Receipient receipient;

//    @Override
//    public String toString() {
//        return "Orderid: "+this.orderId+"\n\"products\":"+products+"\n"+receipient;
//    }
}
