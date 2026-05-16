package helpdesk;

import java.util.Date;

public abstract class Ticket {

    private static int contador = 1;

    protected int idTicket;
    protected String descripcion;
    protected String prioridad;
    protected String estado;
    protected Date fechaCreacion;
    protected String solucion;
    protected TecnicoSoporte tecnicoAsignado;

    public Ticket(String descripcion, String prioridad) {
        this.idTicket = contador++;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "Pendiente";
        this.fechaCreacion = new Date();
        this.solucion = "Sin solución registrada";
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El ticket #" + idTicket + " cambió su estado a: " + nuevoEstado);
    }

    public abstract void resolverIncidente();

    public int getIdTicket() {
        return idTicket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public TecnicoSoporte getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(TecnicoSoporte tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Ticket #" + idTicket
                + "\nTipo: " + getTipo()
                + "\nDescripción: " + descripcion
                + "\nPrioridad: " + prioridad
                + "\nEstado: " + estado
                + "\nFecha de creación: " + fechaCreacion;
    }
}