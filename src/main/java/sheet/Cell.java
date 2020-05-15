package sheet;

public class Cell {
    private final Direccion direccion;
    private Object contenido;

    public Cell(Direccion dir, Integer value) {

        this.direccion = dir;
        this.contenido = value;
    }

    public Cell(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean isAddressBy(Direccion direccion) {

        return direccion.equals(this.direccion);
    }


    public void setContenido(Integer numero) {

        contenido = numero;
    }

    public Object getContenido() {

        return this.contenido;
    }
}
