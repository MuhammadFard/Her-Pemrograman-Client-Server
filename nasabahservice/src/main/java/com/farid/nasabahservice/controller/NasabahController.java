/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farid.nasabahservice.controller;

import com.farid.nasabahservice.entity.Nasabah;
import com.farid.nasabahservice.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/nasabah")
public class NasabahController {
    @Autowired
    private NasabahService nasabahService;
    
    @PostMapping("/")
    public Nasabah saveNasabah(@RequestBody Nasabah nasabah){
        return nasabahService.saveNasabah(nasabah);
    }
    @GetMapping("/{id}")
    public Nasabah findNasabahById(@PathVariable("id")Long nasabahId){
        return nasabahService.findNasabahById(nasabahId);
    }
}
    