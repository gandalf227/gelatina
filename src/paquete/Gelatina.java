package paquete;

public class Gelatina {
    //Atributos
    String color, sabor;


    // Métodos Getter
    public String getColor(){{
    }
        return this.color;
    }

    public String getSabor() {
        return this.sabor;
    }

    // Métodos Setter

    public void setColor(String c) {
        this.color = c;
    }

    public void setSabor(String s) {
        this.sabor = s;
    }

    // Método para obtener toda la informacion de nuestros atributos.
    public void mostrarInfo(){
        System.out.println("La informacion de la gelatina es:");
        System.out.println("SABOR: " + getSabor());
        System.out.println("COLOR: " + getColor());
    }
}
