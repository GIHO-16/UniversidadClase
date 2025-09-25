package model;

import java.util.ArrayList;

public record Programa(String Codigo, String Nombre, ArrayList<Profesor> profesores, ArrayList<Materia> materias, ArrayList<Estudiante> estudiantes) {



}
