package org.lessons.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti libri vuoi inserire? ");
        int n = Integer.parseInt(scan.nextLine());
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Titolo: ");
            String titolo = scan.nextLine();
            System.out.println("Numero di pagine: ");
            int numPagine = Integer.parseInt(scan.nextLine());
            System.out.println("Autore: ");
            String autore = scan.nextLine();
            System.out.println("Editore: ");
            String editore = scan.nextLine();

            Book newBook = new Book(titolo, numPagine, autore, editore);
            books[i] = newBook;
        }
        scan.close();
        System.out.println(Arrays.toString(books));


    }
}