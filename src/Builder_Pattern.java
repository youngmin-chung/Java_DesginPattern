public class Builder_Pattern {
    /*
     * Definition: The builder design pattern separates the construction
     * of a complex object from its representation. This way, the same
     * construction process can create different representations.

     * With the Builder pattern, every product has its relevant builder.
     * These builders take care of creating the products instead of directly
     * using constructors.

     * In the builder design pattern, we have four major participants.
     * 1. Director - The one who needs the product
     * 2. Builder - An interface that detaches Director from ConcreteBuilder
     * 3. ConcreteBuilder - Has the steps to build
     *    a complex representation of a Product
     * 4. Product - The object that is in need by the Director/Client

     * Why?
     * When we have a large object to create, you would probably use a
     * constructor. But as the object grows, the constructor becomes hard to maintain.
     */
    public static void main(String[] args){
        Pizza regularPanMargarita = new MargaritaPizzaBuilder()
                .withCrust(Crust.PAN)
                .ofSize(Size.REGULAR)
                .withSauce(Sauce.TOMATO)
                .build();

        Pizza pepperoniLarge = new PeperoniPizzaBuilder().build();
        Pizza pineapplePizza = new PineapplePizzaBuilder().withSauce(Sauce.PESTO).build();


        System.out.println(regularPanMargarita);
        System.out.println(pepperoniLarge);
        System.out.println(pineapplePizza);
    }



}
