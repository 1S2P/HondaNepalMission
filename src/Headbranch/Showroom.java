package Headbranch;

public class Showroom {
    String car_model;
    String car_color;
    int car_price;
    Boolean Electric_Automatic;
    Boolean Manual_Diesel;

    public Showroom(String car_model, String car_color, int car_price, Boolean electric_Automatic, Boolean manual_Diesel) {
        this.car_model = car_model;
        this.car_color = car_color;
        this.car_price = car_price;
        Electric_Automatic = electric_Automatic;
        Manual_Diesel = manual_Diesel;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public int getCar_price() {
        return car_price;
    }

    public void setCar_price(int car_price) {
        this.car_price = car_price;
    }

    public Boolean getElectric_Automatic() {
        return Electric_Automatic;
    }

    public void setElectric_Automatic(Boolean electric_Automatic) {
        Electric_Automatic = electric_Automatic;
    }

    public Boolean getManual_Diesel() {
        return Manual_Diesel;
    }

    public void setManual_Diesel(Boolean manual_Diesel) {
        Manual_Diesel = manual_Diesel;
    }
}