
package com.presupuesto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.presupuesto.models.Unidad;
import com.presupuesto.service.UnidadService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/unidad"})
public class UnidadController {
    
    @Autowired
    UnidadService service;
    
    @GetMapping
    public List<Unidad>listar(){
        return service.listar();
    }
    @PostMapping
    public Unidad agregar(@RequestBody Unidad p){
        return service.add(p);
    }
    @GetMapping(path = {"/{id}"})
    public Unidad listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    @PutMapping(path = {"/{id}"})
    public Unidad editar(@RequestBody Unidad p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping(path = {"/{id}"})
    public Unidad delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}
