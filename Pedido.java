public class Pedido {
    Plato[] platos;
    int numeroMesas;
    int cantidad;
    public Pedido(int numeroMesas) {
        this.numeroMesas = numeroMesas;
        this.platos = new Plato[10];
        this.cantidad = 0;
    }
    public void agregarPlato(Plato plato) {
        platos[cantidad] = plato;
        cantidad++;
    }
    public void mostrarPedido() {
        System.out.println("mesa " + numeroMesas + ":");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(platos[i]);
        }
    }
}
