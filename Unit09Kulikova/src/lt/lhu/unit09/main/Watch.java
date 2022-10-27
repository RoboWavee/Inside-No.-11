package lt.lhu.unit09.main;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения 
его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений 
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Watch {

	private int hour;
	private int minute;
	private int second;

	public Watch() {

		hour = 0;
		minute = 0;
		second = 0;
	}

	public Watch(int hour, int minute, int second) {

		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}

		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}

		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 0 || hour > 23) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public void addTime(int hour, int minute, int second) {

		if (hour < 0 || hour > 23) {
			throw new RuntimeException("add correct hour");
		}

		this.hour = this.hour + hour;
		this.minute = this.minute + minute;
		this.second = this.second + second;

		if (this.second >= 60) {
			int temp = this.second / 60;
			this.second = this.second % 60;
			this.minute = this.minute + temp;
		}

		if (this.minute >= 60) {
			int temp = this.minute / 60;
			this.minute = this.minute % 60;
			this.hour = this.hour + temp;
		}
		if (this.hour >= 23) {
			int temp = this.hour / 24;
			this.hour = this.hour % 24;
			this.hour = this.hour + temp;
		}

	}

	public void print() {
		System.out.printf("Time: " + "%02d:%02d:%02d", hour, minute, second);
	}

}
