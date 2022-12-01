package principal;
import salud.empleado;
import salud.persona;
import java.util.*;

public class inicio {
    public static void main(String[] args) 
    {
        persona persona = new persona();
        empleado empleado = new empleado();
        Scanner scanner = new Scanner(System.in);

        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        
        System.out.println("\nEMPLEADO");
        System.out.println("\nIngrese el tipo de documento");
        empleado.setTipoDocumento(scanner.next());

        System.out.println("\nIngrese el numero de documento");
        empleado.setDocumento(scanner.nextInt());

        System.out.println("\nIngrese el nombre");
        empleado.setNombre(scanner.next());

        System.out.println("\nIngrese el apellido");
        empleado.setApellido(scanner.next());

        System.out.println("\nIngrese el cargo");
        empleado.setCargo(scanner.next());

        System.out.println("\nIngrese las horas trabajadas");
        empleado.setHorasTrabajadas(scanner.nextInt());

        System.out.println("\nIngrese el valor por hora");
        empleado.setValorHora(scanner.nextDouble());

        empleado.calcularHonorarios();

        empleado.mostrarInformacionEmpleado();
        scanner.close();
    }   
}