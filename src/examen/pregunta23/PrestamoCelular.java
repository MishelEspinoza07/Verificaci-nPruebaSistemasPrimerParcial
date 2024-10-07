package examen.pregunta23;

public class PrestamoCelular {

    private disponiblee disponibilidad;
    private RegistrarPrestamo gestorPrestamos;

    public PrestamoCelular() {
        disponibilidad = new disponiblee();
        gestorPrestamos = new RegistrarPrestamo();
    }

    public void setDisponibilidad(disponiblee disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setGestorPrestamos(RegistrarPrestamo gestorPrestamos) {
        this.gestorPrestamos = gestorPrestamos;
    }

    public String procesarPrestamo(String modelo, String marca, String usuario) {
        if (disponibilidad.Disponible(modelo, marca)) {
            if (gestorPrestamos.registrarPrestamo(modelo, marca, usuario)) {
                return "El celular " + modelo + " de la marca " + marca + " ha sido prestado a " + usuario;
            } else {
                return "Datos incorrectos: " + modelo + ", " + marca + " o " + usuario + ". Por favor, ingrese información válida.";
            }
        }
        return "El celular " + modelo + " de la marca " + marca + " no está disponible.";
    }
}
