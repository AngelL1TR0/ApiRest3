package com.example.controllers;

import com.example.dao.EjemploInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Controlador {

    @Autowired
    EjemploInterfaz interfaz1;

    //Segundo ejercicico
    @Autowired
    EjemploInterfaz interfaz2;

    @GetMapping("/informacion")
    public String obtenerInfo(Model model){
        List<String> listaInformacion = interfaz1.obtenerInformacion();
                model.addAttribute("listaInformacion", listaInformacion);
        return "vista";
    }

    @PostMapping(value = "/guardar")
    public String guardarInformacion(@RequestParam String nuevaInformacion) {
        interfaz1.guardarInformacion(nuevaInformacion);
        return "redirect:/informacion";
    }

    @PostMapping(value = "/eliminar")
    public String eliminarInformacion(@RequestParam int id) {
        boolean eliminado = interfaz1.eliminarInformacion(id);
        if (eliminado) {
            return "redirect:/informacion";
        } else {
            return "error";
        }
    }

    @PostMapping(value = "/editar")
    public String editarInformacion(@RequestParam int id, @RequestParam String nuevaInformacion) {
        boolean actualizado = interfaz1.actualizarInformacion(id, nuevaInformacion);
        if (actualizado) {
            return "redirect:/informacion";
        } else {
            return "error";
        }
    }
}

