package com.crossbug.allnetworkpackages2021;

public class packagedetail {

    String title;
    String description;
    String code;

    public packagedetail(String title, String description, String code) {
        this.title = title;
        this.description = description;
        this.code = code;
    }

    public packagedetail() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
