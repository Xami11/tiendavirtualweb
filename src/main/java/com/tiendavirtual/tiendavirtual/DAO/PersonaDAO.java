package com.tiendavirtual.tiendavirtual.DAO;

import com.tiendavirtual.tiendavirtual.Dominio.Persona;

import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
