package kr.ac.util;

public class Location {
    private int id;
    private String restaurant;
    private double lat;
    private double lng;
    private String phone;
    private String address;

    public Location() {
    }

    public Location(int id, String restaurant, double lat, double lng, String phone, String address) {
        this.id = id;
        this.restaurant = restaurant;
        this.lat = lat;
        this.lng = lng;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", restaurant='" + restaurant + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
