public class Cat implements AdoptableAnimal { //Cat implements AdoptableAnimal
    private String name; //name attribute
    private String description; //description class attribute
    private double price; //price class attribute
    public Cat(String name, String description, double price) { //Cat constructor, takes in two strings (name, description) and a double (price)
        this.name = name; //assigning name
        this.description = description; //assigning descriptioin
        this.price = price; //assiging price
    }

    @Override //override the interface
    public String getDescription() { //getter for descrption
        return description;
    }
    @Override //override the interface
    public String getName() { //getter for name
        return name;
    }
    @Override //override the interface
    public double getPrice() { //getter for price
        return price;
    }
}
