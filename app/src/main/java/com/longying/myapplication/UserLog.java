package com.longying.myapplication;

/**
 * Created by Administrator on 2016/8/9.
 */
public class UserLog extends BaseBean {


    /**
     * adid : xxxx
     * pid : xxxx
     */

    public ParamBean param;

    public ParamBean getParam() {
        return param;
    }

    public void setParam(ParamBean param) {
        this.param = param;
    }

    public static class ParamBean {
        public String adid;
        public String pid;

        public String getAdid() {
            return adid;
        }

        public void setAdid(String adid) {
            this.adid = adid;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }
    }
}
