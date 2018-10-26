package com.cupster.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 实时天气
 * Created by Cupster on 2018/10/22.
 */
@Entity
public class TodayInfo {
    /**
     * 数据获取时间: 格式可变  暂定 02-25-08-00
     * success : 1
     * weaid : 1
     * days : 2018-02-25
     * week : 星期日
     * cityno : beijing
     * citynm : 北京
     * cityid : 101010100
     * temperature : 6℃/-3℃
     * temperature_curr : 6℃
     * humidity : 27%
     * weather : 多云
     * weather_curr : 多云
     * weather_icon : http://api.k780.com/upload/weather/d/1.gif
     * weather_icon1 :
     * wind : 西南风
     * winp : 3级
     * temp_high : 6
     * temp_low : -3
     * temp_curr : 6
     * humi_high : 0
     * humi_low : 0
     * weatid : 2
     * weatid1 :
     * windid : 16
     * winpid : 202
     */
    @Id(autoincrement = true)
    private Long id ;
    private String freshTime;
    private String success;
    private String weaid;
    private String days;
    private String week;
    private String cityno;
    private String citynm;
    private String cityid;
    private String temperature;
    private String temperature_curr;
    private String humidity;
    private String weather;
    private String weather_curr;
    private String weather_icon;
    private String weather_icon1;
    private String wind;
    private String winp;
    private String temp_high;
    private String temp_low;
    private String temp_curr;
    private String humi_high;
    private String humi_low;
    private String weatid;
    private String weatid1;
    private String windid;
    private String winpid;
    @Generated(hash = 211098048)
    public TodayInfo(Long id, String freshTime, String success, String weaid,
            String days, String week, String cityno, String citynm, String cityid,
            String temperature, String temperature_curr, String humidity,
            String weather, String weather_curr, String weather_icon,
            String weather_icon1, String wind, String winp, String temp_high,
            String temp_low, String temp_curr, String humi_high, String humi_low,
            String weatid, String weatid1, String windid, String winpid) {
        this.id = id;
        this.freshTime = freshTime;
        this.success = success;
        this.weaid = weaid;
        this.days = days;
        this.week = week;
        this.cityno = cityno;
        this.citynm = citynm;
        this.cityid = cityid;
        this.temperature = temperature;
        this.temperature_curr = temperature_curr;
        this.humidity = humidity;
        this.weather = weather;
        this.weather_curr = weather_curr;
        this.weather_icon = weather_icon;
        this.weather_icon1 = weather_icon1;
        this.wind = wind;
        this.winp = winp;
        this.temp_high = temp_high;
        this.temp_low = temp_low;
        this.temp_curr = temp_curr;
        this.humi_high = humi_high;
        this.humi_low = humi_low;
        this.weatid = weatid;
        this.weatid1 = weatid1;
        this.windid = windid;
        this.winpid = winpid;
    }
    @Generated(hash = 687036611)
    public TodayInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFreshTime() {
        return this.freshTime;
    }
    public void setFreshTime(String freshTime) {
        this.freshTime = freshTime;
    }
    public String getSuccess() {
        return this.success;
    }
    public void setSuccess(String success) {
        this.success = success;
    }
    public String getWeaid() {
        return this.weaid;
    }
    public void setWeaid(String weaid) {
        this.weaid = weaid;
    }
    public String getDays() {
        return this.days;
    }
    public void setDays(String days) {
        this.days = days;
    }
    public String getWeek() {
        return this.week;
    }
    public void setWeek(String week) {
        this.week = week;
    }
    public String getCityno() {
        return this.cityno;
    }
    public void setCityno(String cityno) {
        this.cityno = cityno;
    }
    public String getCitynm() {
        return this.citynm;
    }
    public void setCitynm(String citynm) {
        this.citynm = citynm;
    }
    public String getCityid() {
        return this.cityid;
    }
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }
    public String getTemperature() {
        return this.temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getTemperature_curr() {
        return this.temperature_curr;
    }
    public void setTemperature_curr(String temperature_curr) {
        this.temperature_curr = temperature_curr;
    }
    public String getHumidity() {
        return this.humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public String getWeather() {
        return this.weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public String getWeather_curr() {
        return this.weather_curr;
    }
    public void setWeather_curr(String weather_curr) {
        this.weather_curr = weather_curr;
    }
    public String getWeather_icon() {
        return this.weather_icon;
    }
    public void setWeather_icon(String weather_icon) {
        this.weather_icon = weather_icon;
    }
    public String getWeather_icon1() {
        return this.weather_icon1;
    }
    public void setWeather_icon1(String weather_icon1) {
        this.weather_icon1 = weather_icon1;
    }
    public String getWind() {
        return this.wind;
    }
    public void setWind(String wind) {
        this.wind = wind;
    }
    public String getWinp() {
        return this.winp;
    }
    public void setWinp(String winp) {
        this.winp = winp;
    }
    public String getTemp_high() {
        return this.temp_high;
    }
    public void setTemp_high(String temp_high) {
        this.temp_high = temp_high;
    }
    public String getTemp_low() {
        return this.temp_low;
    }
    public void setTemp_low(String temp_low) {
        this.temp_low = temp_low;
    }
    public String getTemp_curr() {
        return this.temp_curr;
    }
    public void setTemp_curr(String temp_curr) {
        this.temp_curr = temp_curr;
    }
    public String getHumi_high() {
        return this.humi_high;
    }
    public void setHumi_high(String humi_high) {
        this.humi_high = humi_high;
    }
    public String getHumi_low() {
        return this.humi_low;
    }
    public void setHumi_low(String humi_low) {
        this.humi_low = humi_low;
    }
    public String getWeatid() {
        return this.weatid;
    }
    public void setWeatid(String weatid) {
        this.weatid = weatid;
    }
    public String getWeatid1() {
        return this.weatid1;
    }
    public void setWeatid1(String weatid1) {
        this.weatid1 = weatid1;
    }
    public String getWindid() {
        return this.windid;
    }
    public void setWindid(String windid) {
        this.windid = windid;
    }
    public String getWinpid() {
        return this.winpid;
    }
    public void setWinpid(String winpid) {
        this.winpid = winpid;
    }

}
