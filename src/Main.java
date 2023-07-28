public class Main {
    public static void main(String[] args) {

        // Automovil
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil("Renault", "Clio", 2020);

        System.out.println("Auto 1: " + auto1.getMarca());
        System.out.println("Auto 1: " + auto2.getModelo());

        // Auto Deportivo
        AutoDeportivo AutoDeportivo1 = new AutoDeportivo();

        // Programador
        Persona Programador1 = new Programador("Alfonso", "MO", 123456, 36);

        System.out.println(Programador1.getNombre());
        System.out.println(Programador1.getDNI());
        Programador1.saludar();
    }
}