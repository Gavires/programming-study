package core;

public class Car
{
    public String number; // создание переменной
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }

    // Setters
    public void setHeight( int height ) {
        this.height = height;
    }

    public void setWeight( double weight ) {
        this.weight = weight;
    }

    public void setVehicle( boolean vehicle ) {
        hasVehicle = vehicle;
    }

    public void setSpecial( boolean special ) {
        isSpecial = special;
    }


    // Getters
    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getVehicle() {
        return hasVehicle;
    }

    public boolean getSpecial() {
        return isSpecial;
    }


}