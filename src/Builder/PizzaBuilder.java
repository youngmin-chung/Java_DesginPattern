package Builder;

// Builder: specifies an abstract interface for creating parts of Product object
public interface PizzaBuilder {
    PizzaBuilder withCrust(Crust crust);
    PizzaBuilder withSauce(Sauce sauce);
    PizzaBuilder ofSize(Size size);
    Pizza build();
}