
package com.presupuesto.service;

import java.util.List;

import com.presupuesto.models.Persona;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}
