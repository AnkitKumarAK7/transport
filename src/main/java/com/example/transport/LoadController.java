package com.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    LoadService loadService;

    @PostMapping("/add")
    public ResponseEntity<String> addLoad(@RequestBody Load load) {
        loadService.addLoad(load);
        return ResponseEntity.ok("Load details added successfully");
    }

//    @GetMapping("/{shipperId}")
//    public List<Load> getLoadsByShipperId(@RequestParam String shipperId) {
//        return loadService.getLoadsByShipperId(shipperId);
//    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoadById(@PathVariable Long loadId) {
        Load load = loadService.getLoadById(loadId);
        if (load != null) {
            return ResponseEntity.ok(load);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
