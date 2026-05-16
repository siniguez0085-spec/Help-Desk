package helpdesk;

public class AdministradorSistema {

    private int idAdministrador;
    private String nombre;

    public AdministradorSistema(int idAdministrador, String nombre) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
    }

    public void gestionarUsuarios() {
        System.out.println("\nEl administrador " + nombre + " está gestionando usuarios del sistema.");
    }

    public void clasificarIncidente(Ticket ticket) {
        System.out.println("\nEl administrador clasificó el ticket #" + ticket.getIdTicket());
        System.out.println("Tipo de incidente: " + ticket.getTipo());
        System.out.println("Prioridad: " + ticket.getPrioridad());
    }

    public void asignarTecnico(Ticket ticket, TecnicoSoporte tecnico) {
        System.out.println("\nEl administrador asignó el ticket #" + ticket.getIdTicket()
                + " al técnico " + tecnico.getNombre());
    }
}