package app;

import model.*;

import java.util.ArrayList;

public class Aplicacion {
    Programa programa = new Programa("123", "Ingeniería de Software");


    Profesor p1 = new ProfesorCatedra("Roberto", "123", "magister", (byte) 16, 45, (true));
    Profesor p2 = new ProfesorPlanta("Carlay", "256", "magister", (byte) 22, TipoContrato.MEDIO, (false));
    Profesor p3 = new ProfesorPlanta("Eduardo", "2445", "Especialista", (byte) 8, TipoContrato.MEDIO, (true));

        programa.ingresarProfesor(p1);
        programa.ingresarProfesor(p2);
        programa.ingresarProfesor(p3);


    Materia m1 = new MateriaPractica("M01", "Algoritmos Avanzados", 5, 4, (byte) 1, p1, 2, 3);
    Materia m2 = new MateriaTeorica("M02", "Sistemas Operativos", 4, 3, (byte) 2, p2);
    Materia m3 = new MateriaPractica("M03", "Inteligencia Artificial", 6, 5, (byte) 3, p3, 4, 2);

    // Ingresar materias al programa
    programa.ingresarMateria(m1);
    programa.ingresarMateria(m2);
    programa.ingresarMateria(m3);


    // Crear listas de materias para estudiantes
        ArrayList<Materia> materiasE1 = new ArrayList<>();
    materiasE1.add(m1); // Algoritmos Avanzados
    materiasE1.add(m3); // Inteligencia Artificial

        ArrayList<Materia> materiasE2 = new ArrayList<>();
    materiasE2.add(m2); // Sistemas Operativos
    materiasE2.add(m3); // Inteligencia Artificial

    // Crear instancias de Estudiante con nuevos valores
    Estudiante e1 = new EstudiantePregrado("E01", "Valeria", "54321", 3, materiasE1, false, 4.1);
    Estudiante e2 = new EstudiantePregrado("E02", "Diego", "98765", 2, materiasE2, true, 4.5);

    // Ingresar estudiantes al programa
    programa.ingresarEstudiante(e1);
    programa.ingresarEstudiante(e2);
}
