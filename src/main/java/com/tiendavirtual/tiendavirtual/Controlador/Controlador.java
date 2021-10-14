package com.tiendavirtual.tiendavirtual.Controlador;

import com.tiendavirtual.tiendavirtual.Dominio.Persona;
import com.tiendavirtual.tiendavirtual.PersonaServicio.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class Controlador {

    @GetMapping({"/","/Login"})
    public String Login(){
        return "Login";
    }

    @GetMapping("/Clientes")
    public String clientes(){
        return "Clientes";
    }

    @GetMapping("/Inicio")
    public String Inicio(){
        return "Inicio";
    }

    @GetMapping("/Usuarios")
    public String Usuarios(){
        return "Usuarios";
    }

    @GetMapping("/Proveedores")
    public String Proveedores(){
        return "Proveedores";
    }

    @GetMapping("/Productos")
    public String Productos(){
        return "Productos";
    }

    @GetMapping("/Reportes")
    public String Reportes(){
        return "Reportes";
    }

    @GetMapping("/TotalVentasClientes")
    public String TotalVentas(){
        return "TotalVentasClientes";
    }

    @GetMapping("/ListaUsuarios")
    public String Lista(){
        return "ListaUsuarios";
    }

    
}
