package psd3.sprint2.object;

public class SessionSetup {
	String title;
	String start;
	String time;
	String venue;
	String duration;
	String repeatFrequency;
	String lecturer;
	int maxAttendance;
	boolean compulsary;

	public SessionSetup() {

	}

	public SessionSetup(String title, String start, String time, String venue,
			String duration, String repeatFrequency, String lecturer,
			int maxAttendance, boolean compulsary) {
		super();
		this.title = title;
		this.start = start;
		this.time = time;
		this.venue = venue;
		this.duration = duration;
		this.repeatFrequency = repeatFrequency;
		this.lecturer = lecturer;
		this.maxAttendance = maxAttendance;
		this.compulsary = compulsary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
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