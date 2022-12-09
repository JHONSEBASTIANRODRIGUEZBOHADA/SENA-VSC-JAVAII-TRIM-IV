package figurasGeometricas;

public class paralelogramo extends figuras
{
    private double ladoA,ladoD,ladoB,ladoH,areaTotal,perimetroTotal;
    

    public paralelogramo() {
        
    }

    public paralelogramo(double ladoA,double ladoD, double ladoB, double ladoH, double areaTotal, double perimetroTotal) 
    {
        this.ladoA=ladoA;
        this.ladoA=ladoD;
        this.ladoA=ladoB;
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
        areaTotal = (ladoB * ladoH);
        System.out.println("El area del paralelogramo es: " + areaTotal);
    }

    public void calcularPerimetro() 
    {
        perimetroTotal = 2*(ladoA + ladoB);
        System.out.println("El perimetro del paralelogramo es: " + perimetroTotal);
    }  
}
