package Ejercicios;

import java.util.Scanner;

public class DepreciacionMaquinaria {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Detalles de la maquina:");
        System.out.print("Nombre: ");
        String maquina = sc.nextLine();
        System.out.print("Costo: ");
        double costo = Double.parseDouble(sc.nextLine());
        System.out.print("Periodo de Depreciacion (years): ");
        double vidaUtil = Double.parseDouble(sc.nextLine());
        sc.close();

        System.out.println("Detalles para maquina: " + maquina);
        calcDepreciacion(costo, vidaUtil);
    }

    public static void calcDepreciacion(double costo, double vidaUtil) {
        double factorDeDepreciacion = (vidaUtil * (vidaUtil + 1)) / 2;
        int year = 1;
        while (vidaUtil > 0) {
            double porcentajeDeDepreciacion = vidaUtil / factorDeDepreciacion;
            System.out.println("Año: " + year++ + ", Depreciacion: " + (costo * porcentajeDeDepreciacion));
            vidaUtil--;
        }
    }
}
