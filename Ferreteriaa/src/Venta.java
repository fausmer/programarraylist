public class Venta {
    private Integer cod;
    private Integer fecha;
    private String cliente;

    public ArrayList<Producto> ventascliente() {
        return ventascliente();
    }

    public Venta(Integer cod, Integer fecha, String cliente) {
        this.cod = cod;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    @Override
    public String toString() {
        return "Venta{" +
                "cod=" + cod +
                ", fecha=" + fecha +
                ", cliente='" + cliente + '\'' +
                '}';
    }
    public ArrayList<Producto> ventascliente() {
        ArrayList<Producto> noHumano = new ArrayList<>();
    }
}