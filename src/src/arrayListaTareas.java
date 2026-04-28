// ======================================
// ListaTareas.java
// ======================================

import java.util.ArrayList;

public class arrayListaTareas {

    public static void ejecutar() {

        System.out.println("----- LISTA DE TAREAS -----");

        ArrayList<String> tareas = new ArrayList<>();

        agregarTarea(tareas, "Estudiar Java");
        agregarTarea(tareas, "Hacer ejercicio");
        agregarTarea(tareas, "Comprar comida");

        mostrarTareas(tareas);

        completarTarea(tareas, "Hacer ejercicio");

        mostrarTareas(tareas);

        System.out.println("Pendientes: " + tareas.size() + "\n");
    }

    public static void agregarTarea(ArrayList<String> tareas, String tarea) {
        tareas.add(tarea);
    }

    public static void mostrarTareas(ArrayList<String> tareas) {
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }

    public static void completarTarea(ArrayList<String> tareas, String tarea) {
        tareas.remove(tarea);
        System.out.println("Tarea completada: " + tarea);
    }
}