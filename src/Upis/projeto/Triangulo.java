package Upis.projeto;

public class Triangulo {

        private int ladoA;
        private int ladoB;
        private int ladoC;

    private boolean condicaoExistencia(int a, int b, int c){
            return Math.abs(b - c) <  a && a < b + c;
    }

    public Triangulo() {
        this.ladoA = 1;
        this.ladoB = 1;
        this.ladoC = 1;
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        if(!condicaoExistencia(ladoA,ladoB,ladoC)){
            throw new RuntimeException("Impossivel criar triangulo!");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        if (condicaoExistencia(ladoA, this.ladoB, this.ladoC)){
            this.ladoA = ladoA;
        }
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        if (condicaoExistencia(this.ladoA, ladoB, this.ladoC)){
            this.ladoB = ladoB;
        }
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        if (condicaoExistencia(this.ladoA, this.ladoB, ladoC)){
            this.ladoC = ladoC;
        }
    }

    public double semiPerimetro(){
        return ((ladoA + ladoB + ladoC) / 2);
    }

    public double areaTriangulo(){
        double p = semiPerimetro();
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    @Override
    public String toString() {
        return "(" + this.ladoA + ", " +  this.ladoB + ", " +  this.ladoC + ")";
    }
}
