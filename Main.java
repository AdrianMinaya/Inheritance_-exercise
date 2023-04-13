public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre = "Jose Perez";
        cliente.phone = 123;
        cliente.credito = 20000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.phone);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 33;
        trabajador.nombre = "Juan Lopez";
        trabajador.phone = 908;
        trabajador.salario = 5000;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.phone);
        System.out.println(trabajador.salario);

    }


}

class Persona {
    int edad;
    String nombre;
    int phone;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    float salario;
}