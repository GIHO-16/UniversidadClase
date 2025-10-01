package model;


import java.util.ArrayList;

import java.util.Optional;

public record Programa(String Codigo, String Nombre, ArrayList<Profesor> profesores, ArrayList<Materia> listaMaterias, ArrayList<Estudiante> estudiantes) {


    public String ingresarMateria(Materia materia){
        if(buscarMateria(materia.getCodigo()).isEmpty()){
            listaMaterias.add(materia);
            return "El Materia se registro exitosamente: ";
        }else{
            return "El Materia ya existe: ";
        }
    }

    public Optional<Materia> buscarMateria(String id){
        return listaMaterias.stream().filter(x -> x.getCodigo().equals(id)).findFirst();
    }

    public String eliminarMateria(Materia materia){
        if(buscarMateria(materia.getCodigo()).isPresent()){
            listaMaterias.remove(materia);
            return "El Materia se ha eliminado exitosamente: ";
        }else{
            return "El Materia ya existe: ";
        }
    }
    public String actualizarMateria(String codigoActual, String nuevoNombre){
        String resultado= "";
        Optional<Materia> materiaEncontrada = buscarMateria(codigoActual);
        if(materiaEncontrada.isPresent()){
            materiaEncontrada.get().setNombre(nuevoNombre);
            resultado="la materia fue actualizada correctamente: ";
        }else{
            resultado = "la materia no existe: ";
        }
        return resultado;
    }


}
