package oopmodeling.gradingsystem;

import java.util.ArrayList;

public class GestionNotas {
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregar(Alumno a) {
        alumnos.add(a);
        System.out.println("Alumno agregado");
    }

    public void listar() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a.mostrar());
            }
        }
    }

    public void buscar(String nombre) {
        for (Alumno a : alumnos) {
            if (a.nombre.equalsIgnoreCase(nombre)) {
                System.out.println(a.mostrar());
                return;
            }
        }
        System.out.println("Alumno no encontrado");
    }

    public void eliminar(String nombre) {
        for (Alumno a : alumnos) {
            if (a.nombre.equalsIgnoreCase(nombre)) {
                alumnos.remove(a);
                System.out.println("Alumno eliminado");
                return;
            }
        }
        System.out.println("Alumno no encontrado");
    }
}
