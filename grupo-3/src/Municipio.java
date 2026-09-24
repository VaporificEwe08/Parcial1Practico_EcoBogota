package electoral;

/**
 * Municipio perteneciente a un departamento dentro de la distribucion territorial.
 * Corresponde a la historia de usuario HU-02.
 */
public class Municipio {

    private String codigo;
    private String nombre;
    private Departamento departamento;

    public Municipio() {
    }

    public Municipio(String codigo, String nombre, Departamento departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Municipio{codigo=" + codigo
                + ", nombre=" + nombre
                + ", departamento=" + (departamento == null ? "null" : departamento.getNombre()) + "}";
    }
}
