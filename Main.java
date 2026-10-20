public class Main {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        Mozo mozo = new Mozo();
        Plato plato1 = new Plato("Pizza" , 5000, 20);
        Plato plato2 = new Plato("Hamburguesa", 4500, 15);
        Plato plato3 = new Plato("Ensalada", 3000, 10);
        Pedido pedido = new Pedido(5);
        pedido.agregarPlato(plato1);
        pedido.agregarPlato(plato2);
        pedido.agregarPlato(plato3);
        mozo.enviarPedidoACocina(pedido, cocina);
        cocina.mostrarPendientes();
    }
}
