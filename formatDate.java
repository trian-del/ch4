import java.time.*;
public class formatDate {
	
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		
		printAmerican(d.getDayOfWeek() ,  d.getMonth(), d.getYear(), d.getDayOfMonth());
		printEuropean(d.getDayOfWeek() ,  d.getMonth(), d.getYear(), d.getDayOfMonth());
	}
	
	public static void printAmerican(DayOfWeek day, Month month, int year, int date) {
		System.out.println(day + ", " + month + " " + date + "th, " + year);
	}
	
	public static void printEuropean(DayOfWeek day, Month month, int year, int date) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
}
		

