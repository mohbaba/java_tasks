public class Clock{

	private int second;
	private int minute;
	private int hour;


	public Clock(int hour, int minute, int second){
		this.minute = minute;
		this.hour = hour;
		this.second = second;
		if(hour > 23){this.hour = 0;}
		if(minute > 59){this.minute = 0;}
		if(second > 59){this.second = 0;}
		
		
	}

	public void setSecond(int second){
		this.second = second;
	}
	
	public int getSecond(){
		return second;
	}

	public void setMinute(int minute){
		this.minute = minute;
		
	}

	public int getMinute(){
		return minute;
	}

	public void setHour(int hour){
		this.hour = hour;
		
	}

	public int getHour(){
		return hour;
	}

	
	public void displayTime(){
		System.out.printf("%d:%d:%d",getHour(),getMinute(),getSecond());
	}
	




}