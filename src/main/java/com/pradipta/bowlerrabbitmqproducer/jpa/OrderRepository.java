package com.pradipta.bowlerrabbitmqproducer.jpa;

import com.pradipta.bowlerrabbitmqproducer.entities.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderRequest, String> {
}
