public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        Accesorio esclava = new Accesorio("esclava", 1200, 3, "lujo");
        Prenda pantalon = new Prenda("pantalon", 800, 5, 'M');
        Prenda camisa = new Prenda("camisa", 400, 7, 'M');
        Accesorio gorra = new Accesorio("gorra", 600, 3, "moda");

        tienda.agregarProductos(esclava);
        tienda.agregarProductos(pantalon);
        tienda.agregarProductos(camisa);
        tienda.agregarProductos(gorra);

        tienda.imprimirInventario();



    }
}
