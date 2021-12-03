package br.com.luish.management.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static boolean equalsDate(Date date1, Date date2) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		if(sdf.format(date1).equals(sdf.format(date2)))
			return true;
		
		return false;
		
	}

}
