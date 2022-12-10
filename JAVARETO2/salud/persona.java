package salud;
import java.util.*;

public class persona {
    private String tipoDocumento, nombre, apellido, sexo;
    private double peso, estatura,pesoActual;
    private int documento, edad;

    Scanner scanner = new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("\nPESO");

        System.out.println("\nIngrese el tipo de documento (C.C) o (T.I)");
        tipoDocumento = scanner.next();
        System.out.println("Ingrese el numero de documento (Identificacion)");
        documento = scanner.nextInt();
        System.out.println("ingrese el nombre");
        nombre = scanner.next();
        System.out.println("Ingrese el apellido");
        apellido = scanner.next();
        System.out.println("Ingrese el peso en kg");
        peso = scanner.nextDouble();
        System.out.println("Ingrese la estatura en m");
        estatura = scanner.nextDouble();
        System.out.println("Ingrese la edad");
        edad = scanner.nextInt();
        System.out.println("Ingrese el sexo (Masculino) o (Femenino)");
        sexo = scanner.next();
    }

    public void mostrarPersona()
    {
        System.out.println("\nDATOS");

        System.out.println("\nTipo de documento (C.C) o (T.I): " + tipoDocumento);
        System.out.println("Numero documento (Identificacion): " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso en kg: " + peso);
        System.out.println("Estatura en m: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo (Masculino) o (Femenino): " + sexo);
    }

    public double calcularImc()
    {
        System.out.println("\nIMC");

        pesoActual = peso / (Math.pow(estatura, 2));
        System.out.println("El peso actual es: " + pesoActual);

        return pesoActual;
    }

    public void mayorEdad() 
    {
        if (edad <= 0)
        {
            System.out.println("Valor incorrecto");
        }
        else if (edad >= 18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
    }
}
