package Upis.projeto;

import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {

        //exibir(new Triangulo(3, 4, 5));
        //exibir(new Retangulo(2, 4));

        Retangulo f = new Retangulo(3,4);

        //Quadrado q = new Quadrado(2);
        //System.out.println(q);
        //System.out.println("Perimetro = " + q.perimetro());
        //exibir(q);

        //Circulo c = new Circulo(1);
        //System.out.println(c);
        //System.out.println("Raio = " + c.raio());
        //System.out.println("Perimetro = " + c.perimetro());
        exibir(f);

        f.setLado(4,5);

        exibir(f);
    }

    private static void exibir(IFiguraBidimensional t){
        //DecimalFormat numeroFormatado = new DecimalFormat("##.##");
        //System.out.println("Area = " + numeroFormatado.format(t.area()));
        System.out.println(t);
    }

}
