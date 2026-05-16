package helpdesk;

import java.util.ArrayList;
import java.util.List;

public class SistemaHelpDesk {

    private static SistemaHelpDesk instancia;

    private List<Ticket> listaTickets;
    private List<Observador> listaObservadores;

    private SistemaHelpDesk() {
        listaTickets = new ArrayList<>();
        listaObservadores = new ArrayList<>();
    }

    // Patrón Singleton
    public static SistemaHelpDesk obtenerInstancia() {
        if (instancia == null) {
            instancia = new SistemaHelpDesk();
        }
        return instancia;
    }

    public void registrarTicket(Ticket ticket) {
        listaTickets.add(ticket);
        System.out.println("\nTicket registrado correctamente:");
        System.out.println(ticket);
        notificarCambio("Nuevo ticket registrado: " + ticket.getDescripcion());
    }

    public void asignarTecnico(Ticket ticket, TecnicoSoporte tecnico) {
        ticket.setTecnicoAsignado(tecnico);
        ticket.cambiarEstado("Asignado");

        System.out.println("\nTicket asignado al técnico: " + tecnico.getNombre());
        notificarCambio("El ticket #" + ticket.getIdTicket() + " fue asignado al técnico " + tecnico.getNombre());
    }

    public void agregarObservador(Observador observador) {
        listaObservadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        listaObservadores.remove(observador);
    }

    public void notificarCambio(String mensaje) {
        for (Observador observador : listaObservadores) {
            observador.recibirNotificacion(mensaje);
        }
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }
}