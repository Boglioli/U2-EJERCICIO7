public class Cocina {
    Pedido[] pedidos;
    int cantidad;
    public Cocina() {
        this.pedidos = new Pedido[10];
        this.cantidad = 0;
    }
    public void recibirComandas(Pedido pedido) {
        pedidos[cantidad] = pedido;
        cantidad++;
        System.out.println("pedido recibido en cocina");
    }
    public void mostrarPendientes() {
        System.out.println("P" +
                "pedidos pendientes:");
        for (int i = 0; i < cantidad; i++) {
            pedidos[i].mostrarPedido();
        }
    }
}
