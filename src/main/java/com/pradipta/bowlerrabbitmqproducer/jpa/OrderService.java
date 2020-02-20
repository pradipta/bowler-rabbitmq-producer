package com.pradipta.bowlerrabbitmqproducer.jpa;

import com.pradipta.bowlerrabbitmqproducer.entities.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void saveOrder(OrderRequest orderRequest){
        orderRepository.save(orderRequest);
    }
}
