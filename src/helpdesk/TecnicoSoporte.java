package helpdesk;

public class TecnicoSoporte implements Observador {

    private int idTecnico;
    private String nombre;
    private String especialidad;

    public TecnicoSoporte(int idTecnico, String nombre, String especialidad) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("[Notificación para técnico " + nombre + "]: " + mensaje);
    }

    public void atenderTicket(Ticket ticket) {
        System.out.println("\nEl técnico " + nombre + " está atendiendo el ticket #" + ticket.getIdTicket());
        ticket.cambiarEstado("En proceso");
    }

    public void registrarSolucion(Ticket ticket, String solucion) {
        ticket.setSolucion(solucion);
        ticket.cambiarEstado("Resuelto");

        System.out.println("\nSolución registrada por " + nombre + ":");
        System.out.println(solucion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}