package Prototype;

public class Sheep implements Animal{
    public Sheep(){
        System.out.println("Sheep is made...");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made...");
        Sheep sheepObject = null;
        try {
            // calls the Animal super classes clone() then casts the results to Sheep
            sheepObject = (Sheep) super.clone();
        }
        catch (CloneNotSupportedException c){
            // If Animal didn't extend Cloning this error is thrown
            System.out.println("The sheep was turned to mush...");
            c.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){
        return "Dolly is my hero, Baaaa...";
    }

}
