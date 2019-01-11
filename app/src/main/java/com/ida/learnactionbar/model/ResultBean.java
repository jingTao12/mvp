package com.ida.learnactionbar.model;

import java.util.ArrayList;

public class ResultBean {

    private String reason;
    private int error_code;
    private DataBean result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public DataBean getResult() {
        return result;
    }

    public void setResult(DataBean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "reason='" + reason + '\'' +
                ", error_code=" + error_code +
                ", result=" + result +
                '}';
    }


    class DataBean {
        private String stat;
        private ArrayList<NewsDataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public ArrayList<NewsDataBean> getData() {
            return data;
        }

        public void setData(ArrayList<NewsDataBean> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }
    }
}
