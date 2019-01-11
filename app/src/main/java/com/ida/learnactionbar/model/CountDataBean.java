package com.ida.learnactionbar.model;

public class CountDataBean {
    //商品的名称
    private String name;
    //距离活动剩余的时间
    private long time;

    public CountDataBean(String name, long time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "CountDataBean{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
