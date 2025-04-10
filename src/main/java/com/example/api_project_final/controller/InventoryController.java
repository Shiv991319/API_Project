
package com.example.api_project.controller;

import com.example.api_project.dto.InventoryRequestDTO;
import com.example.api_project.dto.InventoryResponseDTO;
import com.example.api_project.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public ResponseEntity<InventoryResponseDTO> createInventory(@RequestBody InventoryRequestDTO dto) {
        return ResponseEntity.status(201).body(inventoryService.createInventory(dto));
    }




}