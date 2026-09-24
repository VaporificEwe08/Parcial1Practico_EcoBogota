package electoral;

public class PuestoVotacion {

    private String codigo;
    private String nombre;
    private String direccion;
    private String zona;
    private Municipio municipio;

    public PuestoVotacion() {
    }

    public PuestoVotacion(String codigo, String nombre, String direccion, String zona, Municipio municipio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.zona = zona;
        this.municipio = municipio;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "PuestoVotacion{codigo=" + codigo
                + ", nombre=" + nombre
                + ", direccion=" + direccion
                + ", zona=" + zona
                + ", municipio=" + (municipio == null ? "null" : municipio.getNombre()) + "}";
    }
}
