package com.rahul0596.kernel;


public class Department {
    private String depName;
    private int image;
    private String date;

    public Department(String depName, int image, String date)
    {
        this.depName = depName;
        this.image = image;
        this.date = date;
    }

    public String getDepName() {
        return depName;
    }

    public int getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }
}
