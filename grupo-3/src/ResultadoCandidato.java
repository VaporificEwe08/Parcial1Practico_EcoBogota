package electoral;

public class ResultadoCandidato {

    private Candidato candidato;
    private int cantidadVotos;

    public ResultadoCandidato() {
    }

    public ResultadoCandidato(Candidato candidato, int cantidadVotos) {
        this.candidato = candidato;
        this.cantidadVotos = cantidadVotos;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "ResultadoCandidato{candidato=" + (candidato == null ? "null" : candidato.getNombre())
                + ", cantidadVotos=" + cantidadVotos + "}";
    }
}
