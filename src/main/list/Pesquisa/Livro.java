package main.list.Pesquisa;

public class Livro {
    private String name;
    private String autor;
    private int anoPub;

    public Livro(String name, String autor, int anoPub){
        this.name = name;
        this.autor = autor;
        this.anoPub = anoPub;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return this.anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }


    @Override
    public String toString() {
        return name + " - " + autor + " - " + anoPub;
    }


}
