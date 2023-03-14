package org.lessons.java;

public class Book {

    //ATTRIBUTI
    private String titolo;
    private int numPagine;
    private String autore;
    private String editore;

    //COSTRUTTORE

    public Book(String titolo, int numPagine, String autore, String editore) {
        this.titolo = titolo;
        this.numPagine = numPagine;
        this.autore = autore;
        this.editore = editore;
    }

    //GETTER AND SETTER
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    //METODI

    @Override
    public String toString() {
        return "Book{" +
                "titolo='" + titolo + '\'' +
                ", numPagine=" + numPagine +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                '}';
    }
}
