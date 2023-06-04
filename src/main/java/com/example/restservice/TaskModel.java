package com.example.restservice;

public class TaskModel {

    private String pname;
    private String case1;
    private String case2;
    private String case3;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1;
    }

    public String getCase2() {
        return case2;
    }

    public void setCase2(String case2) {
        this.case2 = case2;
    }

    public String getCase3() {
        return case3;
    }

    public void setCase3(String case3) {
        this.case3 = case3;
    }

    @Override
    public String toString() {
        return "TaskModel{" +
                "pname='" + pname + '\'' +
                ", case1='" + case1 + '\'' +
                ", case2='" + case2 + '\'' +
                ", case3='" + case3 + '\'' +
                '}';
    }
}
