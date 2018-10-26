package com.cupster.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cupster.database.model.WeekInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WEEK_INFO".
*/
public class WeekInfoDao extends AbstractDao<WeekInfo, Long> {

    public static final String TABLENAME = "WEEK_INFO";

    /**
     * Properties of entity WeekInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Freshtime = new Property(1, String.class, "freshtime", false, "FRESHTIME");
        public final static Property Weaid = new Property(2, String.class, "weaid", false, "WEAID");
        public final static Property Days = new Property(3, String.class, "days", false, "DAYS");
        public final static Property Week = new Property(4, String.class, "week", false, "WEEK");
        public final static Property Cityno = new Property(5, String.class, "cityno", false, "CITYNO");
        public final static Property Citynm = new Property(6, String.class, "citynm", false, "CITYNM");
        public final static Property Cityid = new Property(7, String.class, "cityid", false, "CITYID");
        public final static Property Temperature = new Property(8, String.class, "temperature", false, "TEMPERATURE");
        public final static Property Humidity = new Property(9, String.class, "humidity", false, "HUMIDITY");
        public final static Property Weather = new Property(10, String.class, "weather", false, "WEATHER");
        public final static Property Weather_icon = new Property(11, String.class, "weather_icon", false, "WEATHER_ICON");
        public final static Property Weather_icon1 = new Property(12, String.class, "weather_icon1", false, "WEATHER_ICON1");
        public final static Property Wind = new Property(13, String.class, "wind", false, "WIND");
        public final static Property Winp = new Property(14, String.class, "winp", false, "WINP");
        public final static Property Temp_high = new Property(15, String.class, "temp_high", false, "TEMP_HIGH");
        public final static Property Temp_low = new Property(16, String.class, "temp_low", false, "TEMP_LOW");
        public final static Property Humi_high = new Property(17, String.class, "humi_high", false, "HUMI_HIGH");
        public final static Property Humi_low = new Property(18, String.class, "humi_low", false, "HUMI_LOW");
        public final static Property Weatid = new Property(19, String.class, "weatid", false, "WEATID");
        public final static Property Weatid1 = new Property(20, String.class, "weatid1", false, "WEATID1");
        public final static Property Windid = new Property(21, String.class, "windid", false, "WINDID");
        public final static Property Winpid = new Property(22, String.class, "winpid", false, "WINPID");
    }


    public WeekInfoDao(DaoConfig config) {
        super(config);
    }
    
    public WeekInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WEEK_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"FRESHTIME\" TEXT," + // 1: freshtime
                "\"WEAID\" TEXT," + // 2: weaid
                "\"DAYS\" TEXT," + // 3: days
                "\"WEEK\" TEXT," + // 4: week
                "\"CITYNO\" TEXT," + // 5: cityno
                "\"CITYNM\" TEXT," + // 6: citynm
                "\"CITYID\" TEXT," + // 7: cityid
                "\"TEMPERATURE\" TEXT," + // 8: temperature
                "\"HUMIDITY\" TEXT," + // 9: humidity
                "\"WEATHER\" TEXT," + // 10: weather
                "\"WEATHER_ICON\" TEXT," + // 11: weather_icon
                "\"WEATHER_ICON1\" TEXT," + // 12: weather_icon1
                "\"WIND\" TEXT," + // 13: wind
                "\"WINP\" TEXT," + // 14: winp
                "\"TEMP_HIGH\" TEXT," + // 15: temp_high
                "\"TEMP_LOW\" TEXT," + // 16: temp_low
                "\"HUMI_HIGH\" TEXT," + // 17: humi_high
                "\"HUMI_LOW\" TEXT," + // 18: humi_low
                "\"WEATID\" TEXT," + // 19: weatid
                "\"WEATID1\" TEXT," + // 20: weatid1
                "\"WINDID\" TEXT," + // 21: windid
                "\"WINPID\" TEXT);"); // 22: winpid
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WEEK_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WeekInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String freshtime = entity.getFreshtime();
        if (freshtime != null) {
            stmt.bindString(2, freshtime);
        }
 
        String weaid = entity.getWeaid();
        if (weaid != null) {
            stmt.bindString(3, weaid);
        }
 
        String days = entity.getDays();
        if (days != null) {
            stmt.bindString(4, days);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(5, week);
        }
 
        String cityno = entity.getCityno();
        if (cityno != null) {
            stmt.bindString(6, cityno);
        }
 
        String citynm = entity.getCitynm();
        if (citynm != null) {
            stmt.bindString(7, citynm);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(8, cityid);
        }
 
        String temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindString(9, temperature);
        }
 
        String humidity = entity.getHumidity();
        if (humidity != null) {
            stmt.bindString(10, humidity);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(11, weather);
        }
 
        String weather_icon = entity.getWeather_icon();
        if (weather_icon != null) {
            stmt.bindString(12, weather_icon);
        }
 
        String weather_icon1 = entity.getWeather_icon1();
        if (weather_icon1 != null) {
            stmt.bindString(13, weather_icon1);
        }
 
        String wind = entity.getWind();
        if (wind != null) {
            stmt.bindString(14, wind);
        }
 
        String winp = entity.getWinp();
        if (winp != null) {
            stmt.bindString(15, winp);
        }
 
        String temp_high = entity.getTemp_high();
        if (temp_high != null) {
            stmt.bindString(16, temp_high);
        }
 
        String temp_low = entity.getTemp_low();
        if (temp_low != null) {
            stmt.bindString(17, temp_low);
        }
 
        String humi_high = entity.getHumi_high();
        if (humi_high != null) {
            stmt.bindString(18, humi_high);
        }
 
        String humi_low = entity.getHumi_low();
        if (humi_low != null) {
            stmt.bindString(19, humi_low);
        }
 
        String weatid = entity.getWeatid();
        if (weatid != null) {
            stmt.bindString(20, weatid);
        }
 
        String weatid1 = entity.getWeatid1();
        if (weatid1 != null) {
            stmt.bindString(21, weatid1);
        }
 
        String windid = entity.getWindid();
        if (windid != null) {
            stmt.bindString(22, windid);
        }
 
        String winpid = entity.getWinpid();
        if (winpid != null) {
            stmt.bindString(23, winpid);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WeekInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String freshtime = entity.getFreshtime();
        if (freshtime != null) {
            stmt.bindString(2, freshtime);
        }
 
        String weaid = entity.getWeaid();
        if (weaid != null) {
            stmt.bindString(3, weaid);
        }
 
        String days = entity.getDays();
        if (days != null) {
            stmt.bindString(4, days);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(5, week);
        }
 
        String cityno = entity.getCityno();
        if (cityno != null) {
            stmt.bindString(6, cityno);
        }
 
        String citynm = entity.getCitynm();
        if (citynm != null) {
            stmt.bindString(7, citynm);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(8, cityid);
        }
 
        String temperature = entity.getTemperature();
        if (temperature != null) {
            stmt.bindString(9, temperature);
        }
 
        String humidity = entity.getHumidity();
        if (humidity != null) {
            stmt.bindString(10, humidity);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(11, weather);
        }
 
        String weather_icon = entity.getWeather_icon();
        if (weather_icon != null) {
            stmt.bindString(12, weather_icon);
        }
 
        String weather_icon1 = entity.getWeather_icon1();
        if (weather_icon1 != null) {
            stmt.bindString(13, weather_icon1);
        }
 
        String wind = entity.getWind();
        if (wind != null) {
            stmt.bindString(14, wind);
        }
 
        String winp = entity.getWinp();
        if (winp != null) {
            stmt.bindString(15, winp);
        }
 
        String temp_high = entity.getTemp_high();
        if (temp_high != null) {
            stmt.bindString(16, temp_high);
        }
 
        String temp_low = entity.getTemp_low();
        if (temp_low != null) {
            stmt.bindString(17, temp_low);
        }
 
        String humi_high = entity.getHumi_high();
        if (humi_high != null) {
            stmt.bindString(18, humi_high);
        }
 
        String humi_low = entity.getHumi_low();
        if (humi_low != null) {
            stmt.bindString(19, humi_low);
        }
 
        String weatid = entity.getWeatid();
        if (weatid != null) {
            stmt.bindString(20, weatid);
        }
 
        String weatid1 = entity.getWeatid1();
        if (weatid1 != null) {
            stmt.bindString(21, weatid1);
        }
 
        String windid = entity.getWindid();
        if (windid != null) {
            stmt.bindString(22, windid);
        }
 
        String winpid = entity.getWinpid();
        if (winpid != null) {
            stmt.bindString(23, winpid);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public WeekInfo readEntity(Cursor cursor, int offset) {
        WeekInfo entity = new WeekInfo( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // freshtime
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // weaid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // days
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // week
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cityno
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // citynm
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // cityid
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // temperature
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // humidity
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // weather
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // weather_icon
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // weather_icon1
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // wind
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // winp
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // temp_high
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // temp_low
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // humi_high
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // humi_low
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // weatid
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // weatid1
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // windid
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22) // winpid
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WeekInfo entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setFreshtime(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWeaid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDays(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWeek(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCityno(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCitynm(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCityid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTemperature(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setHumidity(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setWeather(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setWeather_icon(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setWeather_icon1(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setWind(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setWinp(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setTemp_high(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setTemp_low(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setHumi_high(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setHumi_low(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setWeatid(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setWeatid1(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setWindid(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setWinpid(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WeekInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WeekInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WeekInfo entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}