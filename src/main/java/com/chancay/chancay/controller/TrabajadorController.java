package com.chancay.chancay.controller;

import com.chancay.chancay.model.Trabajador;
import com.chancay.chancay.service.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")//ruta o path
public class TrabajadorController {
    
    @Autowired
    private TrabajadorService trabajadorService;

    //Obtener a todos los trabajadores
    @GetMapping
    public List<Trabajador> getTrabajadores(){
        return trabajadorService.getTrabajadores();
    }

    //Obtener a un trabajador por su id
    @GetMapping("/{id}")
    public ResponseEntity<Trabajador> getTrabajadorById(@PathVariable Integer id){
        Trabajador trab = trabajadorService.getTrabajadorById(id);
        if (trab !=null){
            return ResponseEntity.ok(trab);
        }
        return ResponseEntity.notFound().build();
    }

    //Crear a un trabajador
    @PostMapping
    public Trabajador createTrabajador(@RequestBody Trabajador trabajador){
        return trabajadorService.createTrabajador(trabajador);
    }

    //Metodo para actualizar un trabajador
    @PutMapping("/{id}")
    public ResponseEntity<Trabajador> updateTrabajador
    (@RequestBody Trabajador trabajador, @PathVariable Integer id){
        Trabajador trab = trabajadorService.updateTrabajador(trabajador, id);
        if(trab != null){
            return ResponseEntity.ok(trab);
        }
        return ResponseEntity.notFound().build();
    }

    //Método para eliminar un trabajador por su id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrabajador(@PathVariable Integer id){
        trabajadorService.deleteTrabajador(id);
        return ResponseEntity.ok().build();
    }
}
