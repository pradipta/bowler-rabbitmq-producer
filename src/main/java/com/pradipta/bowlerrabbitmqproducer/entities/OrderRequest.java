package com.pradipta.bowlerrabbitmqproducer.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Entity
public class OrderRequest implements Serializable {
    @Id
    private String orderId;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Order_Product_FK")
    private List<Product> products;
    @OneToOne(targetEntity = Receipient.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "Order_Receipient_FK")
    private Receipient receipient;
}
