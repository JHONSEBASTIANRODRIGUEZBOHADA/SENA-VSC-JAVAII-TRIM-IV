package principal;
import salud.empleado;

public class inicio {
    public static void main(String[] args) 
    {
        double imc;
        empleado empleado = new empleado();

        empleado.pedirDatos();
        empleado.mostrarPersona();
        imc = empleado.calcularImc();
        empleado.mayorEdad();

        if (imc < 20) 
        {
            System.out.println("PESOBAJO");
        }
        else if (imc >= 20 && imc < 25)
        {
            System.out.println("PESOIDEAL");
        }
        else if (imc >= 25)
        {
            System.out.println("SOBREPESO");
        }
        
        empleado.InformacionEmpleado();
        empleado.calcularHonorarios();
        empleado.mostrarEmpleado();
    }   
}
