package com.example.transport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayLoadRepository extends JpaRepository<PayLoad,Long> {

}
