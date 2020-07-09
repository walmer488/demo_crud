package Ejercicios;

import java.util.Scanner;


public class MasaCorporal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese le peso en Kg");
        double pesoPersona = Double.valueOf(leer.nextLine());
        System.out.println("Ingrese la estatura");
        double estaturaPersona = Double.valueOf(leer.nextLine());

        double CalculoIMC = pesoPersona / (estaturaPersona * estaturaPersona);
        String mensaje = "";
        if (CalculoIMC >= 40) {
            mensaje = "Obesidad grado III \nExtrema o Mórbida Riesgo relativo extremedamente alto para desarrollar enfermedades cardiovasculares";
        } else if (CalculoIMC >= 30) {
            mensaje = "Obesidad grado II \nRiesgo relativo muy alto para desarrollar enfermedades cardiovasculares";
        } else if (CalculoIMC >= 27) {
            mensaje = "Obesidad grado I \nRiesgo relativo alto para desarrollar enfermedades cardiovasculares";
        } else if (CalculoIMC >= 25) {
            mensaje = "Sobrepeso";
        } else if (CalculoIMC >= 18) {
            mensaje = "Normal";
        } else if (CalculoIMC >= 1) {
            mensaje = "Peso bajo. Necesita valorar signos de desnutrición";
        } else {
            mensaje = "Dato erroneo";
        }
        System.out.println("El IMC de la persona es: "+mensaje);
    }
}
