package com.company.service.result;

/**
 * Created by Administrator on 2017/11/21.
 */
public class Report {
    private String sname;
    private int scount;

    public Report() {
    }

    public Report(String sname, int scount) {
        this.sname = sname;
        this.scount = scount;
    }

    public int getScount() {
        return scount;
    }

    public void setScount(int scount) {
        this.scount = scount;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Report{" +
                "scount=" + scount +
                ", sname='" + sname + '\'' +
                '}';
    }
}
