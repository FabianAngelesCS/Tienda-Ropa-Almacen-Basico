public class Main {

    public static void main(String[] args) {
        Producto[] productos = new Producto[5];

        Accesorio esclava = new Accesorio("esclava", 1200, 3, "lujo");
        Prenda pantalon = new Prenda("pantalon", 800, 5, 'M');
        Prenda camisa = new Prenda("camisa", 400, 7, 'M');
        Accesorio gorra = new Accesorio("gorra", 600, 3, "moda");

        productos[0] = esclava;
        productos[1] = pantalon;
        productos[2] = camisa;
        productos[3] = gorra;


        for (Producto producto: productos){
            System.out.println("Nombre: " + producto.getNombre() +
                    " -------Cantidad: " + producto.getCantidad() +
                    " -------precio: $" + producto.getPrecio());


        }


    }
}
