package psd3.sprint2.object;

public class Session {
	String name;
	String date;
	String time;
	String venue;
	String duration;
	String repeatFrequency;
	String lecturer;
	int maxAttendance;
	boolean compulsary;

	public Session(String name, String date, String time, String venue,
			String duration, String repeatFrequency, String lecturer,
			int maxAttendance, boolean compulsary) {
		super();
		this.name = name;
		this.date = date;
		this.time = time;
		this.venue = venue;
		this.duration = duration;
		this.repeatFrequency = repeatFrequency;
		this.lecturer = lecturer;
		this.maxAttendance = maxAttendance;
		this.compulsary = compulsary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRepeatFrequency() {
		return repeatFrequency;
	}

	public void setRepeatFrequency(String repeatFrequency) {
		this.repeatFrequency = repeatFrequency;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int getMaxAttendance() {
		return maxAttendance;
	}

	public void setMaxAttendance(int maxAttendance) {
		this.maxAttendance = maxAttendance;
	}

	public boolean isCompulsary() {
		return compulsary;
	}

	public void setCompulsary(boolean compulsary) {
		this.compulsary = compulsary;
	}
}