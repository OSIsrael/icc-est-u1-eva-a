package Controllers;

import Models.Book;

public class BookController {
    // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] libros) {
        int n=libros.length;
        for(int i=1;i<n;i++){
            Book libro=libros[i];
            int j=i-1;
            while (j>=0 &&(libros[j].getName().compareTo(libro.getName()))<0 ) {
                libros[j+1]=libros[j];
                j--;
            }
            libros[j+1]=libro;
        }
    }
    public Book searchByName(Book[] libros, String nombre) {
        int bajo=0;
        int alto=libros.length-1;
        while (bajo<=alto) {
            int central=(bajo+alto)/2;
            if ((libros[central].getName().compareTo(nombre))==0) {
                return libros[central];
            }
            if ((libros[central].getName().compareTo(nombre))!=0) {
                bajo=central+1;
            }
            else{
                alto=central-1;
            }
        }

        return null;
    }
}
