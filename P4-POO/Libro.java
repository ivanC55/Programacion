public class Libro {
    private String titulo;
    private String autor;
    private int nEjemplares = 0;
    private int nEjemplaresPrestados = 0;

    // CONSTRUCTORES :
    public Libro() {
    }

    public Libro(String titulo, String autor, int nEjemplares, int nEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }

    public Libro(String titulo, int nEjemplares) {
        this.titulo = titulo;
        this.nEjemplares = nEjemplares;
    }

    // GETTERS Y SETTERS :
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setNEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getNEjemplares() {
        return nEjemplares;
    }

    public void setNEjemplaresPrestados(int nEjemplaresPrestados) {
        this.nEjemplaresPrestados = nEjemplaresPrestados;
    }

    public int getNEjemplaresPrestados() {
        return nEjemplaresPrestados;
    }

    // Metodos :
    public boolean prestamo() {
        boolean disponible = true;
        if (nEjemplares > 0) {
            disponible = true;
            nEjemplaresPrestados++;
        } else {
            disponible = false;
        }
        return disponible;
    }

    public boolean devolucion() {
        boolean devolucion = true;
        if (nEjemplaresPrestados > 0) {
            devolucion = true;
            nEjemplaresPrestados--;
        } else {
            devolucion = false;
        }
        return devolucion;
    }

    @Override
    public String toString() {
        return "El autor es " + autor + " el titulo es " + titulo + " el numero de ejmplares es " + nEjemplares
                + " y el numero de prestados es " + nEjemplaresPrestados;
    }

}
