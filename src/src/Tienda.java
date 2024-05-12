public class Tienda {

    private Producto[] inventario;

    private int cantidadProductos;

    public Tienda() {
        inventario = new Producto[30];
        cantidadProductos = 0;
    }

    //Metodo para imprimir datos del inventario.
    public void imprimirInventario(){

        for (int i = 0; i < cantidadProductos; i++){
            System.out.println("Nombre: " + inventario[i].getNombre() +
                               " ----precio: - $" + inventario[i].getPrecio());
        }
    }

    //Metodo para agregar datos al inventario.
    public void agregarProductos(Producto producto){
            inventario[cantidadProductos] = producto;
            cantidadProductos++;
            System.out.println("El producto fue agregado correctamente: ");

    }

    //Metodo para imprimir cantidad de productos del  inventario.
    public void imprimirCantidadDisponible(){
        System.out.println("la cantidad de productos en el inventario es: " + cantidadProductos);


    }

}
