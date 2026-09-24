package electoral;

/**
 * Candidato presentado por un partido politico dentro de la contienda.
 * Corresponde a la historia de usuario HU-06.
 */
public class Candidato {

    private String documento;
    private String nombre;
    private int numeroTarjeton;
    private PartidoPolitico partidoPolitico;

    public Candidato() {
    }

    public Candidato(String documento, String nombre, int numeroTarjeton, PartidoPolitico partidoPolitico) {
        this.documento = documento;
        this.nombre = nombre;
        this.numeroTarjeton = numeroTarjeton;
        this.partidoPolitico = partidoPolitico;
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

    public int getNumeroTarjeton() {
        return numeroTarjeton;
    }

    public void setNumeroTarjeton(int numeroTarjeton) {
        this.numeroTarjeton = numeroTarjeton;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "Candidato{documento=" + documento
                + ", nombre=" + nombre
                + ", numeroTarjeton=" + numeroTarjeton
                + ", partidoPolitico=" + (partidoPolitico == null ? "null" : partidoPolitico.getNombre()) + "}";
    }
}
