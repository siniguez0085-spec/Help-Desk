package helpdesk;

public class TicketHardware extends Ticket {

    public TicketHardware(String descripcion, String prioridad) {
        super(descripcion, prioridad);
    }

    @Override
    public void resolverIncidente() {
        cambiarEstado("Resuelto");
        setSolucion("Se realizó revisión física del equipo y cambio del componente afectado.");
    }

    @Override
    public String getTipo() {
        return "Hardware";
    }
}
