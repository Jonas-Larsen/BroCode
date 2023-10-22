package Encapsulation;

public class EncapsulationCarDemo {

    private String make;

    private String model;

    private int year;


    EncapsulationCarDemo(String make, String model, int year){
       // this.make = make;
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }


}
