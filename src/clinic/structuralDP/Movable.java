package clinic.structuralDP;

//When an outside component provides captivating functionality that we’d like to reuse,
// but it’s incompatible with our current application.
// A suitable Adapter can be developed to make them compatible with each other
// When our application is not compatible with the interface that our client is expecting
// When we want to reuse legacy code in our application without making any modification in the original code
public interface Movable
{
    // return speed in MPH
    double getSpeed();
}
