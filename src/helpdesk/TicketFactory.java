package helpdesk;

public class TicketFactory {

    public static Ticket crearTicket(String tipo, String descripcion, String prioridad) {

        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de ticket no puede ser nulo.");
        }

        switch (tipo.toLowerCase()) {
            case "hardware":
                return new TicketHardware(descripcion, prioridad);

            case "software":
                return new TicketSoftware(descripcion, prioridad);

            case "red":
            case "redes":
                return new TicketRed(descripcion, prioridad);

            case "acceso":
            case "accesos":
                return new TicketAcceso(descripcion, prioridad);

            default:
                throw new IllegalArgumentException("Tipo de ticket no reconocido: " + tipo);
        }
    }
}