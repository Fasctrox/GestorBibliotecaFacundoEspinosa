package com.mycompany.gestorbibliotecafacundoespinosa;
import Modulos.Biblioteca;
import Modulos.Libro;
import java.util.Scanner;
import Modulos.MaterialBiblioteca;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();
        int opcion = 0;
        
        miBiblioteca.agregarMaterial(new Libro("Antoine de Saint-Exupéry", "El principito", 1943, false));
        miBiblioteca.agregarMaterial(new Libro("George Orwell", "1984", 1949, false));
        
        do {
            System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1) Agregar libro");
            System.out.println("2) Listar materiales");
            System.out.println("3) Buscar por titulo");
            System.out.println("4) Prestar material");
            System.out.println("5) Devolver Material");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            
            // Validación básica para evitar que el programa explote si no ingresan un número
            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese Titulo: ");
                        String tit = leer.nextLine();
                        System.out.print("Ingrese Autor: ");
                        String aut = leer.nextLine();
                        System.out.print("Ingrese Anio: ");
                        int anio = leer.nextInt();
                        miBiblioteca.agregarMaterial(new Libro(aut, tit, anio, false));
                        break;
                        
                    case 2:
                        System.out.println("\nCatalogo actual:");
                        miBiblioteca.listarMateriales();
                        break;

                    case 3:
                        System.out.print("Ingrese el titulo a buscar: ");
                        String tituloBusqueda = leer.nextLine();
                        MaterialBiblioteca encontrado = miBiblioteca.buscarPorTitulo(tituloBusqueda);
                        
                        if (encontrado != null) {
        
                            System.out.println("Material encontrado: " + encontrado.toString());
                        } else {    
                            System.out.println("No se encontro ningun material con ese titulo.");
                        }
                        break;
                        
                    case 4:
                        System.out.print("Titulo del material a prestar: ");
                        miBiblioteca.prestarMaterial(leer.nextLine());
                        break;
                        
                    case 5:
                        System.out.print("Titulo del material a devolver: ");
                        miBiblioteca.devolverMaterial(leer.nextLine());
                        break;
                        
                    case 6:
                        System.out.println("Saliendo del sistema...");
                        break;
                        
                    default:
                        System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                }
            } else {
                System.out.println("Error: Debe ingresar un numero.");
                leer.next(); // Limpiar la entrada inválida
            }
        } while (opcion != 6);
    }
}