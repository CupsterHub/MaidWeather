package com.cupster.database.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Cupster on 2018/10/25.
 */
@Entity
public class LifeIndexInfo {

    /**
     * success : 1
     * weaid : 1
     * days : 2018-02-25
     * week_1 : 星期日
     * simcode : beijing
     * citynm : 北京
     * cityid : 101010100
     * lifeindex_uv_id : 110
     * lifeindex_uv_typeno : uv
     * lifeindex_uv_typenm : 紫外线指数
     * lifeindex_uv_attr : 最弱
     * lifeindex_uv_dese : 辐射弱，涂擦SPF8-12防晒护肤品。
     * lifeindex_gm_id : 111
     * lifeindex_gm_typeno : gm
     * lifeindex_gm_typenm : 感冒指数
     * lifeindex_gm_attr : 少发
     * lifeindex_gm_dese : 无明显降温，感冒机率较低。
     * lifeindex_ct_id : 124
     * lifeindex_ct_typeno : ct
     * lifeindex_ct_typenm : 穿衣指数
     * lifeindex_ct_attr : 冷
     * lifeindex_ct_dese : 建议着棉衣加羊毛衫等冬季服装。
     * lifeindex_xc_id : 112
     * lifeindex_xc_typeno : xc
     * lifeindex_xc_typenm : 洗车指数
     * lifeindex_xc_attr : 较适宜
     * lifeindex_xc_dese : 无雨且风力较小，易保持清洁度。
     * lifeindex_kq_id : 106
     * lifeindex_kq_typeno : kq
     * lifeindex_kq_typenm : 空气污染扩散指数
     * lifeindex_kq_attr : 中
     * lifeindex_kq_dese : 易感人群应适当减少室外活动。
     */
//    private String success;
    @Id(autoincrement = true)
    private Long id;
    private String freshtime;
    private String weaid;
    private String days;
    private String week_1;
    private String simcode;
    private String citynm;
    private String cityid;

    private String lifeindex_uv_id;
    private String lifeindex_uv_typeno;
    private String lifeindex_uv_typenm;
    private String lifeindex_uv_attr;
    private String lifeindex_uv_dese;

    private String lifeindex_gm_id;
    private String lifeindex_gm_typeno;
    private String lifeindex_gm_typenm;
    private String lifeindex_gm_attr;
    private String lifeindex_gm_dese;

    private String lifeindex_ct_id;
    private String lifeindex_ct_typeno;
    private String lifeindex_ct_typenm;
    private String lifeindex_ct_attr;
    private String lifeindex_ct_dese;

    private String lifeindex_xc_id;
    private String lifeindex_xc_typeno;
    private String lifeindex_xc_typenm;
    private String lifeindex_xc_attr;
    private String lifeindex_xc_dese;

    private String lifeindex_kq_id;
    private String lifeindex_kq_typeno;
    private String lifeindex_kq_typenm;
    private String lifeindex_kq_attr;
    private String lifeindex_kq_dese;
    @Generated(hash = 1853210315)
    public LifeIndexInfo(Long id, String freshtime, String weaid, String days,
            String week_1, String simcode, String citynm, String cityid,
            String lifeindex_uv_id, String lifeindex_uv_typeno,
            String lifeindex_uv_typenm, String lifeindex_uv_attr,
            String lifeindex_uv_dese, String lifeindex_gm_id,
            String lifeindex_gm_typeno, String lifeindex_gm_typenm,
            String lifeindex_gm_attr, String lifeindex_gm_dese,
            String lifeindex_ct_id, String lifeindex_ct_typeno,
            String lifeindex_ct_typenm, String lifeindex_ct_attr,
            String lifeindex_ct_dese, String lifeindex_xc_id,
            String lifeindex_xc_typeno, String lifeindex_xc_typenm,
            String lifeindex_xc_attr, String lifeindex_xc_dese,
            String lifeindex_kq_id, String lifeindex_kq_typeno,
            String lifeindex_kq_typenm, String lifeindex_kq_attr,
            String lifeindex_kq_dese) {
        this.id = id;
        this.freshtime = freshtime;
        this.weaid = weaid;
        this.days = days;
        this.week_1 = week_1;
        this.simcode = simcode;
        this.citynm = citynm;
        this.cityid = cityid;
        this.lifeindex_uv_id = lifeindex_uv_id;
        this.lifeindex_uv_typeno = lifeindex_uv_typeno;
        this.lifeindex_uv_typenm = lifeindex_uv_typenm;
        this.lifeindex_uv_attr = lifeindex_uv_attr;
        this.lifeindex_uv_dese = lifeindex_uv_dese;
        this.lifeindex_gm_id = lifeindex_gm_id;
        this.lifeindex_gm_typeno = lifeindex_gm_typeno;
        this.lifeindex_gm_typenm = lifeindex_gm_typenm;
        this.lifeindex_gm_attr = lifeindex_gm_attr;
        this.lifeindex_gm_dese = lifeindex_gm_dese;
        this.lifeindex_ct_id = lifeindex_ct_id;
        this.lifeindex_ct_typeno = lifeindex_ct_typeno;
        this.lifeindex_ct_typenm = lifeindex_ct_typenm;
        this.lifeindex_ct_attr = lifeindex_ct_attr;
        this.lifeindex_ct_dese = lifeindex_ct_dese;
        this.lifeindex_xc_id = lifeindex_xc_id;
        this.lifeindex_xc_typeno = lifeindex_xc_typeno;
        this.lifeindex_xc_typenm = lifeindex_xc_typenm;
        this.lifeindex_xc_attr = lifeindex_xc_attr;
        this.lifeindex_xc_dese = lifeindex_xc_dese;
        this.lifeindex_kq_id = lifeindex_kq_id;
        this.lifeindex_kq_typeno = lifeindex_kq_typeno;
        this.lifeindex_kq_typenm = lifeindex_kq_typenm;
        this.lifeindex_kq_attr = lifeindex_kq_attr;
        this.lifeindex_kq_dese = lifeindex_kq_dese;
    }
    @Generated(hash = 1828058830)
    public LifeIndexInfo() {
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
    public String getDays() {
        return this.days;
    }
    public void setDays(String days) {
        this.days = days;
    }
    public String getWeek_1() {
        return this.week_1;
    }
    public void setWeek_1(String week_1) {
        this.week_1 = week_1;
    }
    public String getSimcode() {
        return this.simcode;
    }
    public void setSimcode(String simcode) {
        this.simcode = simcode;
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
    public String getLifeindex_uv_id() {
        return this.lifeindex_uv_id;
    }
    public void setLifeindex_uv_id(String lifeindex_uv_id) {
        this.lifeindex_uv_id = lifeindex_uv_id;
    }
    public String getLifeindex_uv_typeno() {
        return this.lifeindex_uv_typeno;
    }
    public void setLifeindex_uv_typeno(String lifeindex_uv_typeno) {
        this.lifeindex_uv_typeno = lifeindex_uv_typeno;
    }
    public String getLifeindex_uv_typenm() {
        return this.lifeindex_uv_typenm;
    }
    public void setLifeindex_uv_typenm(String lifeindex_uv_typenm) {
        this.lifeindex_uv_typenm = lifeindex_uv_typenm;
    }
    public String getLifeindex_uv_attr() {
        return this.lifeindex_uv_attr;
    }
    public void setLifeindex_uv_attr(String lifeindex_uv_attr) {
        this.lifeindex_uv_attr = lifeindex_uv_attr;
    }
    public String getLifeindex_uv_dese() {
        return this.lifeindex_uv_dese;
    }
    public void setLifeindex_uv_dese(String lifeindex_uv_dese) {
        this.lifeindex_uv_dese = lifeindex_uv_dese;
    }
    public String getLifeindex_gm_id() {
        return this.lifeindex_gm_id;
    }
    public void setLifeindex_gm_id(String lifeindex_gm_id) {
        this.lifeindex_gm_id = lifeindex_gm_id;
    }
    public String getLifeindex_gm_typeno() {
        return this.lifeindex_gm_typeno;
    }
    public void setLifeindex_gm_typeno(String lifeindex_gm_typeno) {
        this.lifeindex_gm_typeno = lifeindex_gm_typeno;
    }
    public String getLifeindex_gm_typenm() {
        return this.lifeindex_gm_typenm;
    }
    public void setLifeindex_gm_typenm(String lifeindex_gm_typenm) {
        this.lifeindex_gm_typenm = lifeindex_gm_typenm;
    }
    public String getLifeindex_gm_attr() {
        return this.lifeindex_gm_attr;
    }
    public void setLifeindex_gm_attr(String lifeindex_gm_attr) {
        this.lifeindex_gm_attr = lifeindex_gm_attr;
    }
    public String getLifeindex_gm_dese() {
        return this.lifeindex_gm_dese;
    }
    public void setLifeindex_gm_dese(String lifeindex_gm_dese) {
        this.lifeindex_gm_dese = lifeindex_gm_dese;
    }
    public String getLifeindex_ct_id() {
        return this.lifeindex_ct_id;
    }
    public void setLifeindex_ct_id(String lifeindex_ct_id) {
        this.lifeindex_ct_id = lifeindex_ct_id;
    }
    public String getLifeindex_ct_typeno() {
        return this.lifeindex_ct_typeno;
    }
    public void setLifeindex_ct_typeno(String lifeindex_ct_typeno) {
        this.lifeindex_ct_typeno = lifeindex_ct_typeno;
    }
    public String getLifeindex_ct_typenm() {
        return this.lifeindex_ct_typenm;
    }
    public void setLifeindex_ct_typenm(String lifeindex_ct_typenm) {
        this.lifeindex_ct_typenm = lifeindex_ct_typenm;
    }
    public String getLifeindex_ct_attr() {
        return this.lifeindex_ct_attr;
    }
    public void setLifeindex_ct_attr(String lifeindex_ct_attr) {
        this.lifeindex_ct_attr = lifeindex_ct_attr;
    }
    public String getLifeindex_ct_dese() {
        return this.lifeindex_ct_dese;
    }
    public void setLifeindex_ct_dese(String lifeindex_ct_dese) {
        this.lifeindex_ct_dese = lifeindex_ct_dese;
    }
    public String getLifeindex_xc_id() {
        return this.lifeindex_xc_id;
    }
    public void setLifeindex_xc_id(String lifeindex_xc_id) {
        this.lifeindex_xc_id = lifeindex_xc_id;
    }
    public String getLifeindex_xc_typeno() {
        return this.lifeindex_xc_typeno;
    }
    public void setLifeindex_xc_typeno(String lifeindex_xc_typeno) {
        this.lifeindex_xc_typeno = lifeindex_xc_typeno;
    }
    public String getLifeindex_xc_typenm() {
        return this.lifeindex_xc_typenm;
    }
    public void setLifeindex_xc_typenm(String lifeindex_xc_typenm) {
        this.lifeindex_xc_typenm = lifeindex_xc_typenm;
    }
    public String getLifeindex_xc_attr() {
        return this.lifeindex_xc_attr;
    }
    public void setLifeindex_xc_attr(String lifeindex_xc_attr) {
        this.lifeindex_xc_attr = lifeindex_xc_attr;
    }
    public String getLifeindex_xc_dese() {
        return this.lifeindex_xc_dese;
    }
    public void setLifeindex_xc_dese(String lifeindex_xc_dese) {
        this.lifeindex_xc_dese = lifeindex_xc_dese;
    }
    public String getLifeindex_kq_id() {
        return this.lifeindex_kq_id;
    }
    public void setLifeindex_kq_id(String lifeindex_kq_id) {
        this.lifeindex_kq_id = lifeindex_kq_id;
    }
    public String getLifeindex_kq_typeno() {
        return this.lifeindex_kq_typeno;
    }
    public void setLifeindex_kq_typeno(String lifeindex_kq_typeno) {
        this.lifeindex_kq_typeno = lifeindex_kq_typeno;
    }
    public String getLifeindex_kq_typenm() {
        return this.lifeindex_kq_typenm;
    }
    public void setLifeindex_kq_typenm(String lifeindex_kq_typenm) {
        this.lifeindex_kq_typenm = lifeindex_kq_typenm;
    }
    public String getLifeindex_kq_attr() {
        return this.lifeindex_kq_attr;
    }
    public void setLifeindex_kq_attr(String lifeindex_kq_attr) {
        this.lifeindex_kq_attr = lifeindex_kq_attr;
    }
    public String getLifeindex_kq_dese() {
        return this.lifeindex_kq_dese;
    }
    public void setLifeindex_kq_dese(String lifeindex_kq_dese) {
        this.lifeindex_kq_dese = lifeindex_kq_dese;
    }

}
