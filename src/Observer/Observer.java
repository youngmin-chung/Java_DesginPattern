package Observer;

// The Observers update method is called when the Subject changes
public interface Observer {
    public void update(double ibmPrice, double applPrice, double googPrice);
}
