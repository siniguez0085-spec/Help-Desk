package helpdesk;

public class CoordinadorSoporte implements Observador {

    private int idCoordinador;
    private String nombre;

    public CoordinadorSoporte(int idCoordinador, String nombre) {
        this.idCoordinador = idCoordinador;
        this.nombre = nombre;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("[Notificación para coordinador " + nombre + "]: " + mensaje);
    }

    public void supervisarTicketsCriticos() {
        System.out.println("\nEl coordinador " + nombre + " está supervisando los tickets críticos.");
    }

    public void generarReporte() {
        System.out.println("\nEl coordinador " + nombre + " generó un reporte de soporte.");
    }
}