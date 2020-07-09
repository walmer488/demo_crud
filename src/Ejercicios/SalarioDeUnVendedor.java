package Ejercicios;

import java.util.Scanner;

public class SalarioDeUnVendedor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de ventas");
        double monto = Double.valueOf(leer.nextLine());
        double Salario = 0.0;
        if (monto >= 3000) {
            Salario = 300 + (monto * 0.10);
        } else if (monto >= 1000) {
            Salario = 300 + (monto * 0.08);
        } else {
            Salario = 300 + (monto * 0.05);
        }
        double Descuento =Salario * 0.10;
        double SalarioTotal = Salario - Descuento;
        System.out.println("El salario total del empleado es :" + SalarioTotal);

    }
}
