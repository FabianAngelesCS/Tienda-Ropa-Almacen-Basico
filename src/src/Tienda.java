public class Tienda {

    private Producto[] inventario;

    private int cantidadProductos;

    public Tienda() {
        this.inventario = new Producto[30];
        this.cantidadProductos = 0;
    }

    public void imprimirInventario(){

        for (Producto producto : inventario){
            System.out.println("Nombre: " + producto.getNombre());
        }
    }

    public void agregarProductos(Producto producto){
            inventario[cantidadProductos] = producto;
            cantidadProductos++;
            System.out.println("El siguiete producto fue agregado correctamente: " + producto.getNombre());

    }

}
