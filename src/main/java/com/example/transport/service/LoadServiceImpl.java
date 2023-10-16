package com.example.transport.service;

import com.example.transport.repository.LoadRepository;
import com.example.transport.model.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {

//    @Autowired
//    LoadRepository loadRepository;   // Attribute Injection

    final LoadRepository loadRepository;

    /**
     * constructor Injection
     * @param loadRepository --> beans of load Repository
     */
    public LoadServiceImpl(LoadRepository loadRepository){
        this.loadRepository = loadRepository;
    }


    @Override
    public Load addLoad(Load load) {
        return loadRepository.save(load);
    }

    @Override
    public Load getLoadById(Long loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    @Override
    public Load updateLoad(Long loadId, Load updatedLoad) {
        if (loadRepository.existsById(loadId)) {
            updatedLoad.setId(loadId);
            return loadRepository.save(updatedLoad);
        }
        return null;
    }

    @Override
    public void deleteLoad(Long loadId) {
        loadRepository.deleteById(loadId);
    }

    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }
}
