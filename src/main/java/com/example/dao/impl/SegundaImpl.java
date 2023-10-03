package com.example.dao.impl;

import com.example.dao.EjemploInterfaz;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("service2")
public class SegundaImpl implements EjemploInterfaz {
    @Override
    public List<String> obtenerInformacion() {
        return null;
    }

    @Override
    public void guardarInformacion(String informacion) {

    }

    @Override
    public boolean eliminarInformacion(int id) {
        return false;
    }

    @Override
    public boolean actualizarInformacion(int id, String nuevaInformacion) {
        return false;
    }
}
