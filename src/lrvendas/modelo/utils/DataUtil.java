package lrvendas.modelo.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

	
	public static SimpleDateFormat SDF_HD = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	public static SimpleDateFormat SDF_H = new SimpleDateFormat("HH:mm:ss");
	public static SimpleDateFormat SDF_D = new SimpleDateFormat("dd/MM/ss");
	public static Calendar CAL = Calendar.getInstance();
}
