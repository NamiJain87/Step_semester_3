package main.java.oop.Assignment;

public class TrafficLight {

    private String color;
    private final int id;

    public TrafficLight(int id) {
        this.id = id;
        color = "RED";
    }

    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(101);

        System.out.println("ID: " + light.getId());
        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());
    }
}