package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[0];
        try {

            System.out.println("Quanti libri vuoi inserire? ");
            int n = Integer.parseInt(scan.nextLine());
            books = new Book[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Titolo: ");
                String titolo = scan.nextLine();
                if (titolo.isEmpty()){
                    throw new IllegalArgumentException();
                }
                System.out.println("Numero di pagine: ");
                int numPagine = Integer.parseInt(scan.nextLine());
                if (numPagine <= 0 ){
                    throw new IllegalArgumentException();
                }
                System.out.println("Autore: ");
                String autore = scan.nextLine();
                if (autore.isEmpty()){
                    throw new IllegalArgumentException();
                }
                System.out.println("Editore: ");
                String editore = scan.nextLine();
                if (editore.isEmpty()){
                    throw new IllegalArgumentException();
                }

                Book newBook = new Book(titolo, numPagine, autore, editore);
                books[i] = newBook;
            }
        } catch (NumberFormatException e) {
            System.out.println("Inserisci un numero");
        } catch (Exception e) {
            System.out.println("Campo non valido");
        } finally {
            scan.close();
            System.out.println(Arrays.toString(books));

        }


    }
}