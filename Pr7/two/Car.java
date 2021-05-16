package Pr7.two;

public class Car implements Printable{
    String brand;
    String model;
    String config;
    int price, year;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getConfig() {
        return config;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    //сеттер.
    Car (String brand, String model, String config, int price, int year){
        this.brand = brand;
        this.model = model;
        this.config = config;
        this.price = price;
        this.year = year;
    }

    @Override
    public void println() {
        System.out.println("Марка: " + brand + " Модель: " + model + " Конфигурация: " + config + " Цена: " + price + " Год выпуска: " + year);
    }
}
