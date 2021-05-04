import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 기념일계산메소드 {
	Calendar dDay;
	int days;
	
	기념일계산메소드(String dateString) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(dateString);
			this.dDay = sdf.getCalendar();
		} catch (ParseException e) {
		}
	}
	
	public void calulationDDay() {
		long now = Calendar.getInstance().getTimeInMillis();
		long ddayTime = this.dDay.getTimeInMillis();
		
		long diffTime = now - ddayTime;
		this.days = (int)Math.ceil((double)diffTime / 1000 / 60 / 60 / 24);
	}
	
	@Override
	public String toString() {
		return "D-day : " + this.days;
	}
}