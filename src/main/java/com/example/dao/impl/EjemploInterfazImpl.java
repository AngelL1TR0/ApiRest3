package com.example.dao.impl;

import com.example.dao.EjemploInterfaz;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("service")
public class EjemploInterfazImpl implements EjemploInterfaz {

    private List<String> lista = new ArrayList<>();

    @Override
    public List<String> obtenerInformacion() {
        return lista;
    }

    @Override
    public void guardarInformacion(String informacion) {
        lista.add(informacion);
    }

    @Override
    public boolean eliminarInformacion(int id) {
        if (id >= 0 && id < lista.size()) {
            lista.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarInformacion(int id, String nuevaInformacion) {
        if (id >= 0 && id < lista.size()) {
            lista.set(id, nuevaInformacion);
            return true;
        }
        return false;
    }
}
