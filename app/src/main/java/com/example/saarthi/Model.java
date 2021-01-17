package com.example.saarthi;

public class Model {

    private String day_time,carNumber,drivers_name,phone_no,cost,location;
    private int img;

    public String getDay_time() {
        return day_time;
    }

    public void setDay_time(String day_time) {

        this.day_time = day_time;
    }

    public String getCarNumber() {

        return carNumber;
    }

    public void setCarNumber(String carNumber) {

        this.carNumber = carNumber;
    }
    public String getDrivers_name() {

        return drivers_name;
    }

    public void setDrivers_name(String drivers_name) {

        this.drivers_name = drivers_name;
    }
    public String getPhone_no() {

        return phone_no;
    }

    public void setPhone_no(String phone_no) {

        this.phone_no = phone_no;
    }

    public String getCost()
    {
        return cost;
    }

    public void setCost(String cost) {

        this.cost = cost;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public int getImg()
    {
        return img;
    }

    public void setImg(int img) {

        this.img = img;
    }
}
