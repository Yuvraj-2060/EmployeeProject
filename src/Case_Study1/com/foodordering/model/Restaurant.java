package Case_Study1.com.foodordering.model;

public class Restaurant {
    private String name;
    private String location;
    private String open_Time;
    private String close_Time;
    private String cuisine_Type;
    private boolean status;

    public Restaurant(String name, String location, String open_Time, String close_Time, String cuisine_Type, boolean status) {
        this.name = name;
        this.location = location;
        this.open_Time = open_Time;
        this.close_Time = close_Time;
        this.cuisine_Type=cuisine_Type;
        this.status = status;
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

    public String getOpen_Time() {
        return open_Time;
    }

    public void setOpen_Time(String open_Time) {
        this.open_Time = open_Time;
    }

    public String getClose_Time() {
        return close_Time;
    }

    public void setClose_Time(String close_Time) {
        this.close_Time = close_Time;
    }
    public String getCuisine_Type() {
        return cuisine_Type;
    }

    public void setCuisine_Type(String cuisine_Type) {
        this.close_Time = cuisine_Type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
