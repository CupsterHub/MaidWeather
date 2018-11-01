package com.cupster.database.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.cupster.database.model.HistoryInfo;
import com.cupster.database.model.LifeIndexInfo;
import com.cupster.database.model.Pm25Info;
import com.cupster.database.model.TodayInfo;
import com.cupster.database.model.WeekInfo;

import com.cupster.database.dao.HistoryInfoDao;
import com.cupster.database.dao.LifeIndexInfoDao;
import com.cupster.database.dao.Pm25InfoDao;
import com.cupster.database.dao.TodayInfoDao;
import com.cupster.database.dao.WeekInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig historyInfoDaoConfig;
    private final DaoConfig lifeIndexInfoDaoConfig;
    private final DaoConfig pm25InfoDaoConfig;
    private final DaoConfig todayInfoDaoConfig;
    private final DaoConfig weekInfoDaoConfig;

    private final HistoryInfoDao historyInfoDao;
    private final LifeIndexInfoDao lifeIndexInfoDao;
    private final Pm25InfoDao pm25InfoDao;
    private final TodayInfoDao todayInfoDao;
    private final WeekInfoDao weekInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        historyInfoDaoConfig = daoConfigMap.get(HistoryInfoDao.class).clone();
        historyInfoDaoConfig.initIdentityScope(type);

        lifeIndexInfoDaoConfig = daoConfigMap.get(LifeIndexInfoDao.class).clone();
        lifeIndexInfoDaoConfig.initIdentityScope(type);

        pm25InfoDaoConfig = daoConfigMap.get(Pm25InfoDao.class).clone();
        pm25InfoDaoConfig.initIdentityScope(type);

        todayInfoDaoConfig = daoConfigMap.get(TodayInfoDao.class).clone();
        todayInfoDaoConfig.initIdentityScope(type);

        weekInfoDaoConfig = daoConfigMap.get(WeekInfoDao.class).clone();
        weekInfoDaoConfig.initIdentityScope(type);

        historyInfoDao = new HistoryInfoDao(historyInfoDaoConfig, this);
        lifeIndexInfoDao = new LifeIndexInfoDao(lifeIndexInfoDaoConfig, this);
        pm25InfoDao = new Pm25InfoDao(pm25InfoDaoConfig, this);
        todayInfoDao = new TodayInfoDao(todayInfoDaoConfig, this);
        weekInfoDao = new WeekInfoDao(weekInfoDaoConfig, this);

        registerDao(HistoryInfo.class, historyInfoDao);
        registerDao(LifeIndexInfo.class, lifeIndexInfoDao);
        registerDao(Pm25Info.class, pm25InfoDao);
        registerDao(TodayInfo.class, todayInfoDao);
        registerDao(WeekInfo.class, weekInfoDao);
    }
    
    public void clear() {
        historyInfoDaoConfig.clearIdentityScope();
        lifeIndexInfoDaoConfig.clearIdentityScope();
        pm25InfoDaoConfig.clearIdentityScope();
        todayInfoDaoConfig.clearIdentityScope();
        weekInfoDaoConfig.clearIdentityScope();
    }

    public HistoryInfoDao getHistoryInfoDao() {
        return historyInfoDao;
    }

    public LifeIndexInfoDao getLifeIndexInfoDao() {
        return lifeIndexInfoDao;
    }

    public Pm25InfoDao getPm25InfoDao() {
        return pm25InfoDao;
    }

    public TodayInfoDao getTodayInfoDao() {
        return todayInfoDao;
    }

    public WeekInfoDao getWeekInfoDao() {
        return weekInfoDao;
    }

}
