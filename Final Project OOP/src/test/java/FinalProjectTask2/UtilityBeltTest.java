package FinalProjectTask2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author hasin
 * 
 * Test Class for UtilityBelt
 */
public class UtilityBeltTest {
    
    /**
     * Test the empty UtilityBelt constructor
     */
    @Test
    public void testEmptyGadgetConstructor()
    {   UtilityBelt obj = new UtilityBelt();

        /**
         * Check the current index of array
         */
        Assert.assertEquals("Checking current index of array", 0,obj.getSize());
        
        /**
         * Check existence of creation of empty array
         */
        Gadget[] array=obj.getGadgets();
        Assert.assertEquals("Checking if array exists", null, array[0]);
    }
    
    /**
     * Test the method extendArray
     */
    @Test
    public void testExtendArray(){
        UtilityBelt obj=new UtilityBelt();
        
        /**
         * Checking size of array before extending it
         */
        Gadget[] array=obj.getGadgets();
        Assert.assertEquals("Checking size of array (before extension)",1,array.length);
        
        /**
         * Adding two objects in array of size 1 in order to extend it.
         * (extendArray method has private access)
         */
        Gadget a=new Gadget();
        Gadget b=new Gadget();
        obj.addGadget(a);
        obj.addGadget(b);
        
        /**
         * Checking size of array after extension
         */
        array=obj.getGadgets();
        Assert.assertEquals("Checking size of array (after extension)",11,array.length);
    }
    /**
     * Test of addGadget method, of class UtilityBelt.
     */
    @Test
    public void testAddGadget() {
        UtilityBelt obj=new UtilityBelt();
        
        Gadget a=new Gadget();
        obj.addGadget(a);
        Gadget b=new Gadget("BatGun");
        obj.addGadget(b);
        Gadget c=new Gadget("BatGun",42.4);
        obj.addGadget(c);
        Gadget d=new Gadget("BatGun",42.4,33.5);
        obj.addGadget(d);
        
        Gadget[] array=obj.getGadgets();
        
        /**
         * Comparison of different constructor objects created with objects added to array
         */
        Assert.assertEquals("Comparing first object created with first object added to array", a, array[0]);
        Assert.assertEquals("Comparing second object created with second object added to array", b, array[1]);
        Assert.assertEquals("Comparing third object created with third object added to array", c, array[2]);
        Assert.assertEquals("Comparing fourth object created with fourth object added to array", d, array[3]);
    }

    /**
     * Test of getTotalPrice method, of class UtilityBelt.
     */
    @Test
    public void testGetTotalPrice() {
        UtilityBelt obj=new UtilityBelt();
        
        Gadget a=new Gadget("BatCell",20.08,40.0);
        obj.addGadget(a);
        Gadget b=new Gadget("BatBomb",15.70,25.55);
        obj.addGadget(b);
        Gadget c=new Gadget("BatGun",42.4,33.5);
        obj.addGadget(c);
        
        double sumPrice=40.0 + 25.55 + 33.5;
        /**
         * Testing the total price of objects in array that have been added.
         */
        Assert.assertEquals("Testing total price of objects", sumPrice, obj.getTotalPrice(), 0.0001);
    }

    /**
     * Test of getTotalWeight method, of class UtilityBelt.
     */
    @Test
    public void testGetTotalWeight() {
        UtilityBelt obj=new UtilityBelt();
        
        Gadget a=new Gadget("BatCell",20.08,40.0);
        obj.addGadget(a);
        Gadget b=new Gadget("BatBomb",15.70,25.55);
        obj.addGadget(b);
        Gadget c=new Gadget("BatGun",42.4,33.5);
        obj.addGadget(c);
        
        double sumWeight=20.08 + 15.70 + 42.4;
        /**
         * Testing the total weight of objects in array that have been added.
         */
        Assert.assertEquals("Testing total weight of objects",sumWeight, obj.getTotalWeight(), 0.0001);
    }

    /**
     * Test of getSize method, of class UtilityBelt.
     */
    @Test
    public void testGetSize() {
        UtilityBelt obj=new UtilityBelt();
        
        /**
         * Check the current index of array
         */
        Assert.assertEquals("Testing size of array before adding objects", 0, obj.getSize());
        
        for(int i=0;i<5;i++){
            Gadget a=new Gadget();
            obj.addGadget(a);
        }
        
        int objectsAdded=5;
        /**
         * Checking size of Array after adding 5 objects
         */
        Assert.assertEquals("Testing size of array after adding objects", objectsAdded, obj.getSize());
        
    }

    /**
     * Test of getGadgets method, of class UtilityBelt.
     */
    @Test
    public void testGetGadgets() {
        UtilityBelt obj=new UtilityBelt();
        
        Gadget a=new Gadget("BatCell",20.08);
        obj.addGadget(a);
        
        Gadget b=new Gadget("BatBomb");
        obj.addGadget(b);
        
        Gadget c=new Gadget("BatGun",42.4,33.5);
        obj.addGadget(c);
        
        Gadget[] array=obj.getGadgets();
        
        /**
         * Comparing objects created with their information with contents of array received from UtilityBelt's object.
         */
        Assert.assertEquals("Testing first object created with first object in array", a, array[0]);
        String name=array[1].getName();
        Assert.assertTrue("Comparing name of second object created with name of second object in array", "BatBomb".equals(name));
        Assert.assertEquals("Confirming that there is no 4th object in the array received", null, array[3]);
    }

    /**
     * Test of weighGadgetByName method, of class UtilityBelt.
     */
    @Test
    public void testWeighGadgetByName() {
        UtilityBelt obj=new UtilityBelt();
        
        for(int i=0;i<7;i++){
            Gadget a=new Gadget("BatGun",42.4,33.5);
            obj.addGadget(a);
        }
        
        for(int i=0;i<4;i++){
            Gadget b=new Gadget("BatBomb",15.70,25.55);
            obj.addGadget(b);
        }
        /**
         * Weight for BatGun
         */
        double weightBatGun= 7 * 42.4;
        
        /**
         * Checking Total weight by inputting String "BatGun" in the method
         */
        Assert.assertEquals("Testing total weight for BatGuns", weightBatGun, obj.weighGadgetByName("batgun"), 0.0001);
    }

    /**
     * Test of priceGadgetByName method, of class UtilityBelt.
     */
    @Test
    public void testPriceGadgetByName() {
        UtilityBelt obj=new UtilityBelt();
        
        for(int i=0;i<5;i++){
            Gadget a=new Gadget("BatGun",42.4,33.5);
            obj.addGadget(a);}
        
        Gadget b=new Gadget("BatCell",20.08, 40.0);
        obj.addGadget(b);
        
        Gadget c=new Gadget("BatBomb",15.70,25.55);
        obj.addGadget(c);
        
        Gadget d=new Gadget("BatCell",20.08, 40.0);
        obj.addGadget(d);
        
        Gadget e=new Gadget("BatCell",20.08, 40.0);
        obj.addGadget(e);
        
        /**
         * Price for BatCells
         */
        double priceBatCell= 3 * 40.0;
        
        /**
         * Checking Total price by inputting String "BatCell" in the method
         */
        Assert.assertEquals("Testing total price for BatCells", priceBatCell, obj.priceGadgetByName("BatCell"), 0.0001);
    }

    /**
     * Test of toString method, of class UtilityBelt.
     */
    @Test
    public void testToString() {
        UtilityBelt obj=new UtilityBelt();

        Gadget a=new Gadget();
        obj.addGadget(a);
        Gadget b=new Gadget("BatBomb",15.70);
        obj.addGadget(b);
        Gadget c=new Gadget("BatGun",42.4,33.5);
        obj.addGadget(c);
        
        String expectedToString="Avalaible gadgets:\nnull, 0.00 oz, $0.00\nBatBomb, 15.70 oz, $0.00\nBatGun, 42.40 oz, $33.50\n";
        
        /**
         * Comparing expected toString with output received.
         */
        Assert.assertEquals("Testing toString method", expectedToString, obj.toString());
    }
    
}
