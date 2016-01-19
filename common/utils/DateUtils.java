package com.syscredit.resource.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @包名 ：com.minimaxhk.resourse.commons.utils<br>
 * @文件名 ：DateUtils.java<br>
 * @类描述 ：日期工具类<br>
 * @作者 ：Gavin<br>
 * @创建时间 ：2015-1-26下午01:21:57<br>
 * @更改人 ：<br>
 * @更改时间 ：<br>
 */
public class DateUtils {

	public static final String SIMPLE_DATE="yyyy-MM-dd";
	public static final String STANDRARD_DATE="yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 方法名 ：stringToDate<br>
	 * 方法描述 ：字符串转化为Date<br>
	 * 创建者 ：Gavin<br>
	 * 创建时间 ：2015-1-26下午01:51:01 <br>
	 * @param strDate
	 * @param pattern
	 * @return
	 * 返回类型 ：Date
	 */
	public static Date stringToDate(String strDate,String pattern){
		if(strDate == null || strDate.equals("")){
			throw new RuntimeException("string type for date null!");
		}
		if(pattern == null || pattern.equals("")){
			pattern = DateUtils.SIMPLE_DATE;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	
}
