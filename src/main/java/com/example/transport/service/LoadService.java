package com.example.transport.service;

import com.example.transport.model.Load;

import java.util.List;

public interface LoadService {

    Load addLoad(Load load);

    List<Load> getLoadsByShipperId(String shipperId);

    Load getLoadById(Long loadId);

    Load updateLoad(Long loadId, Load updatedLoad);

    void deleteLoad(Long loadId);

}
