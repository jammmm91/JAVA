import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 날짜계산 {
	public static void main(String[] args) throws ParseException {
		String timeStamp = new SimpleDateFormat().format(Calendar.getInstance().getTime());
		System.out.println("1) " + timeStamp);
		System.out.println("2) " + Calendar.getInstance().getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf1.parse("2020-10-01");
		Calendar cal1 = sdf1.getCalendar();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = sdf2.parse("2020-11-21");
		Calendar cal2 = sdf2.getCalendar();
				
		System.out.println("3) " + cal1.getTime());
		System.out.println("4) " + cal2.getTime());
		
		long time1 = cal1.getTimeInMillis();
		long time2 = cal2.getTimeInMillis();
		
		long diffTime = time1 - time2;
		long days = diffTime / 1000 / 60 / 60 / 24;
		System.out.println("5) " + days);
	}
}