package com.chancay.chancay.service;
//Aqui viene toda la logica del negocio
import com.chancay.chancay.model.Trabajador;
import com.chancay.chancay.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {
    
    @Autowired
    private TrabajadorRepository trabajadorRepository;
    //Vamos a Realizar los métodos CRUD (como método inicial y sencillo)
    //Create-Read-Update-Delete

    //Método para llamar a todos los registros de trabajadores
    public List<Trabajador> getTrabajadores(){
        return trabajadorRepository.findAll();        
    }

    //Método para llamar a un solo trabajador por su id
    public Trabajador getTrabajadorById(Integer id){
        return trabajadorRepository.findById(id).orElse(null);
    }

    //Método para crear un nuevo registro (entidad) trabajador
    public Trabajador createTrabajador(Trabajador trabajador){
        return trabajadorRepository.save(trabajador);
    }

    //Método para actualizar los datos de un trabajador (se necesita su id)
    public Trabajador updateTrabajador(Trabajador trabajador, Integer id){
        //indenttificamos al trabajador por su id
        Trabajador trab = trabajadorRepository.findById(id).orElse(null);
        if(trab != null){//el trabajador existe
            trab.setDni(trabajador.getDni());
            trab.setNombres(trabajador.getNombres());
            trab.setEmail(trabajador.getEmail());
            return trabajadorRepository.save(trab);
        }
        return null;
    }

    public void deleteTrabajador(Integer id){
        trabajadorRepository.deleteById(id);
    }


}
