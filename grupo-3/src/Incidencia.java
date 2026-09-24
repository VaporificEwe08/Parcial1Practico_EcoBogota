package electoral;

/**
 * Situacion presentada durante la jornada electoral, como problemas logisticos,
 * incidentes en los puestos o desacuerdos frente a la informacion de las actas.
 * Corresponde a la historia de usuario HU-10.
 */
public class Incidencia {

    private String codigo;
    private String tipo;
    private String descripcion;
    private String fecha;
    private PuestoVotacion puestoVotacion;

    public Incidencia() {
    }

    public Incidencia(String codigo, String tipo, String descripcion, String fecha, PuestoVotacion puestoVotacion) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.puestoVotacion = puestoVotacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public PuestoVotacion getPuestoVotacion() {
        return puestoVotacion;
    }

    public void setPuestoVotacion(PuestoVotacion puestoVotacion) {
        this.puestoVotacion = puestoVotacion;
    }

    @Override
    public String toString() {
        return "Incidencia{codigo=" + codigo
                + ", tipo=" + tipo
                + ", fecha=" + fecha
                + ", puesto=" + (puestoVotacion == null ? "null" : puestoVotacion.getNombre()) + "}";
    }
}
