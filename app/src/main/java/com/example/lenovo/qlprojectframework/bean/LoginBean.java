package com.example.lenovo.qlprojectframework.bean;

/**
 * @author LMK
 * @create 2018/11/13
 * @Describe
 */
public class LoginBean {

    /**
     * msg : 登录成功！
     * code : 0
     * data : {"Phone":"1","Tel":"1","id":"7639f5b7-227d-4af2-954d-17a1ea12e5a7","userName":"廖日红"}
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
         * Phone : 1
         * Tel : 1
         * id : 7639f5b7-227d-4af2-954d-17a1ea12e5a7
         * userName : 廖日红
         */

        private String Phone;
        private String Tel;
        private String id;
        private String userName;

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String Phone) {
            this.Phone = Phone;
        }

        public String getTel() {
            return Tel;
        }

        public void setTel(String Tel) {
            this.Tel = Tel;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
