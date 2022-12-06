package principal;
import salud.empleado;

public class inicio {
    public static void main(String[] args) 
    {
        empleado empleado = new empleado();

        empleado.pedirDatos();
        empleado.mostrarPersona();
        empleado.calcularImc();
        empleado.mayorEdad();
        
        empleado.InformacionEmpleado();
        empleado.calcularHonorarios();
        empleado.mostrarEmpleado();
    }   
}