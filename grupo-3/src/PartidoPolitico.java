package electoral;

/**
 * Partido politico que participa en el proceso electoral presentando candidatos.
 * Corresponde a la historia de usuario HU-05.
 */
public class PartidoPolitico {

    private String codigo;
    private String nombre;

    public PartidoPolitico() {
    }

    public PartidoPolitico(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PartidoPolitico{codigo=" + codigo + ", nombre=" + nombre + "}";
    }
}
