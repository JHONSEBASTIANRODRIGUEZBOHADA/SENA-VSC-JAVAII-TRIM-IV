package principal;
import salud.persona;

public class inicio {
    public static void main(String[] args) 
    {
        persona persona = new persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }   
}