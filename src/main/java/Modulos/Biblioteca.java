package Modulos;
import java.util.ArrayList;


public class Biblioteca {
 
    private ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();
    
    public void agregarMaterial(MaterialBiblioteca m) {
        materiales.add(m);
        System.out.println("Material agregado con exito.");
    }

    public void listarMateriales() {
        for (MaterialBiblioteca m : materiales) {
            System.out.println(m.toString());
        }
    }

    public MaterialBiblioteca buscarPorTitulo(String titulo) {
        for (MaterialBiblioteca m : materiales) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null; // Si no lo encuentra
    }

    public void prestarMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.prestar(); // Polimorfismo en acción
        } else {
            System.out.println("Material no encontrado.");
        }
    }

    public void devolverMaterial(String titulo) {
        MaterialBiblioteca m = buscarPorTitulo(titulo);
        if (m != null) {
            m.devolver();
        } else {
            System.out.println("Material no encontrado.");
        }
    }
    
}
