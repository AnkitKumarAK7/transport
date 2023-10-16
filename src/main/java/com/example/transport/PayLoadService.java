package com.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayLoadService {

    @Autowired
    PayLoadRepository payLoadRepository;

    public PayLoad addLoad(PayLoad payLoad) {

        return payLoadRepository.save(payLoad);
    }
}
