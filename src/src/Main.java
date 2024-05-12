public class Main {

    public static void main(String[] args) {

        //PRODUCTOS A AGREGAR AL INVENTARIO
        Accesorio esclava = new Accesorio("esclava", 1200, 3, "lujo");
        Prenda pantalon = new Prenda("pantalon", 800, 5, 'M');
        Prenda camisa = new Prenda("camisa", 400, 7, 'M');
        Accesorio gorra = new Accesorio("gorra", 600, 3, "moda");

        //INICIALIZA OBJETO DE CLASE TIENDA
        Tienda tienda = new Tienda();

        //SE AGREGAN DATOS AL INVENTARIO LLMANDO AL METODO ADECUADO
        tienda.agregarProductos(esclava);
        tienda.agregarProductos(pantalon);
        tienda.agregarProductos(camisa);
        tienda.agregarProductos(gorra);

        //SE IMPRIMEN DATOS DEL INVENTARIO MEDIANTE EL METODO CORRESPODIENTE.
        tienda.imprimirInventario();
        //SE IMPRIME CANTIDAD DE PRODUCTOS EN INVENTARIO MEDIANTE MEDODO ADECUADO.
        tienda.imprimirCantidadDisponible();



    }
}
