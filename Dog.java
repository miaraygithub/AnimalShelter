abstract class Dog implements AdoptableAnimal { //abstract Dog uses AdoptableAnimale 'template'
    String name; //can't be private (references in subclass)
    String description; //can't be private (references in subclass)
    double price; //can't be private (references in subclass)
    public Dog(String name, String description, double price) { //Generic dog cosntructor (to be called later)
        this.name = name;
        this.description = description;
        this.price = price;
    }

    abstract String getBreed(); //abstract funciton for the breed subclasses to define
}

class BigDog extends Dog { //BigDog subclass of Dog
    public BigDog(String name, String description, double price) { //BigDog constructor
        super(name, description, price); //calling back to Dog constructor
    }

    public String getBreed() { //implements abstract breed getter, returns all you need to know about dog breeds
        return "a Big Dog";
    }

    @Override //overridden description getter
    public String getDescription() {
        return this.description;
    }

    @Override //overridden name getter
    public String getName() {
        return this.name;
    }

    @Override //overridden price getter
    public double getPrice() {
        return this.price;
    }
}

//THIS SUBCLASS IS A COPY AND PASTE FROM ABOVE WITH A DIFFERENT NAME (i really don't want to have to comment the same things again)
class SmallDog extends Dog {
    public SmallDog(String name, String description, double price) {
        super(name, description, price);
    }

    public String getBreed() {
        return "a Small Dog"; //this one says small dog when you ask what kind of dog it is. oooooo how unique
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}