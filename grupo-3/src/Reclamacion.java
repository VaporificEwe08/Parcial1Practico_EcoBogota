package electoral;

public class Reclamacion {

    private String codigo;
    private String presentadaPor;
    private String descripcion;
    private String fecha;
    private String estado;
    private Acta acta;

    public Reclamacion() {
    }

    public Reclamacion(String codigo, String presentadaPor, String descripcion, String fecha, String estado, Acta acta) {
        this.codigo = codigo;
        this.presentadaPor = presentadaPor;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.acta = acta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPresentadaPor() {
        return presentadaPor;
    }

    public void setPresentadaPor(String presentadaPor) {
        this.presentadaPor = presentadaPor;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Acta getActa() {
        return acta;
    }

    public void setActa(Acta acta) {
        this.acta = acta;
    }

    /**
     * Actualiza el estado de la reclamacion durante su revision.
     */
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Reclamacion{codigo=" + codigo
                + ", presentadaPor=" + presentadaPor
                + ", fecha=" + fecha
                + ", estado=" + estado
                + ", acta=" + (acta == null ? "null" : acta.getNumero()) + "}";
    }
}
