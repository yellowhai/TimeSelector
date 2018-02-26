
# TimeSelector
# 日期选择控件<br>
![](https://github.com/yellowhai/TimeSelector/blob/master/timeVideo.gif)  

##TimeConfig

   * YEAR_MONTH_DAY_HOUR_MINUTE--年、月、日、时、分
   * YEAR_MONTH_DAY_HOUR--年、月、日、时
   * YEAR_MONTH_DAY--年、月、日
   * HOUR_MINUTE--时、分
   * YEAR_MONTH--年、月

##how to use

 * Add it in your root build.gradle at the end of repositories
    ``` Java
      allprojects {
           repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
        }
    ```
 
 
 
 * Add the dependency
  ``` Java
    dependencies {
            compile 'com.github.yellowhai:TimeSelector:1.5'
    }
  ```
    
 * java
  ``` Java
  TimeSelectorDialog dialog = new TimeSelectorDialog(this);
        //设置标题
        dialog.setTimeTitle("选择时间:");
        //显示类型
        dialog.setIsShowtype(TimeConfig.YEAR_MONTH_DAY_HOUR_MINUTE);
        //默认时间
        dialog.setCurrentDate("2017-01-11　14:50");
        //隐藏清除按钮
        dialog.setEmptyIsShow(false);
         //设置起始时间
        dialog.setStartYear(1888);
        dialog.setDateListener(new DateListener() {
            @Override
            public void onReturnDate(String time,int year, int month, int day, int hour, int minute, int isShowType) {
                Toast.makeText(mContext,time,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onReturnDate(String empty) {
                Toast.makeText(mContext,empty,Toast.LENGTH_LONG).show();
            }
        });
        dialog.show();
  ``` 
  
  ##Demo：http://download.csdn.net/detail/huang15984/9735621
  
