package electoral;

public class ProcesoElectoral {

    private String codigo;
    private String tipoEleccion;
    private String fecha;
    private String estado;

    public ProcesoElectoral() {
    }

    public ProcesoElectoral(String codigo, String tipoEleccion, String fecha, String estado) {
        this.codigo = codigo;
        this.tipoEleccion = tipoEleccion;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoEleccion() {
        return tipoEleccion;
    }

    public void setTipoEleccion(String tipoEleccion) {
        this.tipoEleccion = tipoEleccion;
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

    /**
     * Actualiza el estado del proceso dentro del calendario electoral.
     */
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "ProcesoElectoral{codigo=" + codigo
                + ", tipoEleccion=" + tipoEleccion
                + ", fecha=" + fecha
                + ", estado=" + estado + "}";
    }
}
