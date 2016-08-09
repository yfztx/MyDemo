package com.longying.myapplication;

/**
 * Created by Administrator on 2016/8/9.
 */
public class UserDataBean extends BaseBean {


    /**
     * BRAND : 品牌(酷派)
     * DISPLAY : 硬件版本号(4.4.018.P0.8675_HD)
     * MANUFACTURER : 硬件制造商(宇龙)
     * MODEL : 型号(Coolpad 8675-HD)
     * PRODUCT : 手机制造商(Foxconn)
     * MAC : MAC地址(00:11:22:33:AA:BB)
     * SCREEN_SIZE : 屏幕尺寸(5.0)
     * RESOLUTION : 分辨率(1280x720)
     * OS_TYPE : 操作系统类型(iOS/Android)
     * OS_VERSION : 操作系统版本(4.4.2)
     */

    public ParamBean param;



    public ParamBean getParam() {
        return param;
    }

    public void setParam(ParamBean param) {
        this.param = param;
    }

    public static class ParamBean {
        public String BRAND;
        public String DISPLAY;
        public String MANUFACTURER;
        public String MODEL;
        public String PRODUCT;
        public String MAC;
        public String SCREEN_SIZE;
        public String RESOLUTION;
        public String OS_TYPE;
        public String OS_VERSION;

        public String getBRAND() {
            return BRAND;
        }

        public void setBRAND(String BRAND) {
            this.BRAND = BRAND;
        }

        public String getDISPLAY() {
            return DISPLAY;
        }

        public void setDISPLAY(String DISPLAY) {
            this.DISPLAY = DISPLAY;
        }

        public String getMANUFACTURER() {
            return MANUFACTURER;
        }

        public void setMANUFACTURER(String MANUFACTURER) {
            this.MANUFACTURER = MANUFACTURER;
        }

        public String getMODEL() {
            return MODEL;
        }

        public void setMODEL(String MODEL) {
            this.MODEL = MODEL;
        }

        public String getPRODUCT() {
            return PRODUCT;
        }

        public void setPRODUCT(String PRODUCT) {
            this.PRODUCT = PRODUCT;
        }

        public String getMAC() {
            return MAC;
        }

        public void setMAC(String MAC) {
            this.MAC = MAC;
        }

        public String getSCREEN_SIZE() {
            return SCREEN_SIZE;
        }

        public void setSCREEN_SIZE(String SCREEN_SIZE) {
            this.SCREEN_SIZE = SCREEN_SIZE;
        }

        public String getRESOLUTION() {
            return RESOLUTION;
        }

        public void setRESOLUTION(String RESOLUTION) {
            this.RESOLUTION = RESOLUTION;
        }

        public String getOS_TYPE() {
            return OS_TYPE;
        }

        public void setOS_TYPE(String OS_TYPE) {
            this.OS_TYPE = OS_TYPE;
        }

        public String getOS_VERSION() {
            return OS_VERSION;
        }

        public void setOS_VERSION(String OS_VERSION) {
            this.OS_VERSION = OS_VERSION;
        }
    }
}
