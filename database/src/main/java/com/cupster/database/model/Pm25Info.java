package com.cupster.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 *
 * Pm25 信息
 * Created by Cupster on 2018/10/25.
 */
@Entity
public class Pm25Info {
    /**
     * success : 1
     * freshtime：刷新时间
     * weaid : 1
     * cityno : beijing
     * citynm : 北京
     * cityid : 101010100
     * aqi : 95
     * aqi_scope : 50-100
     * aqi_levid : 2
     * aqi_levnm : 良
     * aqi_remark : 可以正常进行室外活动
     */
    @Id
    private long id;
    private String freshtime;
    private String weaid;
    private String cityno;
    private String citynm;
    private String cityid;
    private String aqi;
    private String aqi_scope;
    private String aqi_levid;
    private String aqi_levnm;
    private String aqi_remark;
    @Generated(hash = 74713877)
    public Pm25Info(long id, String freshtime, String weaid, String cityno,
            String citynm, String cityid, String aqi, String aqi_scope,
            String aqi_levid, String aqi_levnm, String aqi_remark) {
        this.id = id;
        this.freshtime = freshtime;
        this.weaid = weaid;
        this.cityno = cityno;
        this.citynm = citynm;
        this.cityid = cityid;
        this.aqi = aqi;
        this.aqi_scope = aqi_scope;
        this.aqi_levid = aqi_levid;
        this.aqi_levnm = aqi_levnm;
        this.aqi_remark = aqi_remark;
    }
    @Generated(hash = 1342031677)
    public Pm25Info() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
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
    public String getAqi() {
        return this.aqi;
    }
    public void setAqi(String aqi) {
        this.aqi = aqi;
    }
    public String getAqi_scope() {
        return this.aqi_scope;
    }
    public void setAqi_scope(String aqi_scope) {
        this.aqi_scope = aqi_scope;
    }
    public String getAqi_levid() {
        return this.aqi_levid;
    }
    public void setAqi_levid(String aqi_levid) {
        this.aqi_levid = aqi_levid;
    }
    public String getAqi_levnm() {
        return this.aqi_levnm;
    }
    public void setAqi_levnm(String aqi_levnm) {
        this.aqi_levnm = aqi_levnm;
    }
    public String getAqi_remark() {
        return this.aqi_remark;
    }
    public void setAqi_remark(String aqi_remark) {
        this.aqi_remark = aqi_remark;
    }

}
