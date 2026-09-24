package electoral;

public class Departamento {

    private String codigo;
    private String nombre;
    private ProcesoElectoral procesoElectoral;

    public Departamento() {
    }

    public Departamento(String codigo, String nombre, ProcesoElectoral procesoElectoral) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.procesoElectoral = procesoElectoral;
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

    public ProcesoElectoral getProcesoElectoral() {
        return procesoElectoral;
    }

    public void setProcesoElectoral(ProcesoElectoral procesoElectoral) {
        this.procesoElectoral = procesoElectoral;
    }

    @Override
    public String toString() {
        return "Departamento{codigo=" + codigo + ", nombre=" + nombre + "}";
    }
}
