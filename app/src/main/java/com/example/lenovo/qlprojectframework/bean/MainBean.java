package com.example.lenovo.qlprojectframework.bean;

/**
 * @author LMK
 * @create 2018/11/22
 * @Describe
 */
public class MainBean {

    /**
     * msg : 存在数据！
     * code : 0
     * data : {"date":"2018年11月22日","sewageCount":699,"sewageSum":"21975344.10","sewageDesign":"201478.50","sewageActual":"101680.58","onlineCount":558,"yesterdayDayFlow":"84478.97"}
     */

    private String msg;
    private String code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * date : 2018年11月22日
         * sewageCount : 699
         * sewageSum : 21975344.10
         * sewageDesign : 201478.50
         * sewageActual : 101680.58
         * onlineCount : 558
         * yesterdayDayFlow : 84478.97
         */

        private String date;
        private int sewageCount;
        private String sewageSum;
        private String sewageDesign;
        private String sewageActual;
        private int onlineCount;
        private String yesterdayDayFlow;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getSewageCount() {
            return sewageCount;
        }

        public void setSewageCount(int sewageCount) {
            this.sewageCount = sewageCount;
        }

        public String getSewageSum() {
            return sewageSum;
        }

        public void setSewageSum(String sewageSum) {
            this.sewageSum = sewageSum;
        }

        public String getSewageDesign() {
            return sewageDesign;
        }

        public void setSewageDesign(String sewageDesign) {
            this.sewageDesign = sewageDesign;
        }

        public String getSewageActual() {
            return sewageActual;
        }

        public void setSewageActual(String sewageActual) {
            this.sewageActual = sewageActual;
        }

        public int getOnlineCount() {
            return onlineCount;
        }

        public void setOnlineCount(int onlineCount) {
            this.onlineCount = onlineCount;
        }

        public String getYesterdayDayFlow() {
            return yesterdayDayFlow;
        }

        public void setYesterdayDayFlow(String yesterdayDayFlow) {
            this.yesterdayDayFlow = yesterdayDayFlow;
        }
    }
}
