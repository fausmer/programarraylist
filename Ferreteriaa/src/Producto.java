public class Producto {
    private String marca;
    private int cod;
    private String color;
    private int cantstock;

    public Producto(String marca, int cod, String color, int cantstock) {
        this.marca = marca;
        this.cod = cod;
        this.color = color;
        this.cantstock = cantstock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantstock() {
        return cantstock;
    }

    public void setCantstock(int cantstock) {
        this.cantstock = cantstock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", cod=" + cod +
                ", color='" + color + '\'' +
                ", cantstock=" + cantstock +
                '}';
    }
}
