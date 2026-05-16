package helpdesk;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTION DE INCIDENTES HELP DESK ===");

        // Singleton: única instancia del sistema
        SistemaHelpDesk sistema = SistemaHelpDesk.obtenerInstancia();

        // Usuarios del sistema
        UsuarioFinal usuario = new UsuarioFinal(1, "Carlos Mendoza", "carlos@institucion.edu.ec");
        TecnicoSoporte tecnicoRed = new TecnicoSoporte(1, "Luis Zambrano", "Redes");
        TecnicoSoporte tecnicoSoftware = new TecnicoSoporte(2, "Ana Vera", "Software");
        CoordinadorSoporte coordinador = new CoordinadorSoporte(1, "Ing. Patricia Moreira");
        AdministradorSistema administrador = new AdministradorSistema(1, "Administrador General");

        // Observer: se agregan observadores para recibir notificaciones
        sistema.agregarObservador(tecnicoRed);
        sistema.agregarObservador(tecnicoSoftware);
        sistema.agregarObservador(coordinador);

        // Factory Method: creación de ticket según el tipo de incidente
        Ticket ticket1 = usuario.crearTicket("red", "No existe conexión a internet en el área administrativa.", "Alta");
        Ticket ticket2 = usuario.crearTicket("software", "El sistema contable no permite iniciar sesión.", "Media");
        Ticket ticket3 = usuario.crearTicket("hardware", "El equipo no enciende correctamente.", "Alta");

        // Registro de tickets en el sistema
        sistema.registrarTicket(ticket1);
        sistema.registrarTicket(ticket2);
        sistema.registrarTicket(ticket3);

        // Clasificación y asignación
        administrador.clasificarIncidente(ticket1);
        administrador.asignarTecnico(ticket1, tecnicoRed);
        sistema.asignarTecnico(ticket1, tecnicoRed);

        // Atención del ticket
        tecnicoRed.atenderTicket(ticket1);
        tecnicoRed.registrarSolucion(ticket1, "Se reinició el switch principal y se verificó conectividad.");

        // Consulta de estado
        usuario.consultarEstado(ticket1);

        // Generar reporte
        ReporteSoporte reporte = new ReporteSoporte(1, "Reporte general de incidentes");
        reporte.generarReporte(sistema);
    }
}