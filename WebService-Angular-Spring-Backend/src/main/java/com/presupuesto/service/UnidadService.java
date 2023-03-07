
package com.presupuesto.service;

import java.util.List;

import com.presupuesto.models.Unidad;

public interface UnidadService {
    List<Unidad>listar();
    Unidad listarId(int id);
    Unidad add(Unidad p);
    Unidad edit(Unidad p);
    Unidad delete(int id);
}
