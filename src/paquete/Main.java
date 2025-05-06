package paquete;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto a partir de una clase
        Gelatina g1 = new Gelatina();
        Gelatina g2 = new Gelatina();

        g1.setColor("Verde");
        g1.setSabor("Limon");

        g1.mostrarInfo();
        System.out.println("------------------------------------");
        g1.setColor("Amarillo");
        g1.setSabor("Naranja");

        g1.mostrarInfo();

        System.out.println("\nHERRERA CATRO JAVIER ALEXIS\n" +
                "TRM31\n" +
                "24310130");

    }
}
