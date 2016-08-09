package com.longying.myapplication;

/**
 * Created by Administrator on 2016/8/9.
 */
public  class BaseBean {

    /**
     * action : APP_START
     * time : 15012345678
     * param : {"BRAND":"品牌(酷派)","DISPLAY":"硬件版本号(4.4.018.P0.8675_HD)","MANUFACTURER":"硬件制造商(宇龙)","MODEL":"型号(Coolpad 8675-HD)","PRODUCT":"手机制造商(Foxconn)","MAC":"MAC地址(00:11:22:33:AA:BB)","SCREEN_SIZE":"屏幕尺寸(5.0)","RESOLUTION":"分辨率(1280x720)","OS_TYPE":"操作系统类型(iOS/Android)","OS_VERSION":"操作系统版本(4.4.2)"}
     */

    public String action;
    public long time;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
