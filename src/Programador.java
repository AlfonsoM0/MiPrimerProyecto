public class Programador extends Persona{
    private int Edad;

    public Programador(String nombre, String apellido, int DNI, int edad) {
        super(nombre, apellido, DNI);
        Edad = edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    void saludar() {
        System.out.println("Hola! Soy " + this.getNombre() + ", soy programdador.");
    }
}
