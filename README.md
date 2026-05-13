# Sistema de Gestión de Biblioteca - Java

**Instancia evaluativa Nro. 1 de Interfaz Gráfica**

## Consigna
Desarrollar un programa en Java que permita gestionar materiales de una biblioteca desde la consola. El sistema debe permitir agregar, listar, buscar, prestar y devolver materiales. Se deben aplicar clases abstractas e interfaces para mostrar herencia y polimorfismo.

## Requisitos Técnicos

### 1. Clase abstracta MaterialBiblioteca
- Representa cualquier material de la biblioteca (libro, revista, etc.).
- Atributos comunes: `titulo`, `anio`, `prestado`.
- Métodos abstractos: `prestar()` y `devolver()`.
- Método concreto: `toString()` para mostrar información.

### 2. Clase Libro (Hereda de MaterialBiblioteca)
- Atributos adicionales: `autor`.
- Implementa los métodos abstractos heredados.

### 3. Interfaz Prestable
- Define el contrato: `prestar()` y `devolver()`.
- `MaterialBiblioteca` implementa esta interfaz, obligando a que todos los materiales puedan ser prestados.

### 4. Clase Biblioteca
- Maneja una lista de `MaterialBiblioteca`.
- Métodos:
    1. `agregarMaterial(MaterialBiblioteca m)`
    2. `listarMateriales()`
    3. `buscarPorTitulo(titulo)` -> devuelve material o null.
    4. `prestarMaterial(titulo)`
    5. `devolverMaterial(titulo)`

---

## Instrucciones de Ejecución

1. **Entorno:** Asegurarse de tener instalado el JDK (Java Development Kit) 8 o superior.
2. **Importación:** Abrir el proyecto en el IDE NetBeans.
3. **Ejecución:** Localizar el archivo `Main.java` dentro del paquete `com.mycompany.gestorbibliotecafacundoespinosa`, hacer clic derecho y seleccionar **Run File**.
4. **Interacción:** El sistema se controla íntegramente mediante el menú numérico de la consola.

## Estructura del Proyecto

El código se divide en los siguientes paquetes y clases:

- **Paquete `com.mycompany.gestorbibliotecafacundoespinosa`**
    - `Main.java`: Contiene el bucle principal y el menú de usuario.
- **Paquete `Modulos`**
    - `Prestable.java`: Interfaz que define el contrato de préstamo.
    - `MaterialBiblioteca.java`: Clase base abstracta.
    - `Libro.java`: Implementación específica de un libro.
    - `Biblioteca.java`: Clase gestora con la lógica de búsqueda y almacenamiento.

## Integrantes y Roles

- **Facundo Espinosa**
    - **Rol:** Desarrollador de Software.
    - **Responsabilidades:** Implementación de la arquitectura de clases, gestión de la lógica de negocio, control de entrada de datos (Scanner) y configuración del repositorio remoto en GitHub.

## Desafíos Encontrados

- **Autenticación Remota:** La transición de contraseñas tradicionales a Tokens de Acceso Personal (PAT) en GitHub requirió una configuración específica dentro de NetBeans para realizar el Push del código.
- **Limpieza del Buffer de Entrada:** El manejo de la clase `Scanner` presentó desafíos al leer tipos de datos mixtos (enteros y cadenas), lo cual se resolvió implementando `leer.nextLine()` para limpiar el buffer de memoria.
- **Visualización de Resultados:** Fue necesario ajustar el flujo de la función de búsqueda para que, además de retornar el objeto, la interfaz de consola mostrara efectivamente la información del material encontrado al usuario.

## Promts utilizados
Tengo la siguiente consigna donde me pide desarrollar un programa en java con los siguientes requerimientos:

Desarrollar un programa en Java que permita gestionar materiales de una biblioteca desde la consola. El sistema debe permitir agregar, listar, buscar, prestar y devolver materiales. 
Se deben aplicar clases abstractas e interfaces para mostrar herencia y polimorfismo. Te adjunto los requisitos tecnicos en una imagen. Actualmente ya implemente la estructura de las clases e interfaces solicitadas, aunque algunas tienen errores.

<img width="666" height="732" alt="image" src="https://github.com/user-attachments/assets/8961a3b6-7bff-4a42-9adc-e084f6f0a8d1" />


//Clase MaterialBiblioteca

'''

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
    abstract void prestar();
    abstract void devolver();

    //Metodos concretos
    public void mostrar(){
        System.out.println();
    } 

}

\'''


//Clase Libro

'''

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
    void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

\'''

//Clase Biblioteca

'''

package Modulos;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<MaterialBiblioteca> materiales = new ArrayList<>();

    public void agregarMaterial(MaterialBiblioteca m){
    }
    
    public void listarMateriales(){
    }
    
    public void buscarPorTitulo(){ //-> devuelve material o null
    }

    public void prestarMaterial(){
    }

    public void devolverMaterial(){

    }

}

\'''

//Interfaz Prestable

'''

package Modulos;

public interface Prestable{

    void prestar();

    void devolver();

    

}

\'''

