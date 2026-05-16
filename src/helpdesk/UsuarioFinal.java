package helpdesk;

public class UsuarioFinal {

    private int idUsuario;
    private String nombre;
    private String correo;

    public UsuarioFinal(int idUsuario, String nombre, String correo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Ticket crearTicket(String tipo, String descripcion, String prioridad) {
        System.out.println("\nUsuario " + nombre + " está creando un ticket de tipo: " + tipo);
        return TicketFactory.crearTicket(tipo, descripcion, prioridad);
    }

    public void consultarEstado(Ticket ticket) {
        System.out.println("\nConsulta de estado del ticket:");
        System.out.println("Usuario: " + nombre);
        System.out.println("Ticket: #" + ticket.getIdTicket());
        System.out.println("Estado actual: " + ticket.getEstado());
    }

    public String getNombre() {
        return nombre;
    }
}