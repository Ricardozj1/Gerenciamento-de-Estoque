package model;

public class Categoria {

    private String categoria;
    private int id;

    public Categoria() {
        this.categoria = "";
        this.id = 0;
    }

    public Categoria(String categoria, int id) {
        this.categoria = categoria;
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
