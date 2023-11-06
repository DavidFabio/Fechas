import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main (String [] args) {
	LocalDateTime fechaHoraLocal = LocalDateTime.now();
	ZoneId zonaCaracas = ZoneId.of("");
	ZonedDateTime fechaHoraCaracas = ZonedDateTime.of(fechaHoraLocal, zonaCaracas);
	int añoDescubrimiento = 1492;
	int añoActual = fechaHoraLocal.getYear();
	int añosTranscurridos = añoActual - añoDescubrimiento;
	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("");
	String horaLocal = fechaHoraLocal.format(formatoHora);
	String horaCaracas = fechaHoraCaracas.format(formatoHora);
	ZoneOffset zonaHorariaMadrid = ZoneOffset.ofHours(1);
	ZoneOffset zonaHorariaCaracas = ZoneOffset.ofHours(-4);
	int HorasDiferencia = zonaHorariaMadrid.getTotalSeconds() - zonaHorariaMadrid.getTotalSeconds();
	LocalDateTime llegadaLuna = LocalDateTime.of(1969, 7, 21, 3, 56);
	DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("");
	
	System.out.println("1.Fecha y hora actual en España: " + fechaHoraLocal.format(formatoFechaHora));
	System.out.println("2.Fecha y hora actual en Caracas: " + fechaHoraCaracas.format(formatoFechaHora));
	System.out.println("3.Años transcurridos desde el descubrimiento de América:"+ añosTranscurridos + "años");
	System.out.println("4.Hora actual en España: " + horaLocal);
	System.out.println("5.Hora actual en Caracas: " + horaCaracas);
	System.out.println("6.Horas de diferencia entre Madrid y Caracas: " + HorasDiferencia + "horas");
	System.out.println("7.Fecha y hora de la llegada de Neil Armstrong a la Luna en España: "+ llegadaLuna.format(formatoFechaHora));
	
	}
}
