package figurasGeometricas;

public class trapecio extends figuras
{
    private double ladoA,ladoD,ladoB,ladoC,ladoH,areaTotal,perimetroTotal;


    public trapecio(){}


    public trapecio(double ladoA,double ladoD, double ladoB, double ladoC, double ladoH, double areaTotal, double perimetroTotal) 
    {
        this.ladoA=ladoA;
        this.ladoA=ladoD;
        this.ladoA=ladoB;
        this.ladoA=ladoC;
        this.ladoA=ladoH;
        this.ladoA=areaTotal;
        this.ladoA=perimetroTotal;
    }


    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoH() {
        return ladoH;
    }

    public void setLadoH(double ladoH) {
        this.ladoH = ladoH;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getPerimetroTotal() {
        return perimetroTotal;
    }

    public void setPerimetroTotal(double perimetroTotal) {
        this.perimetroTotal = perimetroTotal;
    }


    public void calcularArea() 
    {
        areaTotal = (ladoA+ladoB) * ladoH / 2;
        System.out.println("El area del trapecio es " + areaTotal);
    }


    public void calcularPerimetro() 
    {
        perimetroTotal = ladoA + ladoB + ladoC + ladoD;
        System.out.println("El perimetro del trapecio es: " + perimetroTotal);
    }
}