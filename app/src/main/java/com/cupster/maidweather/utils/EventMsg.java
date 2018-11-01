package com.cupster.maidweather.utils;

/**
 * EventBus 消息事件类
 *
 * Created by Cupster on 2018/10/29.
 */
public class EventMsg {

    /*
        消息事件代号 定义
     */
    public static final int GET_TODAY_INFO = 1;
    public static final int GET_PM25_INFO = 2;
    public static final int GET_HISTORY_INFO = 3;
    public static final int GET_LIFEINDEX_INFO = 4;
    public static final int GET_WEEK_INFO = 5;

    private int eventCode ;
    public EventMsg (int eventCode){
        this.eventCode = eventCode;
    }
    public int getEventCode(){
        return eventCode;
    }

    public void setEventCode(int eventCode){
        this.eventCode = eventCode;
    }

}
