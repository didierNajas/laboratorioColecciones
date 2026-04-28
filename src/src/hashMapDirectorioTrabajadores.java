
// 3. DirectorioTrabajadores.java


import java.util.HashMap;
import java.util.Map;

public class hashMapDirectorioTrabajadores
{

    public static void main(String[] args)
    {

        HashMap<String, Double> trabajadores = new HashMap<>();

        agregarTrabajador(trabajadores, "Carlos", 1800000);
        agregarTrabajador(trabajadores, "Ana", 2200000);
        agregarTrabajador(trabajadores, "Luis", 2000000);

        mostrarTrabajadores(trabajadores);

        actualizarSalario(trabajadores, "Ana", 2500000);

        mostrarTrabajadores(trabajadores);

        calcularPromedio(trabajadores);
    }

    public static void agregarTrabajador(HashMap<String, Double> trabajadores, String nombre, double salario)
    {
        trabajadores.put(nombre, salario);
    }

    public static void mostrarTrabajadores(HashMap<String, Double> trabajadores)
    {
        System.out.println("\nTrabajadores:");

        for (Map.Entry<String, Double> dato : trabajadores.entrySet())
        {
            System.out.println(dato.getKey() + " -> $" + dato.getValue());
        }
    }

    public static void actualizarSalario(HashMap<String, Double> trabajadores,
                                         String nombre,
                                         double nuevoSalario)
    {
        trabajadores.put(nombre, nuevoSalario);
        System.out.println("\nSalario actualizado de " + nombre);
    }

    public static void calcularPromedio(HashMap<String, Double> trabajadores)
    {

        double suma = 0;

        for (double salario : trabajadores.values())
        {
            suma += salario;
        }

        double promedio = suma / trabajadores.size();

        System.out.println("\nSalario promedio: $" + promedio);
    }
}