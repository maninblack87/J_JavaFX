package jeon_javafx;

public class Car {
    
    private String brand;
    private int years;
    private String model;
    
    public Car(String brand, int years, String model){
        this.brand = brand;
        this.years = years;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public int getYears(){
        return years;
    }

    public String getModel(){
        return model;
    }

    public void showInfo(){
        System.out.println("-----------------------------");
        System.out.println("브랜드 : " + brand);
        System.out.println("연  식 : " + years);
        System.out.println("모  델 : " + model);
    }
    
}
