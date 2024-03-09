package genericutility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber(int limit) {
		Random random=new Random();
		int randomNumber=random.nextInt(limit);
		return randomNumber;
	}
	
	public String getSystemDateWithTime() {
		Date dateObj=new Date();
		String dateActualFormat=dateObj.toString();
		String date=dateActualFormat.replace(" ", "_").replace(":", "_");
		return date;
	}
	
	public String getSystemDateinDDMMYYYYformat() {
		Date dateObj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(dateObj);
		return date;
	}
	
	
}
