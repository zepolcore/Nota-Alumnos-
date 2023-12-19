import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

/*
* Escriba un programa que lea las notas de 5 alumnos e informe cuantos tienen nota mayor o iguales a 7 y cuantos menos de
* */
public class Main {
    public static void main(String[] args) {
        Alumnos[] listaAlumnos = new Alumnos[5];
        Scanner teclado = new Scanner(System.in);
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < listaAlumnos.length; i++) {
            Alumnos alumno = new Alumnos();
            System.out.println("Ingrese nombre del alumno " + (i + 1) + ":");
            alumno.setNombre(teclado.nextLine());
            System.out.println("Ingrese calificación del alumno " + (i + 1) + ":");
            alumno.setNota(teclado.nextInt());
            teclado.nextLine(); //salto de línea pendiente después de nextInt()

            listaAlumnos[i] = alumno;

            if (alumno.getNota() >= 7) {
                aprobados++;
                alumno.setEstado("Aprobado");
            } else {
                desaprobados++;
                alumno.setEstado("Desaprobado");
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);

        // Mostrar información de cada alumno
        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }
    }
}
