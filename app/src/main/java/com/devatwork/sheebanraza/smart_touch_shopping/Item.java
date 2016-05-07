package com.devatwork.sheebanraza.smart_touch_shopping;

/**
 * Created by Sheeban Raza on 04-May-16.
 */
public class Item {

        Integer id;
        String name;
        String location;

    public Item(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
