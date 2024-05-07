public class Prenda extends Producto {

    //variable privada de clase
    private char talla;

    //Constructor de clase y super clase parametrizado
    public Prenda(String nombre, double precio, int cantidad, char talla){
        super(nombre, precio, cantidad);
        this.talla = talla;
    }

    //getters and setters de variable
    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }
}
