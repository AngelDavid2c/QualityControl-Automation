/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1libro.libro;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro(int isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public Libro(){
        
    }
    
    public void Cargar(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el isbn del libro");
        isbn = leer.nextInt();
        titulo = leer.nextLine();      
        System.out.println("Ingrese el título del libro");
        titulo = leer.nextLine();        
        System.out.println("Ingrese el autor del libro");
        autor = leer.nextLine();       
        System.out.println("Ingrese el número de páginas del libro");
        numPaginas = leer.nextInt();
    }

}
