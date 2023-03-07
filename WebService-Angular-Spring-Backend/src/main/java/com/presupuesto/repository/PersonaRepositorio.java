
package com.presupuesto.repository;


import java.util.List;
import org.springframework.data.repository.Repository;

import com.presupuesto.models.Persona;

public interface PersonaRepositorio extends Repository<Persona, Integer>{
    List<Persona>findAll();
    Persona findOne(int id);
    Persona save(Persona p);
    void delete(Persona p);
}
