package Upis.projeto;

public class Circulo implements IFiguraBidimensional {

    private double diametro;
    private final double pi = 3.14;

    public Circulo(double diametro) {
        if(!condicaoExistencia(diametro)) {
            throw new RuntimeException("Impossivel criar circulo!");
        }
        this.diametro = diametro;
    }

    private boolean condicaoExistencia(double d){
        return d > 0;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        if(condicaoExistencia(diametro))
            this.diametro = diametro;
    }

    public double raio() {
        return diametro / 2;
    }

    @Override
    public double perimetro() {
        double r = raio();
        return (2 * pi) * r;
    }

    @Override
    public double area() {
        double r = raio();
        return (r * r) * pi;
    }

    @Override
    public String toString() {
        return "Diametro do circulo = " + this.diametro;
    }
}
