package figurasGeometricas;
import java.util.*;

public class octagono extends figuras
{
    private double ladoL,ladoA,apotema,areaTotal,perimetroTotal;

    Scanner scanner = new Scanner(System.in);

    
    public octagono() {}


    public octagono(double ladoL,double ladoA, double apotema, double areaTotal, double perimetroTotal)
    {
        this.ladoA=ladoL;
        this.ladoA=ladoA;
        this.apotema=apotema;
        this.ladoA=areaTotal;
        this.ladoA=perimetroTotal;
    } 


    public double getLadoL() {
        return ladoL;
    }

    public void setLadoL(double ladoL) {
        this.ladoL = ladoL;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getApotema() {
        return apotema;
    }


    public void setApotema(double apotema) {
        this.apotema = apotema;
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


    public void calcularPerimetro() 
    {
        final double nLados = 8; 
        perimetroTotal = nLados * ladoL;
        System.out.println("El perimetro del octagono es: " + perimetroTotal);
    }

    
    public void calcularArea() 
    {
        areaTotal = (perimetroTotal * apotema) / 2;
        System.out.println("El area del octagono es " + areaTotal);
    }
}