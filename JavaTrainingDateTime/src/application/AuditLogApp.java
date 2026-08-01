package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AuditLogApp {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate date01 = LocalDate.now();
		LocalDateTime date02 = LocalDateTime.now();
		Instant date03 = Instant.now();

		LocalDate date04 = LocalDate.parse("2026-07-31");
		LocalDateTime date05 = LocalDateTime.parse("2026-07-31T13:02:31");
		Instant date06 = Instant.parse("2026-07-31T02:00:31Z");
		Instant date07 = Instant.parse("2026-07-31T13:02:31-03:00"); // Load London time with a minus 3-hour offset.

		LocalDate date08 = LocalDate.parse("31/07/2026", fmt1);
		LocalDateTime date09 = LocalDateTime.parse("31/07/2026 08:00", fmt2);
		LocalDate date10 = LocalDate.parse("31/07/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		LocalDate date11 = LocalDate.of(2026, 7, 31);
		LocalDateTime date12 = LocalDateTime.of(2026, 7, 31, 14, 25);

		System.out.println("data01: " + date01); // called toString implicitly, for example date1.toString(), format
													// ISO8601.
		System.out.println("date02: " + date02.toString());
		System.out.println("date03: " + date03);
		System.out.println("date04: " + date04);
		System.out.println("date05: " + date05);
		System.out.println("date06: " + date06);
		System.out.println("date07: " + date07);
		System.out.println("date08: " + date08);
		System.out.println("date09: " + date09);
		System.out.println("date10: " + date10);
		System.out.println("date11: " + date11);
		System.out.println("date12: " + date12);

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;

		System.out.println();
		System.out.println("DATA FORMAT TO STRING");
		System.out.println("date04: " + date04);
		System.out.println("date04: " + date04.format(fmt3));
		System.out.println("date04: " + fmt3.format(date04));
		System.out.println("date04: " + date04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("date05: " + date05.format(fmt3));
		System.out.println("date05: " + date05.format(fmt4));

		System.out.println("date06: " + fmt5.format(date06)); // when Instant may use TimeZone.
		System.out.println("date05: " + date05.format(fmt6)); // ISO_DATE_TIME
		System.out.println("date06: " + fmt7.format(date06)); // necessary ISO_Instant because has a TimeZone.
		System.out.println("date06: " + date06.toString());
		
		System.out.println();
		System.out.println("DATE AND TIME GLOBAL TO LOCAL");
		
		LocalDate r1 = LocalDate.ofInstant(date06, ZoneId.systemDefault());
		System.out.println("r1: " + r1 + " São Paulo");
		
		LocalDate r2 = LocalDate.ofInstant(date06, ZoneId.of("Portugal"));
		System.out.println("r2: " + r2 + " Portugal");
		
		LocalDateTime r3 = LocalDateTime.ofInstant(date06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(date06, ZoneId.of("Portugal"));
		
		System.out.println("r3: " + r3 + " São Paulo");
		System.out.println("r4: " + r4 + " Portugal");
		
		System.out.println("Get data from a local date and time");
		
		System.out.println("date04 dia of month: " + date04.getDayOfMonth());
		System.out.println("date04 day of the week: " + date04.getDayOfWeek());
		System.out.println("date04 day of the year: " + date04.getDayOfYear());
		System.out.println("date04 month number: " + date04.getMonthValue());
		System.out.println("date04 month: " + date04.getMonth());
		System.out.println("date04 year: " + date04.getYear());
		System.out.println("date05 hour: " + date05.getHour());
		System.out.println("date05 Minute: " + date05.getMinute());
		
		System.out.println();
		System.out.println("DATE AND TIME CALCULATION");
		
		LocalDate pastWeekLocalDate = date04.minusDays(7);
		System.out.println("Date04 pastWeekLocalDate = " + date04 + " - 7 Days = " + pastWeekLocalDate);
		
		LocalDate nextWeekLocalDate = date04.plusDays(7);
		System.out.println("Date04 nextWeekLocalDate = " + date04 + " + 7 Days = " + nextWeekLocalDate);
		
		System.out.println();
		System.out.println("CALCULOS COM DATA HORA LocalDateTime");
		
		LocalDateTime pastWeekLocalDateTime = date05.minusDays(7);
		System.out.println("Date05 pastWeekLocalDateTime = " + date05 + " - 7 days = " + pastWeekLocalDateTime);
		
		LocalDateTime nextWeekLocalDateTime = date05.plusDays(7);
		System.out.println("Date05 nextWeekLocalDateTime = " + date05 + " + 7 Days = " + nextWeekLocalDateTime);
		
		System.out.println();
		System.out.println("CALCULOS COM DATA HORA Instant");
		
		Instant pastWeekInstant = date06.minus(7, ChronoUnit.DAYS);
		System.out.println("Date05 pastWeekInstant = " + date06 + " - 7 Days = " + pastWeekInstant);
		
		Instant nextWeekInstant = date06.plus(7,ChronoUnit.DAYS);
		System.out.println("Date05 nextWeekInstant = " + date06 + " + 7 Days = " + nextWeekInstant);
		
		
		System.out.println();
		System.out.println("DURATION CALCULATION");
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, date05);
		System.out.println(t1.toDays() + " Days");
		System.out.println(t1.toMinutes() + " Minutes");
		

		System.out.println();
		System.out.println("DURATION CALCULATION LocalDate");
		
		//Duration t2 = Duration.between(pastWeekLocalDate, date04); It isn't possible because LocalDate doesn't have seconds.
		
		//correction:
		
		Duration t2 = Duration.between(pastWeekLocalDate.atTime(5, 30), date04.atTime(5, 30));
		System.out.println(t2.toDays() + " Days");
		
		Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), date04.atStartOfDay());
		System.out.println(t3.toDays() + " Days");
		
		Duration t4 = Duration.between(pastWeekLocalDateTime, date05);
		System.out.println(t4.toDays() + " Days");
		
		Duration t5 = Duration.between(pastWeekInstant, date06);
		System.out.println(t5.toDays() + " Days");
		
		Duration t6 = Duration.between(date06, pastWeekInstant);
		System.out.println(t6.toDays() + " Days");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	};

}
