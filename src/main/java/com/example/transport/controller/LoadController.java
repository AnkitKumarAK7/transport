package com.example.transport.controller;

import com.example.transport.service.LoadService;
import com.example.transport.model.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/load")
public class LoadController {


//    @Autowired
//    private LoadService loadService;   // attribute Injection

    final LoadService loadService;

    /**
     * constructor Injection
     * @param loadService --> beans of load Service
     * @return
     */

    @Autowired
    public LoadController(LoadService loadService){
        this.loadService = loadService;
    }



    @PostMapping
    public ResponseEntity<String> addLoad(@RequestBody Load load) {
        loadService.addLoad(load);
        return ResponseEntity.ok("Load details added successfully");
    }

    @GetMapping
    public List<Load> getLoadsByShipperId(@RequestParam String shipperId) {
        return loadService.getLoadsByShipperId(shipperId);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoadById(@PathVariable Long loadId) {
        Load load = loadService.getLoadById(loadId);
        if (load != null) {
            return ResponseEntity.ok(load);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<Load> updateLoad(@PathVariable Long loadId, @RequestBody Load updatedLoad) {
        Load load = loadService.updateLoad(loadId, updatedLoad);
        if (load != null) {
            return ResponseEntity.ok(load);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<Void> deleteLoad(@PathVariable Long loadId) {
        loadService.deleteLoad(loadId);
        return ResponseEntity.noContent().build();
    }
}
