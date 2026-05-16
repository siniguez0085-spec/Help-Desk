package helpdesk;

public class TicketSoftware extends Ticket {

    public TicketSoftware(String descripcion, String prioridad) {
        super(descripcion, prioridad);
    }

    @Override
    public void resolverIncidente() {
        cambiarEstado("Resuelto");
        setSolucion("Se reinstaló o configuró correctamente el software reportado.");
    }

    @Override
    public String getTipo() {
        return "Software";
    }
}
