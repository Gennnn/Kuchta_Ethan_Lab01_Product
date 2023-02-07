package me.ethan.productgenerator;

import java.util.Objects;

public class Product {

    private int ID;
    private String name;
    private String description;
    private double price;

    public Product(int ID, String name, String description, double price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ID == product.ID && Double.compare(product.price, price) == 0 && name.equals(product.name) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, description, price);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return returns the id, name, description, and price as a comma seperated string
     */

    public String toCSVDataRecord() {
        return ID + ", " + name + ", " + description + ", " + price;
    }
}
