package helpdesk;

public class TicketRed extends Ticket {

    public TicketRed(String descripcion, String prioridad) {
        super(descripcion, prioridad);
    }

    @Override
    public void resolverIncidente() {
        cambiarEstado("Resuelto");
        setSolucion("Se verificó conectividad, configuración IP y funcionamiento del equipo de red.");
    }

    @Override
    public String getTipo() {
        return "Red";
    }
}