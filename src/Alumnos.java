public class Alumnos {
    private String nombre;
    private int nota;
    private String estado;


    public Alumnos(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public Alumnos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                ", estado='" + estado + '\'' +
                '}';
    }

    }
