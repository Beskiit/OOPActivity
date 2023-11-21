package OOPactivity;

import java.util.Scanner;
import java.time.LocalTime;

public class Monday extends Weekday{
	
	public static String alarmClock;
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter time alarm in this format (HH:MM): ");
		String clock = sc.next();
		
		setAlarm(clock);
		showAlarm();
	}
	public static void setAlarm(String time) {
		alarmClock = time;
	}
	
	public static void showAlarm() {
		LocalTime alarm = LocalTime.parse(alarmClock);
		LocalTime now = LocalTime.now();
		
		if(alarm.isBefore(now)) {
			System.out.println("Alarm is set tomorrow!");
		}else{
			System.out.println("I'll wake you up later!");
		}
	}
}
