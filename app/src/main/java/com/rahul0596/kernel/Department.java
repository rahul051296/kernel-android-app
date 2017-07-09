package com.rahul0596.kernel;


public class Department {
    private String depName;
    private int image;

    public Department(String depName, int image)
    {
        this.depName = depName;
        this.image = image;
    }

    public String getDepName() {
        return depName;
    }

    public int getImage() {
        return image;
    }

}
