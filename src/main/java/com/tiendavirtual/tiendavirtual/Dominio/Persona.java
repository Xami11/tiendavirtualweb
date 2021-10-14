package com.tiendavirtual.tiendavirtual.Dominio;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cedula_clientes")
    private long Cedula;
    @Column(name="direccion_clientes")
    private String Direccion;
    @Column(name="email_clientes")
    private String Email;
    @Column(name="nombre_clientes")
    private String Nombre;
    @Column(name="telefono_clientes")
    private String Telefono;

    public Persona(){

    }

    

    

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long cedula) {
        Cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    
}
