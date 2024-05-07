public class Tienda {

    private Producto[] inventario;

    private int cantidadProductos;

    public Tienda(int  capacidadMaxima) {
        this.inventario = new Producto[capacidadMaxima];
        this.cantidadProductos = 0;
    }

    public void agregarProductos(Producto producto){

        if (cantidadProductos < inventario.length){
            inventario[cantidadProductos] = producto;
            cantidadProductos++;
            System.out.println("El siguiete producto fue agregado correctamente: " + producto.getNombre());
        }
    }

}
