package com.my.web.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
    private String name;
    private String className;
    private String iScore;
    private String RScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getiScore() {
        return iScore;
    }

    public void setiScore(String iScore) {
        this.iScore = iScore;
    }

    public String getRScore() {
        return RScore;
    }

    public void setRScore(String RScore) {
        this.RScore = RScore;
    }
}
