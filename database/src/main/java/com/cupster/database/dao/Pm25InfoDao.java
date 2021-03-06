package com.cupster.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cupster.database.model.Pm25Info;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PM25_INFO".
*/
public class Pm25InfoDao extends AbstractDao<Pm25Info, Long> {

    public static final String TABLENAME = "PM25_INFO";

    /**
     * Properties of entity Pm25Info.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Freshtime = new Property(1, String.class, "freshtime", false, "FRESHTIME");
        public final static Property Weaid = new Property(2, String.class, "weaid", false, "WEAID");
        public final static Property Cityno = new Property(3, String.class, "cityno", false, "CITYNO");
        public final static Property Citynm = new Property(4, String.class, "citynm", false, "CITYNM");
        public final static Property Cityid = new Property(5, String.class, "cityid", false, "CITYID");
        public final static Property Aqi = new Property(6, String.class, "aqi", false, "AQI");
        public final static Property Aqi_scope = new Property(7, String.class, "aqi_scope", false, "AQI_SCOPE");
        public final static Property Aqi_levid = new Property(8, String.class, "aqi_levid", false, "AQI_LEVID");
        public final static Property Aqi_levnm = new Property(9, String.class, "aqi_levnm", false, "AQI_LEVNM");
        public final static Property Aqi_remark = new Property(10, String.class, "aqi_remark", false, "AQI_REMARK");
    }


    public Pm25InfoDao(DaoConfig config) {
        super(config);
    }
    
    public Pm25InfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PM25_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"FRESHTIME\" TEXT," + // 1: freshtime
                "\"WEAID\" TEXT," + // 2: weaid
                "\"CITYNO\" TEXT," + // 3: cityno
                "\"CITYNM\" TEXT," + // 4: citynm
                "\"CITYID\" TEXT," + // 5: cityid
                "\"AQI\" TEXT," + // 6: aqi
                "\"AQI_SCOPE\" TEXT," + // 7: aqi_scope
                "\"AQI_LEVID\" TEXT," + // 8: aqi_levid
                "\"AQI_LEVNM\" TEXT," + // 9: aqi_levnm
                "\"AQI_REMARK\" TEXT);"); // 10: aqi_remark
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PM25_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Pm25Info entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String freshtime = entity.getFreshtime();
        if (freshtime != null) {
            stmt.bindString(2, freshtime);
        }
 
        String weaid = entity.getWeaid();
        if (weaid != null) {
            stmt.bindString(3, weaid);
        }
 
        String cityno = entity.getCityno();
        if (cityno != null) {
            stmt.bindString(4, cityno);
        }
 
        String citynm = entity.getCitynm();
        if (citynm != null) {
            stmt.bindString(5, citynm);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(6, cityid);
        }
 
        String aqi = entity.getAqi();
        if (aqi != null) {
            stmt.bindString(7, aqi);
        }
 
        String aqi_scope = entity.getAqi_scope();
        if (aqi_scope != null) {
            stmt.bindString(8, aqi_scope);
        }
 
        String aqi_levid = entity.getAqi_levid();
        if (aqi_levid != null) {
            stmt.bindString(9, aqi_levid);
        }
 
        String aqi_levnm = entity.getAqi_levnm();
        if (aqi_levnm != null) {
            stmt.bindString(10, aqi_levnm);
        }
 
        String aqi_remark = entity.getAqi_remark();
        if (aqi_remark != null) {
            stmt.bindString(11, aqi_remark);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Pm25Info entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String freshtime = entity.getFreshtime();
        if (freshtime != null) {
            stmt.bindString(2, freshtime);
        }
 
        String weaid = entity.getWeaid();
        if (weaid != null) {
            stmt.bindString(3, weaid);
        }
 
        String cityno = entity.getCityno();
        if (cityno != null) {
            stmt.bindString(4, cityno);
        }
 
        String citynm = entity.getCitynm();
        if (citynm != null) {
            stmt.bindString(5, citynm);
        }
 
        String cityid = entity.getCityid();
        if (cityid != null) {
            stmt.bindString(6, cityid);
        }
 
        String aqi = entity.getAqi();
        if (aqi != null) {
            stmt.bindString(7, aqi);
        }
 
        String aqi_scope = entity.getAqi_scope();
        if (aqi_scope != null) {
            stmt.bindString(8, aqi_scope);
        }
 
        String aqi_levid = entity.getAqi_levid();
        if (aqi_levid != null) {
            stmt.bindString(9, aqi_levid);
        }
 
        String aqi_levnm = entity.getAqi_levnm();
        if (aqi_levnm != null) {
            stmt.bindString(10, aqi_levnm);
        }
 
        String aqi_remark = entity.getAqi_remark();
        if (aqi_remark != null) {
            stmt.bindString(11, aqi_remark);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Pm25Info readEntity(Cursor cursor, int offset) {
        Pm25Info entity = new Pm25Info( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // freshtime
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // weaid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // cityno
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // citynm
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cityid
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // aqi
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // aqi_scope
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // aqi_levid
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // aqi_levnm
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // aqi_remark
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Pm25Info entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFreshtime(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWeaid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCityno(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCitynm(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCityid(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAqi(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAqi_scope(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAqi_levid(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAqi_levnm(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setAqi_remark(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Pm25Info entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Pm25Info entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Pm25Info entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
