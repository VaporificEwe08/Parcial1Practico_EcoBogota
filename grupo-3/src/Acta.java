package electoral;

import java.util.ArrayList;
import java.util.List;

/**
 * Acta elaborada por los jurados al cierre de la jornada, donde se consignan
 * los resultados obtenidos por los candidatos en una mesa.
 * Corresponde a las historias de usuario HU-08, HU-09 y HU-12.
 */
public class Acta {

    private String numero;
    private String fechaRegistro;
    private MesaVotacion mesaVotacion;
    private List<ResultadoCandidato> resultados;

    public Acta() {
        this.resultados = new ArrayList<ResultadoCandidato>();
    }

    public Acta(String numero, String fechaRegistro, MesaVotacion mesaVotacion) {
        this.numero = numero;
        this.fechaRegistro = fechaRegistro;
        this.mesaVotacion = mesaVotacion;
        this.resultados = new ArrayList<ResultadoCandidato>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public MesaVotacion getMesaVotacion() {
        return mesaVotacion;
    }

    public void setMesaVotacion(MesaVotacion mesaVotacion) {
        this.mesaVotacion = mesaVotacion;
    }

    public List<ResultadoCandidato> getResultados() {
        return resultados;
    }

    public void setResultados(List<ResultadoCandidato> resultados) {
        this.resultados = resultados;
    }

    /**
     * Consigna en el acta el resultado obtenido por un candidato.
     */
    public void agregarResultado(ResultadoCandidato resultado) {
        this.resultados.add(resultado);
    }

    /**
     * Devuelve los votos consignados para un candidato, o cero si no aparece en el acta.
     */
    public int consultarVotosCandidato(Candidato candidato) {
        for (ResultadoCandidato resultado : resultados) {
            if (resultado.getCandidato() != null && candidato != null
                    && resultado.getCandidato().getDocumento().equals(candidato.getDocumento())) {
                return resultado.getCantidadVotos();
            }
        }
        return 0;
    }

    /**
     * Suma todos los votos consignados en el acta.
     */
    public int calcularTotalVotos() {
        int total = 0;
        for (ResultadoCandidato resultado : resultados) {
            total = total + resultado.getCantidadVotos();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Acta{numero=" + numero
                + ", fechaRegistro=" + fechaRegistro
                + ", mesa=" + (mesaVotacion == null ? "null" : String.valueOf(mesaVotacion.getNumero()))
                + ", totalVotos=" + calcularTotalVotos() + "}";
    }
}
