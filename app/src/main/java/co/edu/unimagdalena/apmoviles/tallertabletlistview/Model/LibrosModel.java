package co.edu.unimagdalena.apmoviles.tallertabletlistview.Model;

public class LibrosModel {
   public String autor, libro, edicicion;



    public LibrosModel(String libro, String autor, String edicicion) {
        this.autor = autor;
        this.libro = libro;
        this.edicicion = edicicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getEdicicion() {
        return edicicion;
    }

    public void setEdicicion(String edicicion) {
        this.edicicion = edicicion;
    }
}
