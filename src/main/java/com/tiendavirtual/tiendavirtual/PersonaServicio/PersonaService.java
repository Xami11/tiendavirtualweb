package com.tiendavirtual.tiendavirtual.PersonaServicio;

import java.util.List;
import com.tiendavirtual.tiendavirtual.Dominio.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersona();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
