package salud;
import java.util.*;

public class persona {
    private String tipoDocumento, nombre, apellido, sexo;
    private double peso, estatura,pesoActual;
    private int documento, edad;

    Scanner scanner = new Scanner(System.in);

    public persona() {}


    public persona(String tipoDocumento, String nombre, String apellido, String sexo, double peso, double estatura, double pesoActual, int documento, int edad) 
    {
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.pesoActual = pesoActual;
        this.documento = documento;
        this.edad = edad;
    }


    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    
    public void pedirDatos()
    {
        System.out.println("\nPERSONA");
        
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

    public String calcularImc()
    {
        String imc = "";
        System.out.println("\nIMC");

        pesoActual = peso / (Math.pow(estatura, 2));
        System.out.println("\nPeso actual: " + pesoActual);

        if (pesoActual < 20) 
        {
            imc = "peso bajo";
        }
        else if (pesoActual >= 20 && pesoActual < 25)
        {
            imc = "El peso es ideal";
        }
        else if (pesoActual >= 25)
        {
            imc = "tiene sobrepeso";
        }
        System.out.println(imc);
        return imc;
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