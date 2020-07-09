package demo_crud;

import java.util.Scanner;

public class MonedasYBilletes {
    public class BilletesYMonedas {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digita la duracion de la llamada en minutos: ");
        double duracion = Double.parseDouble(sc.nextLine());
        sc.close();

        double total = calcTotal(duracion);
        System.out.println("\nTotal: " + String.format("%.2f", total));
        String mensaje = calcBilletes(total) + calcMonedas(total);
        System.out.println(mensaje.replaceAll(", $", ".") + "\n");
    }

    private static double calcTotal(double duracion) {
        return (duracion <= 3) ? 0.2 : (duracion - 3) * 0.05 + 0.2;
    }

    private static String calcBilletes(double total) {
        String mensaje = "";
        int bill20 = (int) Math.floor( total / 20 );
        int bill10 = (int) Math.floor( total % 20 / 10);
        int bill5  = (int) Math.floor( total % 10 / 5);
        int bill1  = (int) Math.floor( total % 5 );

        mensaje = (bill20 == 1) ? "1 billete de 20 dolares, " : "" ;
        mensaje += (bill20 >  1) ? bill20 + " billetes de 20 dolares, " : "";
        mensaje += (bill10 ==  1) ?  "1 billete de 10 dolares, " : "";
        mensaje += (bill10 >  1) ? bill10 + " billetes de 10 dolares, " : "";
        mensaje += (bill5 ==  1) ? "1 billete de 5 dolares, " : "";
        mensaje += (bill5 >  1) ? bill5 + " billetes de 5 dolares, " : "";
        mensaje += (bill1 == 1) ? "1 billete de 1 dolar, " : "";
        mensaje += (bill1 >  1) ? bill1 + " billetes de 1 dolar, " : "";
        
        return mensaje;
    }

    private static String calcMonedas(double total) {
        String mensaje = "";
        int m25 = (int) Math.floor( total % 1 / 0.25 );
        int m10 = (int) Math.floor( total % 0.25 / 0.10);
        int m5  = (int) Math.floor( total % 0.10 / 0.5);
        int m1  = (int) Math.floor( total % 0.5 );

        mensaje = (m25 == 1) ? "1 moneda de 25 centavos, " : "" ;
        mensaje += (m25 >  1) ? m25 + " monedas de 25 centavos, " : "";
        mensaje += (m10 ==  1) ?  "1 moneda de 10 centavos, " : "";
        mensaje += (m10 >  1) ? m10 + " monedas de 10 centavos, " : "";
        mensaje += (m5 ==  1) ? "1 moneda de 5 centavos, " : "";
        mensaje += (m5 >  1) ? m5 + " monedas de 5 centavos, " : "";
        mensaje += (m1 == 1) ? "1 moneda de 1 centavo, " : "";
        mensaje += (m1 >  1) ? m1 + " monedas de 1 centavos, " : "";

        return mensaje;
    }
}
