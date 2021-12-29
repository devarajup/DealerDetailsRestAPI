package com.cjss.DealerDetails.model;

import javax.swing.event.CaretEvent;
import javax.swing.event.ListDataEvent;
import java.util.List;

public class Dealer {
    private  Integer id;
    private String name ;
    private String location ;
    private Integer phoneNumber;
    private List<Car> carList;

    public Dealer(Integer id, String name, String location, Integer phoneNumber, List<Car> carList) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.carList = carList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
