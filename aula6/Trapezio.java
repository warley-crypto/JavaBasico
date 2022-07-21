package aula6;

public class Trapezio implements FormaGeometrica {

    private int altura;
    private int baseMaior;
    private int baseMenor;
    private int ladoA;
    private int ladoB;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getBaseMaior() {
        return baseMaior;
    }
    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }
    public int getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    public int getLadoA() {
        return ladoA;
    }
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    public int getLadoB() {
        return ladoB;
    }
    public void setLadoB(int getLadoB) {
        this.ladoB = ladoB;
    }
        // #region Regras de negócios
        @Override
        public String getNomeFigura() {
            return "Trapezio";
        }
        @Override
        public int getArea() {
            int area = 0;
            area =  ((baseMenor + baseMaior) * altura) / 2;
            return area;
        }
        @Override
        public int getPerimetro() {
            int perimetro = 0;
            perimetro =  baseMenor + baseMaior + ladoA + ladoB;
            return perimetro;
        }
        // #endregion
}
