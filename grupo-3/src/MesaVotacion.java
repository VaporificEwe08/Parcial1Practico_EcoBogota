package electoral;

public class MesaVotacion {

    private int numero;
    private int censoVotantes;
    private PuestoVotacion puestoVotacion;

    public MesaVotacion() {
    }

    public MesaVotacion(int numero, int censoVotantes, PuestoVotacion puestoVotacion) {
        this.numero = numero;
        this.censoVotantes = censoVotantes;
        this.puestoVotacion = puestoVotacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCensoVotantes() {
        return censoVotantes;
    }

    public void setCensoVotantes(int censoVotantes) {
        this.censoVotantes = censoVotantes;
    }

    public PuestoVotacion getPuestoVotacion() {
        return puestoVotacion;
    }

    public void setPuestoVotacion(PuestoVotacion puestoVotacion) {
        this.puestoVotacion = puestoVotacion;
    }

    @Override
    public String toString() {
        return "MesaVotacion{numero=" + numero
                + ", censoVotantes=" + censoVotantes
                + ", puestoVotacion=" + (puestoVotacion == null ? "null" : puestoVotacion.getNombre()) + "}";
    }
}
