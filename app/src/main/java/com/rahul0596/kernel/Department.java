package com.rahul0596.kernel;


public class Department {

    private String depName;
    private int image;
    private String depNameShort;

    public Department(String depName, int image, String depNameShort)
    {
        this.depName = depName;
        this.image = image;
        this.depNameShort = depNameShort;
    }

    public String getDepName() {
        return depName;
    }

    public int getImage() {
        return image;
    }

    public String getDepNameShort() {
        return depNameShort;
    }
}
