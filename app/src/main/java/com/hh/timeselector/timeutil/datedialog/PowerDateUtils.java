package com.hh.timeselector.timeutil.datedialog;

import android.text.format.DateFormat;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PowerDateUtils {
	/**
	 * 
	 * @return 11/11
	 * @see [类、类#方法、类#成员]
	 */
	public static String getMyformatDate(String time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String newDate = "";
		try {
			Date date = sdf.parse(time);
			SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd");
			newDate = sdf1.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return newDate;
	}

	/**
	 * 返回日期字符串，格式：yyyy-MM-dd 返回日期字符串
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @return String
	 */
	public static String getDateStr(int year, int month, int day, int hour,
									int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date2String(time);
	}

	public static String getDateStr1(int year, int month, int day, int hour,
			int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date8String(time);
	}

	public static String getDateStr2(int year, int month, int day, int hour,
			int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date9String(time);
	}

	public static String getDateStr2(int year, int month, int day, int hour) {
		long time = componentTimeToTimestamp(year, month, day, hour);

		return Date9String(time);
	}

	/**
	 * 返回日期字符串，格式：yyyy-MM-dd 返回日期字符串
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return String
	 */
	public static String getDateStr(int year, int month, int day, int hour) {
		long time = componentTimeToTimestamp(year, month, day, hour);

		return Date3String(time);
	}

	public static String getDateStr1(int year, int month, int day, int hour) {
		long time = componentTimeToTimestamp(year, month, day, hour);

		return Date4String(time);
	}

	public static String getDateStr12(int year, int month, int day, int hour) {
		long time = componentTimeToTimestamp(year, month, day, hour);

		return Date12String(time);
	}

	/**
	 * 返回日期字符串，格式：yyyy-MM-dd 返回日期字符串
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return String
	 */
	public static String getDateStr(int year, int month, int day) {
		long time = componentTimeToTimestamp(year, month, day);

		return Date5String(time);
	}

	/**
	 * 返回日期字符串，格式：yyyy-MM-dd 返回日期字符串
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return String
	 */
	public static String getRainDateStr(int year, int month, int day, int hour) {
		long time = componentTimeToTimestamp(year, month, day, hour);

		return Date4String(time);
	}

	public static String getRainDateStr(int year, int month, int day, int hour,
			int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date7String(time);
	}

	public static String getRainDateStr1(int year, int month, int day,
			int hour, int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date8String(time);
	}

	public static String getRainDateStr2(int year, int month, int day,
			int hour, int minute) {
		long time = componentTimeToTimestamp(year, month, day, hour, minute);

		return Date11String(time);
	}

	public static String getDateStr(int hour, int minute) {
		long time = componentTimeToTimestamp(hour, minute);

		return Date6String(time);
	}

	/**
	 * 
	 * 将时间转化成时间戳
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月
	 * @param day
	 *            日
	 * @param hour
	 *            小时
	 * @param minute
	 *            分钟
	 * @return 时间戳 long
	 */
	public static long componentTimeToTimestamp(int year, int month, int day,
			int hour, int minute) {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);

		c.set(Calendar.MONTH, month);

		c.set(Calendar.DAY_OF_MONTH, day);

		c.set(Calendar.HOUR_OF_DAY, hour);

		c.set(Calendar.MINUTE, minute);

		c.set(Calendar.SECOND, 0);

		c.set(Calendar.MILLISECOND, 0);

		return c.getTimeInMillis();
	}

	public static Calendar getCalendarDate(String dateString) {
		int year = 0;
		int month = 0;
		int day = 0;
		String[] arraydate = null;
		if (null != dateString && dateString.contains("-")) {
			arraydate = dateString.split("-");
		}
		if (null != arraydate && arraydate.length == 3) {
			year = Integer.parseInt(arraydate[0]);
			month = Integer.parseInt(arraydate[1]) - 1;
			day = Integer.parseInt(arraydate[2]);
		}

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);

		c.set(Calendar.MONTH, month);

		c.set(Calendar.DAY_OF_MONTH, day);

		return c;

	}

	/**
	 * 
	 * 将时间转化成时间戳
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月
	 * @param day
	 *            日
	 * @param hour
	 *            小时
	 *            分钟
	 * @return 时间戳 long
	 */
	public static long componentTimeToTimestamp(int year, int month, int day,
			int hour) {

		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);

		c.set(Calendar.MONTH, month);

		c.set(Calendar.DAY_OF_MONTH, day);

		c.set(Calendar.HOUR_OF_DAY, hour);

		c.set(Calendar.SECOND, 0);

		c.set(Calendar.MILLISECOND, 0);

		return c.getTimeInMillis();
	}

	public static long componentTimeToTimestamp(int hour, int minute) {

		Calendar c = Calendar.getInstance();

		c.set(Calendar.HOUR_OF_DAY, hour);

		c.set(Calendar.MINUTE, minute);

		c.set(Calendar.SECOND, 0);

		c.set(Calendar.MILLISECOND, 0);

		return c.getTimeInMillis();
	}

	/**
	 * 
	 * 将时间转化成时间戳
	 * 
	 * @param year
	 *            年
	 * @param month
	 *            月
	 * @param day
	 *            日
	 */
	public static long componentTimeToTimestamp(int year, int month, int day) {

		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, year);

		c.set(Calendar.MONTH, month);

		c.set(Calendar.DAY_OF_MONTH, day);

		return c.getTimeInMillis();
	}

	/**
	 * 时间转换成yyyy-MM-dd kk:mm格式
	 * 
	 * @param time
	 *            时间
	 * @return
	 */
	public static String Date2String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd kk:mm", time).toString();
	}

	public static String Date13String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy年MM月dd日 kk:mm", time).toString();
	}

	/**
	 * 时间转换成yyyy-MM-dd kk格式
	 * 
	 * @param time
	 *            时间
	 * @return
	 */
	public static String Date3String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd kk", time).toString();
	}

	/**
	 * 时间转换成yyyy-MM-dd kk格式
	 * 
	 * @param time
	 *            时间
	 * @return
	 */
	public static String Date4String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy年MM月dd日kk时", time).toString();
	}

	public static String Date12String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd", time).toString();
	}

	public static String Date11String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy年MM月dd日kk时mm分", time).toString();
	}

	/**
	 * 时间转换成yyyy-MM-dd格式
	 * 
	 * @param time
	 *            时间
	 * @return
	 */
	public static String Date5String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd", time).toString();
	}

	public static String Date6String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("kk:mm", time).toString();
	}

	public static String Date7String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy年MM月dd日kk时mm分", time).toString();
	}

	public static String Date8String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd kk:mm", time).toString();
	}

	public static String Date9String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd-kk", time).toString();
	}

	public static String Date99String(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd kk", time).toString();
	}

	/**
	 * 时间转换成yyyy-MM-dd 格式
	 * 
	 * @param time
	 *            时间
	 * @return
	 */
	public static String Date2String2(long time) {
		if (time == 0) {
			return "";
		}
		return DateFormat.format("yyyy-MM-dd", time).toString();
	}

	public static String getNowDateString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		String str = formatter.format(curDate);
		return str;

	}

	public static String getNowDateString3() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
		Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		String str = formatter.format(curDate);
		return str;

	}

	public static String getNowDateString2() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		String str = formatter.format(curDate);
		return str;

	}

	public static String getNowDetailsDateString() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");
		Date curDate = new Date(System.currentTimeMillis());// 获取当前时间
		String str = formatter.format(curDate);
		return str;

	}

	public static String getNowGisDateString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date curDate = new Date(System.currentTimeMillis() - 20 * 60 * 1000);// 获取当前时间
		curDate.setMinutes(curDate.getMinutes() / 10 * 10);
		String str = formatter.format(curDate);
		Log.i("time", "getNowGisDateString" + str);
		return str;

	}

	/*
	 * 累积雨量结束时间
	 */
	public static String getNowRainEndDateString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date curDate = new Date(System.currentTimeMillis());
		return formatter.format(curDate);
	}

	/*
	 * 累积雨量开始时间
	 */
	public static String getNowRainStartDateString() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date curDate = new Date(System.currentTimeMillis());
		curDate.setDate(curDate.getDate() - 1);
		return formatter.format(curDate);
	}

	/**
	 * 向前10分钟
	 * 
	 * @param date
	 * @return
	 */
	public static String getNowGisDateForwardString(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String str = null;
		try {
			Date curDate = new Date(
					formatter.parse(date).getTime() + 10 * 60 * 1000);
			curDate.setMinutes(curDate.getMinutes() / 10 * 10);
			str = formatter.format(curDate);
			Log.i("time", "getNowGisDateForwardString" + str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;

	}

	/**
	 * 向后10分钟
	 * 
	 * @param date
	 * @return
	 */
	public static String getNowGisDateBackwardsString(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String str = null;
		try {
			Date curDate = new Date(
					formatter.parse(date).getTime() - 10 * 60 * 1000);
			curDate.setMinutes(curDate.getMinutes() / 10 * 10);
			str = formatter.format(curDate);
			Log.i("time", "getNowGisDateBackwardsString" + str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return str;

	}

	/**
	 * 将毫秒数转为时间年
	 * 
	 * @return yyyy
	 */
	public static String timeMillis2String1(Object object) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String dateStr = sdf.format(object);

		return dateStr;
	}

	public static String timeMillis2String2(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		String dateStr = sdf.format(time);

		return dateStr;
	}

	// public static String toTime(long time) {
	// SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	// return sdf.format(time * 1000).toString();
	// }
	public static String toTime1(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return sdf.format(time).toString();
	}

	public static String toTime(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		return sdf.format(time * 1000).toString();
	}

	/**
	 * 
	 * @param date
	 *            推送消息发送的时间
	 * @param aging
	 *            推送消息时效
	 * @return
	 */
	public static Boolean isTimeExceedAging(String date, String aging) {
		if (date.trim() == null || date.trim().equals("")
				|| date.trim().equals("null") || aging.trim() == null
				|| aging.trim().equals("") || aging.trim().equals("null")) {
			return false;
		}
		try {
			int mAging = Integer.parseInt(aging);
			String nowDate = Date2String(System.currentTimeMillis());
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm");
			long time = formatter.parse(date).getTime();
			long nowtime = formatter.parse(nowDate).getTime();
			if (nowtime - time < mAging * 60 * 1000) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		return false;

	}

	public static String toTime2(long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("kk:00");
		return sdf.format(time).toString();
	}

	public static Boolean canBidOnCurrentTime(String pPeriodValidity) throws Exception  {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String time = df.format(System.currentTimeMillis());
		Date datap = df.parse(pPeriodValidity);
		Date datat = df.parse(time);
		long diff = datap.getTime() - datat.getTime();// 这样得到的差值是微秒级别
		long days = diff / (1000 * 60 * 60 * 24);
		long hours = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
		long minutes = (diff - days * (1000 * 60 * 60 * 24) - hours
				* (1000 * 60 * 60))
				/ (1000 * 60);
		System.out.println("" + days + "天" + hours + "小时" + minutes + "分");
		if(days!=0)
		{
			//相差时间为天，肯定不会到竞价
			return false;
		}
		if(hours<4)
		{
			return false;
		}
		if(hours>5)
		{
			return false;
		}
		return true;
		
//		if (hours > 3 && hours < 6) {
//			return true;
//		}
//		return false;
		
	}
}
