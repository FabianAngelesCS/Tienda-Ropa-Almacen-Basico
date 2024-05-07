public class Accesorio extends  Producto{

    //variable priovada de clase
    private String tipo;

    //Constructor de Clase y super clase parameterizado
    public Accesorio(String nombre, double precio, int cantidad, String tipo){
        super(nombre, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
