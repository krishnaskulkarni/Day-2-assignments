class Time{
	int hour;
	int minute;

	public void setTime(int hour,int minute){
		this.hour = hour;
		this.minute = minute;
	}
	public void showTime(){
		System.out.println("time is = "+hour+" hour "+minute+" minute");

	}
	public void addTime(Time t1, Time t2){
		this.hour = t1.hour + t2.hour;
		this.minute = t1.minute + t2.minute;
	}
}