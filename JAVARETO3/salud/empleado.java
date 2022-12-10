package salud;
import java.util.*;

public class empleado extends persona
{
    private String cargo, departamento;
    private double valorHora, honorarios;
    private int horasTrabajadas;
    Scanner scanner = new Scanner(System.in);
    

    public empleado() {}


    public empleado(String tipoDocumento, String nombre, String apellido, String sexo, double peso, double estatura, double pesoActual, int documento, int edad   , String cargo, String departamento, double valorHora, double honorarios, int horasTrabajadas) 
    {
        super(tipoDocumento, nombre, apellido, sexo, peso, estatura, pesoActual, documento, edad);
        this.cargo = cargo;   
        this.departamento = departamento;   
        this.valorHora = valorHora;   
        this.honorarios = honorarios;   
        this.horasTrabajadas = horasTrabajadas;   
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public double getValorHora() {
        return valorHora;
    }


    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHonorarios() {
        return honorarios;
    }


    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }

    public void InformacionEmpleado() 
    {
        System.out.println("\nINFORMACION EMPLEADO");
        System.out.println("\nIngrese el cargo (Jefe),(Gerente),(Supervisor),otro");
        cargo = scanner.next();  
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el valor(dinero) por hora");
        valorHora = scanner.nextDouble();
        System.out.println("Ingrese el departamento en el cual reside");
        departamento = scanner.next();  
    }


    public void calcularHonorarios() 
    {
        final double reteica = 0.966;
        honorarios = (valorHora * horasTrabajadas) - reteica / (valorHora * horasTrabajadas);
        System.out.println("\nEl valor(dinero) a pagar es: " + honorarios);
    }

    public void mostrarEmpleado() 
    {
        System.out.println("\nEMPLEADO");
        System.out.print("\nTipo de documento (C.C) o (T.I): " + getTipoDocumento() + "\nNumero documento (Identificacion): " + getDocumento() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nCargo: " + cargo + "\nHoras trabajadas: " + horasTrabajadas + "\nValor(dinero) hora: " + valorHora + "\nTotal a pagar: " + honorarios);
    }
}
