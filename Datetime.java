package revature;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datetime {
		public static void main(String[] args) {
			LocalDate date=LocalDate.now();
			System.out.println(date);
			
			LocalTime lt=LocalTime.now();
			System.out.println(lt);
			
			LocalDateTime dt=LocalDateTime.now();
			System.out.println(dt);
			
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E mm-dd-yyy HH:mm:ss");
			
			       String formatter   =dt.format(dtf);
			       System.out.println(formatter);
		}
}
