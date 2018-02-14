import java.util.Date;

public class EjemplosFechas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date fechaAyer = new Date();
		fechaAyer.setHours(11); // HORA
		fechaAyer.setDate(12); // DIA
		System.out.println("Fecha -> " + fechaAyer.toString());
		int hora = fechaAyer.getHours();
		System.out.println("Hora: " + hora);
		
		Date fechaHoy = new Date();
		if (fechaAyer.before(fechaHoy))
			System.out.println(fechaAyer + " es anterior a " + fechaHoy);
		
		if (fechaHoy.after(fechaAyer))
			System.out.println(fechaAyer + " es posterior a " + fechaHoy);
	}
}
