package com.hh.timeselector.timeutil.datedialog;

/**
 * TimeSelector
 * classes : com.hh.timeselector.timeutil.datedialog
 * 作者：huanghai on 2017/1/11 14:41
 */

public interface DateListener {
    void onReturnDate(String time,int year, int month, int day, int hour, int minute, int isShowType);

    void onReturnDate(String empty);
}
