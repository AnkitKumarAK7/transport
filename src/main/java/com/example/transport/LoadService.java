package com.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadService {

    @Autowired
    LoadRepository loadRepository;

    public Load addLoad(Load load) {
        return loadRepository.save(load);
    }

    public Load getLoadById(Long loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    public Load updateLoad(Long loadId, Load updatedLoad) {
        if (loadRepository.existsById(loadId)) {
            updatedLoad.setId(loadId);
            return loadRepository.save(updatedLoad);
        }
        return null;
    }

    public void deleteLoad(Long loadId) {
        loadRepository.deleteById(loadId);
    }

//    public List<Load> getLoadsByShipperId(String shipperId) {
//        return loadRepository.findByShipperId(shipperId);
//    }
}
