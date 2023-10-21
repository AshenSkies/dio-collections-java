package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogosLivros {
    private List<Livro> livroList;



    public CatalogosLivros() {
        this.livroList = new ArrayList<>();
    }

    public void addLivro(String name, String autor, int anoPub) {
        livroList.add(new Livro(name, autor, anoPub));
    }

    public List<Livro> searchByAuthor(String autor) {
        List<Livro> booksByAuthor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) booksByAuthor.add(l);
            }
        }

        return booksByAuthor;
    }

    public List<Livro> searchByDate(int yearStart, int yearEnd) {
        List<Livro> booksByDate = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAnoPub() >= yearStart && l.getAnoPub() <= yearEnd) booksByDate.add(l);
            }
        }

        return booksByDate;
    }

    public List<Livro> searchByName(String name) {
        List<Livro> booksByName = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getName().equalsIgnoreCase(name)) booksByName.add(l);
            }
        }

        return booksByName;
    }
    

    @Override
    public String toString() {
        return livroList + "";
    }


    public static void main(String[] args) {
        CatalogosLivros bookList = new CatalogosLivros();
        System.out.println(bookList.toString());

        bookList.addLivro("Kaguya-Sama: Love is War", "Aka Akasaka", 2015);
        bookList.addLivro("Bloom Into You", "Nio Nakatani", 2015);
        bookList.addLivro("Adachi and Shimamura", "Hitoma Iruma", 2012);
        bookList.addLivro("Asteroid in Love", "Yuka Yamada", 2017);
        bookList.addLivro("Laid-Back Camp", "Afro", 2014);

        System.out.println(bookList.toString());

        System.out.println(bookList.searchByDate(2000, 2015));
        System.out.println(bookList.searchByAuthor("aka akasaka"));
        System.out.println(bookList.searchByName("Asteroid in love"));
    }
}
