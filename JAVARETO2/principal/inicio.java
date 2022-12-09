package principal;
import salud.persona;

public class inicio {
    public static void main(String[] args) 
    {
        double imc;
        persona persona = new persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        imc = persona.calcularImc();
        persona.mayorEdad();

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
    }   
}
