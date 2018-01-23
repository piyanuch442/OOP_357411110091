package oop_lab7;

public class SuperCar {
    public String getSuperCarInfo() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private String brand;
    private String color;
    private String engine;
    private String maxspeed;
    private String country;

    public SuperCar () {}

    public SuperCar(String b,String c ,String e,String m,String ct){
        this.brand = b;
        this.color = c;
        this.engine = e;
        this.maxspeed = m;
        this.country = ct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}//class
