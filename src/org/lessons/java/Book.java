package org.lessons.java;

public class Book {

    //ATTRIBUTI
    private String titolo;
    private int numPagine;
    private String autore;
    private String editore;

    //COSTRUTTORE

    public Book(String titolo, int numPagine, String autore, String editore) throws Exception{
        this.titolo = titolo;
        this.numPagine = numPagine;
        this.autore = autore;
        this.editore = editore;
    }

    //GETTER AND SETTER
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) throws Exception {
        if (titolo == null || titolo.isEmpty()){
            throw new Exception("Titolo non valido");
        }
        this.titolo = titolo;
    }

    public int getNumPagine() {

        return numPagine;
    }

    public void setNumPagine(int numPagine) throws Exception {
        if (numPagine <= 0 ) {
            throw new Exception("Numero di pagine non valido");
        }
        this.numPagine = numPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws Exception{
        if (autore == null || autore.isEmpty()) {
            throw new Exception("Autore non valido");
        }
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) throws Exception {
        if (editore == null || editore.isEmpty()) {
            throw new Exception("E io non te la valido! gne gne");
        }
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
