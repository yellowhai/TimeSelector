
# TimeSelector
# 日期选择控件<br>
![](https://github.com/yellowhai/TimeSelector/blob/master/timeVideo.gif)  
##2019.3.6更新
  * 修改不同月份天数不一致，导致的的滑动月份返回时间错乱的问题，该问题只在月份天数不同时会出现且日期为28号以后，再次调月份才会出现。

##2019.2.2更新
  * 修改以下默认时间格式显示不正确问题
       ``` Java
         dialog.setCurrentDate("2019-02-22　08");//默认时间
       ```  
##2018.12.25更新
  
  * 可修改dialog部分样式，如日期的字体大小,初始是14，最大设置不能超过40，超过则默认设置20（为控件体验）
       ``` Java
        dialog.setTextSize(14);//修改字体大小
       ```  
  * 可设置dialog边框颜色等，在项目colors类里定义对应名称，填写色值即可
       ``` Java
            <color name="title_color_h">#ffffff</color>
            <color name="style_color_h">#3185fc</color>
            <color name="line_color_h">#cdcdcd</color>
            <color name="item_text_color_h">#b5b5b5</color>
            <color name="value_text_color_h">#000000</color>
       ```  

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
            compile 'com.github.yellowhai:TimeSelector:1.8.7'
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
  
  
  ##Demo下载后记得修改依赖版本，目前最新版本1.8.7！
  
  ##Demo下载后记得修改依赖版本，目前最新版本1.8.7！
  
  ##Demo下载后记得修改依赖版本，目前最新版本1.8.7！
  
  ##Demo：http://download.csdn.net/detail/huang15984/9735621
  
  ##博客：https://blog.csdn.net/huang15984/article/details/54376415
  
