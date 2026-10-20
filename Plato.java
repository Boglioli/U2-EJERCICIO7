public class Plato {
    String nombre;
    double precio;
    int tiempoPreparacion;
    public Plato(String nombre, double precio, int tiempoPreparacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }
    public String toString() {
        return nombre + " - Precio: " + precio + " - Tiempo de preparación: " + tiempoPreparacion + " minutos";

    }
}
