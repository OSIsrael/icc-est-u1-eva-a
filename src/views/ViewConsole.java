package views;
import java.util.Scanner;

import Models.Book;
public class ViewConsole {
    public void mostrarLibro(Book[] books){
        for (Book libro : books) {
            System.out.println(libro);
    }
}
}
