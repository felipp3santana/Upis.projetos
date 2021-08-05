package Upis.projeto;

import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {

        //exibir(new Triangulo(3, 4, 5));
        //exibir(new Retangulo(2, 4));

        Quadrado q = new Quadrado(2);
        System.out.println(q);
        System.out.println("Perimetro = " + q.perimetro());
        exibir(q);

    }

    private static void exibir(IFiguraBidimensional t){
        DecimalFormat numeroFormatado = new DecimalFormat("##.##");
        System.out.println("Area = " + numeroFormatado.format(t.area()) + "cm²");
    }

}
