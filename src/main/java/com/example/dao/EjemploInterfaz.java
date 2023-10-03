package com.example.dao;

import java.util.List;

public interface EjemploInterfaz {
    List<String> obtenerInformacion();
    void guardarInformacion(String informacion);
    boolean eliminarInformacion(int id);
    boolean actualizarInformacion(int id, String nuevaInformacion);
}
