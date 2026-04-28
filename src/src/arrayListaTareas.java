// ===============================
// 1. ListaTareas.java
// ===============================

import java.util.ArrayList;

public class arrayListaTareas {

    public static void main(String[] args)
    {

        ArrayList<String> tareas = new ArrayList<>();

        agregarTarea(tareas, "Estudiar Java");
        agregarTarea(tareas, "Hacer ejercicio");
        agregarTarea(tareas, "Comprar comida");
        agregarTarea(tareas, "Hacer diagramas y flujos");

        mostrarTareas(tareas);

        completarTarea(tareas, "Hacer ejercicio");

        mostrarTareas(tareas);

        System.out.println("Total pendientes: " + tareas.size());
    }

    public static void agregarTarea(ArrayList<String> tareas, String tarea)
    {
        tareas.add(tarea);
    }

    public static void mostrarTareas(ArrayList<String> tareas)
    {
        System.out.println("\nLista de tareas:");
        for (String tarea : tareas)
        {
            System.out.println("- " + tarea);
        }
    }

    public static void completarTarea(ArrayList<String> tareas, String tarea)
    {
        tareas.remove(tarea);
        System.out.println("\nTarea completada: " + tarea);
    }
}