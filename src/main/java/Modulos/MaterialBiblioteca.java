package Modulos;

public abstract class MaterialBiblioteca implements Prestable{
    private String titulo;
    private int anio;
    private boolean prestado;

    public MaterialBiblioteca(String titulo, int anio, boolean prestado) {
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    //Metodos abstractos
    @Override
    public abstract void prestar();
    
    @Override
    public abstract void devolver();
    
    //Metodos concretos
    @Override
    public String toString() {
        return "Titulo: " + titulo + " | Anio: " + anio + " | Prestado: " + (prestado ? "Si" : "No");
    }
    
}
