package Modulos;


public class Libro extends MaterialBiblioteca{
    
    private String autor;

    public Libro(String autor, String titulo, int anio, boolean prestado) {
        super(titulo, anio, prestado);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void prestar() {
        if (!isPrestado()) {
            setPrestado(true);
            System.out.println("El libro '" + getTitulo() + "' ha sido prestado.");
        } else {
            System.out.println("Error: El libro '" + getTitulo() + "' ya esta prestado.");
        }
    }

    @Override
    public void devolver() {
    if (isPrestado()) { // Si el libro está prestado (true), procedemos a devolverlo
        setPrestado(false);
        System.out.println("El libro '" + getTitulo() + "' ha sido devuelto con exito.");
    } else { // Si el libro NO está prestado (false), avisamos del error
        System.out.println("Error: El libro '" + getTitulo() + "' ya se encuentra en la biblioteca.");
    }
}

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
    
}
