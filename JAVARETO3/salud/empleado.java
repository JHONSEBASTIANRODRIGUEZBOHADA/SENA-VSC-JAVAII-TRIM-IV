package salud;

public class empleado extends persona
{
    private String cargo, departamento;
    private double valorHora, honorarios;
    private int horasTrabajadas;
    

    public void empleado() {}


    public void empleado(String cargo, String departamento, double valorHora, double honorarios, int horasTrabajadas) 
    {
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


    public void calcularHonorarios() 
    {
        final double reteica = 0.966;
        honorarios = (valorHora * horasTrabajadas) * reteica;
    }

    public void mostrarInformacionEmpleado() 
    {
        System.out.println("\nEMPLEADO");
        System.out.print("\nTipo de documento: " + getTipoDocumento() + "\nNumero documento: " + getDocumento() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nCargo: " + getCargo() + "\nHoras trabajadas: " + getHorasTrabajadas() + "\nValor hora: " + getValorHora() + "\nTotal a pagar: " + getHonorarios());
    }
}