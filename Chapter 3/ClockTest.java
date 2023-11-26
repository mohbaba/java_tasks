
public class ClockTest{

	public static void main(String[]args){

	Clock clock1 = new Clock(21,38,50);
	Clock clock2 = new Clock(24,35,60);
	
	int hour1 = clock1.getHour();
	int hour2 = clock2.getHour();

	int minute1 = clock1.getMinute();
	int minute2 = clock2.getMinute();

	int second1 = clock1.getSecond();
	int second2 = clock2.getSecond();

	
	clock1.displayTime();
	System.out.println();
	clock2.displayTime();
	System.out.println();

	














}







}