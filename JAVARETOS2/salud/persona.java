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

        System.out.println("\nIngrese el tipo de documento");
        tipoDocumento = scanner.next();
        System.out.println("Ingrese el numero de documento");
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
        System.out.println("Ingrese el sexo");
        sexo = scanner.next();
    }

    public void mostrarPersona()
    {
        System.out.println("\nDATOS");

        System.out.println("\nTipo de documento: " + tipoDocumento);
        System.out.println("Numero documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    public void calcularImc()
    {
        System.out.println("\nIMC");

        pesoActual = peso / (Math.pow(estatura, 2));
        System.out.println("\nPeso actual: " + pesoActual);

        if (pesoActual < 20) 
        {
            System.out.println("\nEl peso esta por debajo de lo ideal");
        }
        else if (pesoActual >= 20 && pesoActual < 25)
        {
            System.out.println("El peso es ideal");
        }
        else if (pesoActual >= 25)
        {
            System.out.println("Tiene sobrepeso");
        }

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