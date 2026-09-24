package electoral;

public class JuradoVotacion {

    private String documento;
    private String nombre;
    private String funcion;
    private MesaVotacion mesaVotacion;

    public JuradoVotacion() {
    }

    public JuradoVotacion(String documento, String nombre, String funcion, MesaVotacion mesaVotacion) {
        this.documento = documento;
        this.nombre = nombre;
        this.funcion = funcion;
        this.mesaVotacion = mesaVotacion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public MesaVotacion getMesaVotacion() {
        return mesaVotacion;
    }

    public void setMesaVotacion(MesaVotacion mesaVotacion) {
        this.mesaVotacion = mesaVotacion;
    }

    @Override
    public String toString() {
        return "JuradoVotacion{documento=" + documento
                + ", nombre=" + nombre
                + ", funcion=" + funcion
                + ", mesa=" + (mesaVotacion == null ? "null" : String.valueOf(mesaVotacion.getNumero())) + "}";
    }
}
