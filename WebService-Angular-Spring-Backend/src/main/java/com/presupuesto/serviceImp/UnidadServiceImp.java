
package com.presupuesto.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.presupuesto.models.Unidad;
import com.presupuesto.repository.UnidadRepository;
import com.presupuesto.service.UnidadService;

@Service
public class UnidadServiceImp implements UnidadService{
    @Autowired
    private UnidadRepository repositorio;
    
    @Override
    public List<Unidad> listar() {
        return repositorio.findAll();
    }

    @Override
    public Unidad listarId(int id) {
        return repositorio.findOne(id);
    }

    @Override
    public Unidad add(Unidad p) {
        return repositorio.save(p);
    }

    @Override
    public Unidad edit(Unidad p) {
        return repositorio.save(p);
    }

    @Override
    public Unidad delete(int id) {
    	Unidad p=repositorio.findOne(id);
        if(p!=null){
            repositorio.delete(p);
        }
       return p;
    }
    
    
    
}
