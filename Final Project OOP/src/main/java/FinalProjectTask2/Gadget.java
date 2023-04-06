package FinalProjectTask2;

/**
 * Gadget class for Batman's utility belt. These are physical things
 * like lock picks, batarangs, grappling hook, etc. 
 * 
 * @author Samreen
 * @version 04/23/2020
 */
public class Gadget
{
    /** The name of the gadget */
    private String name;

    /** The weight of the gadget in fantasy units */
    private double weight;

    /** How much the gadget can be bought or made for in dollars */
    private double price;


    /** Default Constructor - creates empty Gadget object */
    public Gadget()
    {
        // Nothing to initialize
    }

    /**
     * Constructor to create a gadget when provided a name
     * 
     * @param name  The name of the gadget
     */
    public Gadget(String name)
    {
        this.name = name;
    }

    /**
     * Partial Constructor to create a gadget when provided a name and its weight
     * 
     * @param name      String name of the gadget
     * @param weight    double value for the weight in ounces
     */
    public Gadget(String name, double weight) 
    {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Complete Constructor. Set the name, weight and price of the gadget
     * 
     * @param name  String name of the gadget
     * @param weight  double value for the weight in ounces
     * @param price  double value for the price to buy or produce the gadget in dollars
     */
    public Gadget(String name, double weight, double price) 
    {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    /**
     * Return the name of this gadget
     * 
     * @return  String name of this gadget object
     */
    public String getName() 
    {
        return this.name;
    }

    /**
     * Return the weight of this gadget in ounces
     * 
     * @return the weight of gadget
     */
    public double getWeight() 
    {
        return this.weight;
    }

    /**
     * Return the price of the gadget in dollars
     * 
     * @return the price of the gadget
     */
    public double getPrice() 
    {
        return this.price;
    }


    /**
     * Alter the name of this gadget
     * 
     * @param newName the new Name of this gadget 
     */
    public void setName(String newName) 
    {
        this.name = newName;
    }

    /**
     * Alter the weight of this gadget
     * 
     * @param newWeight the new weight of this gadget in ounces
     */
    public void setWeight(double newWeight) 
    {
        this.weight = newWeight;
    }

    /**
     * Alter the price of this gadget
     * 
     * @param newPrice the new purchase or production price of this gadget in dollars
     */
    public void setPrice(double newPrice) 
    {
        this.price = newPrice;
    }


    /**
     * When Batman needs to see info on this gadget in regards to its name, weight, and price
     * 
     * @return  The string representation of this Gadget object
     */
    public String toString()
    {
        return String.format("%s, %.2f oz, $%.2f", this.name, this.weight, this.price);
    }
}
