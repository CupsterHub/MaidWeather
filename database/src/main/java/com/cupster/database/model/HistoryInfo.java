package com.cupster.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Cupster on 2018/10/25.
 */
@Entity
public class HistoryInfo {

    /**
     * weaid : 1
     * week : 星期一
     * cityno : beijing
     * citynm : 北京
     * cityid : 101010100
     * uptime : 2015-07-20 00:50:00
     * temperature : 22℃
     * humidity : 97%
     * aqi : 101
     * weather : 晴
     * weather_icon : http://api.k780.com/upload/weather/d/0.gif
     * wind : 东北风
     * winp : 1级
     * temp : 22
     * weatid : 1
     * windid : 13
     * winpid : 201
     */
    @Id(autoincrement = true)
    private Long id;
    private String freshtime;
    private String weaid;
    private String week;
    private String cityno;
    private String citynm;
    private String cityid;
    private String uptime;
    private String temperature;
    private String humidity;
    private String aqi;
    private String weather;
    private String weather_icon;
    private String wind;
    private String winp;
    private int tempnum;
    private String weatid;
    private String windid;
    private String winpid;
    @Generated(hash = 220342634)
    public HistoryInfo(Long id, String freshtime, String weaid, String week,
            String cityno, String citynm, String cityid, String uptime,
            String temperature, String humidity, String aqi, String weather,
            String weather_icon, String wind, String winp, int tempnum,
            String weatid, String windid, String winpid) {
        this.id = id;
        this.freshtime = freshtime;
        this.weaid = weaid;
        this.week = week;
        this.cityno = cityno;
        this.citynm = citynm;
        this.cityid = cityid;
        this.uptime = uptime;
        this.temperature = temperature;
        this.humidity = humidity;
        this.aqi = aqi;
        this.weather = weather;
        this.weather_icon = weather_icon;
        this.wind = wind;
        this.winp = winp;
        this.tempnum = tempnum;
        this.weatid = weatid;
        this.windid = windid;
        this.winpid = winpid;
    }
    @Generated(hash = 1690888989)
    public HistoryInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFreshtime() {
        return this.freshtime;
    }
    public void setFreshtime(String freshtime) {
        this.freshtime = freshtime;
    }
    public String getWeaid() {
        return this.weaid;
    }
    public void setWeaid(String weaid) {
        this.weaid = weaid;
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
    public String getUptime() {
        return this.uptime;
    }
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
    public String getTemperature() {
        return this.temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getHumidity() {
        return this.humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    public String getAqi() {
        return this.aqi;
    }
    public void setAqi(String aqi) {
        this.aqi = aqi;
    }
    public String getWeather() {
        return this.weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public String getWeather_icon() {
        return this.weather_icon;
    }
    public void setWeather_icon(String weather_icon) {
        this.weather_icon = weather_icon;
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
    public int getTempnum() {
        return this.tempnum;
    }
    public void setTempnum(int tempnum) {
        this.tempnum = tempnum;
    }
    public String getWeatid() {
        return this.weatid;
    }
    public void setWeatid(String weatid) {
        this.weatid = weatid;
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
