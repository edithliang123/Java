//present the given military time as regular time
class Clock {
	private int hours, minutes;
	private String clockform;
	public Clock() {
	hours = 0;
	minutes = 0;
	}
	public Clock (int h) {
		hours = h;	
	}
	public Clock (int h, int m) {
		hours = h;
		minutes = m;
	}
	public int getHour() {
		return hours;
	}
	public int getMinute() {
		return minutes;
	}
	public void incrementTimer() {
		minutes = minutes + 1;
		if(minutes >= 60) {
			hours = hours + (minutes/60);
			minutes = minutes - ((minutes/60) * 60);
		}
		if(hours == 24) {
			hours = 0;
		}
	}
	public void incrementTimer(int x) {
		minutes = minutes + x;
		if(minutes >= 60) {
			hours = hours + (minutes/60);
			minutes = minutes - ((minutes/60) * 60);
		}
		if(hours == 24) {
			hours = 0;
		}
	}
	public void setTime(int h, int m) {
		if ((h >= 0 && h <= 23) && (m >= 0 && m <= 59)) {
			hours = h;
			minutes = m;
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public String toString() {
		String hourform, minuteform;
		minuteform = "0";
		hourform = "0";
		String ampm = "";
		if(hours >= 0 && hours < 12) {
			ampm = "AM";
		}
		else {
			ampm = "PM";
		}
		if(hours == 0 && minutes < 10) {
			clockform = (hours + 12) + ":" + (minuteform + minutes) + " " + ampm;
		}
		else if(hours == 0 && minutes >= 10) {
			clockform = (hours + 12) + ":" + minutes + " " + ampm;
		}
		else {
			if(hours > 12 && minutes < 10) {
				if((hours - 12) >= 10) {
				clockform = (hours - 12) + ":" + (minuteform + minutes) + " " + ampm;
				}
				else {
					clockform = (hourform + (hours - 12)) + ":" + (minuteform + minutes) + " " + ampm;
				}
				}
			if(hours < 12 && minutes < 10) {
				if(hours >= 10) {
					clockform = hours + ":" + (minuteform + minutes) + " " + ampm;
					}
				else {
				clockform = (hourform + hours) + ":" + (minuteform + minutes) + " " + ampm;
				}
				}
			if(hours > 12 && minutes >= 10) {
				if((hours - 12) >= 10) {
					clockform = (hours - 12) + ":" + minutes + " " + ampm;
					}
					else {
						clockform = (hourform + (hours - 12)) + ":" + minutes + " " + ampm;
					}
			}
			if(hours < 12 && minutes >= 10) {
				if(hours >= 10) {
					clockform = hours + ":" + minutes + " " + ampm;
					}
				else {
				clockform = (hourform + hours) + ":" + minutes + " " + ampm;
				}
				}
			if(hours == 12 && minutes < 10) {
				clockform = hours + ":" + (minuteform + minutes) + " " + ampm;
			}
			if(hours == 12 && minutes >= 10) {
				clockform = hours + ":" + minutes + " " + ampm;
			}
		}
		return clockform;
	}
}
