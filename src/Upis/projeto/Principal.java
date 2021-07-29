package Upis.projeto;

import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) {

        Triangulo t = new Triangulo(9,7,14);

        System.out.println("Lados do triangulo = " + t);

        DecimalFormat numeroFormatado = new DecimalFormat("##.##");

        System.out.println("Perimetro = " + t.semiPerimetro() * 2);

        System.out.println("Area do triangulo = " + numeroFormatado.format(t.areaTriangulo()) + "cm²");
    }
}
