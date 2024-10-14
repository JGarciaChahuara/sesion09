import java.util.Random;
import java.util.Scanner;

public class ArregloAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar la cantidad de números
        System.out.print("Introduce el número de valores enteros aleatorios (N): ");
        int N = scanner.nextInt();
        
        // Crear un arreglo para almacenar los valores
        int[] numeros = new int[N];
        
        // Llenar el arreglo con valores aleatorios entre 1 y 100
        for (int i = 0; i < N; i++) {
            numeros[i] = random.nextInt(100) + 1;  // Números entre 1 y 100
        }
        
        // Usar StringBuilder para acumular los números separados por comas
        StringBuilder acumulador = new StringBuilder();
        int suma = 0;
        
        // Recorrer el arreglo usando un bucle for
        System.out.println("Recorrido con for:");
        for (int i = 0; i < N; i++) {
            acumulador.append(numeros[i]);
            if (i < N - 1) {
                acumulador.append(", ");
            }
            suma += numeros[i];
        }
        System.out.println("Números en el arreglo: " + acumulador);
        System.out.println("Suma total: " + suma);
        
        // Recorrer el arreglo usando un bucle while
        System.out.println("\nRecorrido con while:");
        int indice = 0;
        acumulador.setLength(0);  // Limpiar el acumulador
        suma = 0;
        
        while (indice < N) {
            acumulador.append(numeros[indice]);
            if (indice < N - 1) {
                acumulador.append(", ");
            }
            suma += numeros[indice];
            indice++;
        }
        System.out.println("Números en el arreglo: " + acumulador);
        System.out.println("Suma total: " + suma);
        
        // Recorrer el arreglo usando un bucle do-while
        System.out.println("\nRecorrido con do-while:");
        acumulador.setLength(0);  // Limpiar el acumulador
        suma = 0;
        indice = 0;
        
        if (N > 0) {
            do {
                acumulador.append(numeros[indice]);
                if (indice < N - 1) {
                    acumulador.append(", ");
                }
                suma += numeros[indice];
                indice++;
            } while (indice < N);
        }
        
        System.out.println("Números en el arreglo: " + acumulador);
        System.out.println("Suma total: " + suma);
        
        scanner.close();
    }
}
