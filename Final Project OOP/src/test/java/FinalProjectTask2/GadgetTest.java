package FinalProjectTask2;

import org.junit.Test;
import org.junit.Assert;

/**
 * Testing class for Gadget object
 * 
 * @author Samreen
 * @version 04/23/2020
 */
public class GadgetTest 
{
    /**
     * Test the empty Gadget constructor
     */
    @Test
    public void testEmptyGadgetConstructor()
    {
        Gadget gadget = new Gadget();

        // Check that the name is null, and the price and weight are zero
        Assert.assertNull("Empty constructor: NULL name", gadget.getName());
        Assert.assertEquals("Empty constructor: no weight", 0, gadget.getWeight(), 0.00001);
        Assert.assertEquals("Empty constructor: no price", 0, gadget.getPrice(), 0.00001);
    }

    /**
     * Test the Gadget constructor with only a String parameter
     */
    @Test
    public void testStringParameterConstructor()
    {
        String testGadgetName = "Gappling gun";
        Gadget gadget = new Gadget(testGadgetName);

        // Check that the name should match the initial parameter, and the price and weight should be zero
        Assert.assertEquals("String Parameter Constructor: name", testGadgetName, gadget.getName());
        Assert.assertEquals("String Parameter Constructor: no weight", 0, gadget.getWeight(), 0.00001);
        Assert.assertEquals("String Parameter Constructor: no price", 0, gadget.getPrice(), 0.00001);
    }

    /**
     * Test the Gadget constructor using a string parameter and a double parameter
     * for the name and weight, respectively
     */
    @Test
    public void testDoubleParameterConstructor()
    {
        String testGadgetName = "Lock pick";
        double testGadgetWeight = .57;
        Gadget gadget = new Gadget(testGadgetName, testGadgetWeight);

        // Check that the name  and weight should match the  initial parameters and that the price should be zero
        Assert.assertEquals("Double parameter constructor: name", testGadgetName, gadget.getName());
        Assert.assertEquals("Double parameter constructor: weight", testGadgetWeight, gadget.getWeight(), 0.00001);
        Assert.assertEquals("Double parameter constructor: no price", 0, gadget.getPrice(), 0.00001);
    }

    /**
     * Test the complete constructor and the getters
     */
    @Test
    public void testFullConstructor() 
    {
        String testGadgetName = "Gas pellets";
        double testGadgetWeight = 2.05;
        double testGadgetPrice = 12.53;
        Gadget gadget = new Gadget(testGadgetName, testGadgetWeight, testGadgetPrice);

        // Check that the name, weight, and price should match the initial parameters
        Assert.assertEquals("Full constructor: name", testGadgetName, gadget.getName());
        Assert.assertEquals("Full constructor: weight", testGadgetWeight, gadget.getWeight(), 0.00001);
        Assert.assertEquals("Full constructor: price", testGadgetPrice, gadget.getPrice(), 0.00001);
    }

    /**
     * Test mutator methods
     */
    @Test
    public void testAllMutators() 
    {
        Gadget gadget = new Gadget("Kryptonite", 14.62, 212.10);

        // Change the name, price, and weight properties
        String testGadgetName = "Rebreather";
        double testGadgetWeight = 6.39;
        double testGadgetPrice = 50.00;
        gadget.setName(testGadgetName);
        gadget.setWeight(testGadgetWeight);
        gadget.setPrice(testGadgetPrice);

        // Check that the name , weight, and price should match the parameters passed into their 
        //  respective mutator methods.
        Assert.assertEquals("Mutator: name", testGadgetName, gadget.getName());
        Assert.assertEquals("Mutator: weight", testGadgetWeight, gadget.getWeight(), 0.00001);
        Assert.assertEquals("Mutator: price", testGadgetPrice, gadget.getPrice(), 0.00001);
    }

    /**
     * Test the String representation of a Gadget
     */
    @Test
    public void testGadgetToString()
    {
        Gadget gadget = new Gadget("C-4", 27.9, 89.99);
        // Check that the appropriate string is constructed to represent the gadget
        Assert.assertEquals("Gadget toString", "C-4, 27.90 oz, $89.99", gadget.toString());
    }
}

