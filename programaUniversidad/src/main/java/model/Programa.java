package model;

import java.util.ArrayList;
import java.util.Optional;

public record Programa(String codigo, String nombre, ArrayList<Profesor> listaProfesores, ArrayList<Materia> listaMaterias, ArrayList<Estudiante> listaEstudiantes) {

    public Programa(String codigo, String nombre) {
        this(codigo, nombre, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public String ingresarProfesor(Profesor profesor) {
        if (buscarProfesor(profesor.getIdentificador()).isEmpty()) {
            listaProfesores.add(profesor);
            return "El profesor ha sido registrado exitosamente";
        } else {
            return "El profesor ya ha sido registrado";
        }
    }

    public Optional<Profesor> buscarProfesor(String id) {
        return listaProfesores.stream().filter(x -> x.getIdentificador().equals(id)).findFirst();
    }

    public String eliminarProfesor(Profesor profesor) {
        if (buscarProfesor(profesor.getIdentificador()).isPresent()) {
            listaProfesores.remove(profesor);
            return "El profesor ha sido eliminado exitosamente";
        } else {
            return "El profesor no ha sido registrado";
        }
    }

    public String actualizarProfesor(String codigoActual,String nuevoNombre){
        String resultado = "";
        Optional<Profesor> profesorEncontrado = Optional.empty();

        profesorEncontrado = buscarProfesor(codigoActual);
        if(profesorEncontrado.isPresent()){
            profesorEncontrado.get().setNombre(nuevoNombre);
            resultado = "La informacion del profesor fúe actualizada correctamente";
        }else{
            resultado = "El profesor no ha sido registrado";
        }

        return resultado;
    }


    public String ingresarEstudiante(Estudiante estudiante) {
        if (buscarEstudiante(estudiante.getIdentificacion()).isEmpty()) {
            listaEstudiantes.add(estudiante);
            return "El estudiante ha sido registrado exitosamente";
        } else {
            return "El estudiante ya ha sido registrado";
        }
    }

    public Optional<Estudiante> buscarEstudiante(String id) {
        return listaEstudiantes.stream().filter(x -> x.getIdentificacion().equals(id)).findFirst();
    }

    public String eliminarEstudiante(Estudiante estudiante) {
        if (buscarEstudiante(estudiante.getIdentificacion()).isPresent()) {
            listaEstudiantes.remove(estudiante);
            return "El estudiante ha sido eliminado exitosamente";
        } else {
            return "El estudiante no ha sido registrado";
        }
    }

    public String actualizarEstudiante(String codigoActual,String nuevoNombre){
        String resultado = "";
        Optional<Estudiante> estudianteEncontrado = Optional.empty();

        estudianteEncontrado = buscarEstudiante(codigoActual);
        if(estudianteEncontrado.isPresent()){
            estudianteEncontrado.get().setNombre(nuevoNombre);
            resultado = "La informacion del estudiante fúe actualizada correctamente";
        }else{
            resultado = "El estudiante no ha sido registrado";
        }

        return resultado;
    }


}
