package com.chancay.chancay.model;

import jakarta.persistence.*;

@Entity
@Table(name = "trabajador")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //int = 9 caracteres numericos enteros
    //long= 18 caracteres numericos enteros
    
    @Column(length = 100, nullable = false)
    private String nombres;//Nombre y apellidos

    @Column(nullable = false, unique = true)
    private int dni;

    @Column(length = 50, nullable = false)
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    


}
