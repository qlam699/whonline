package com.donglam.webhoconline.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class UtilDate {
	public static String changeDateTime(String oldDateString, boolean btSangLa) throws ParseException {
		// mac dinh la bt sang la
		String OLD_FORMAT = "dd-MM-yyyy HH:mm:ss";
		String NEW_FORMAT = "yyyy-MM-dd HH:mm:ss";
		if (!btSangLa) {
			NEW_FORMAT = "dd-MM-yyyy HH:mm:ss";
			OLD_FORMAT = "yyyy-MM-dd HH:mm:ss";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		Date d = sdf.parse(oldDateString);
		sdf.applyPattern(NEW_FORMAT);
		return sdf.format(d);
	}
}
