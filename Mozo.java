public class Mozo {
    public void enviarPedidoACocina(Pedido pedido, Cocina cocina) {
        System.out.println("el mozo envia el pedido a cocina");
        cocina.recibirComandas(pedido);
    }
}
