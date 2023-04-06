package FinalProjectTask2;

/** 
 * An object that holds all of Batman's Gadget objects. These gadgets
 * have a weight and a cost. And this class records the quantity 
 * of each gadgets currently in Batman's possession
 * 
 * @author samreen
 * @version 04/23/2020
 *
 */
public class UtilityBelt
{
    /**
     * Gadget array to hold all of Batman's stuff
     * The gadget array acts as an ArrayList where 
     * it can increase in size as needed
     */
    private Gadget[] gadgets;

    /**
     * The next empty location in the gadgets array
     * Used to store the next item that Batman receives
     */
    private int currentIndex;


    /**
     * Default Constructor
     * Initializes an empty gadget array
     */
    public UtilityBelt() 
    {
        this.gadgets = new Gadget[1];
        this.currentIndex = 0;
    }

    /**
     * Extend the size of the internal gadgets array by 10
     */
    private Gadget[] extendArray()
    {
        int oldSize = this.gadgets.length;
        Gadget[] newArray = new Gadget[oldSize + 10];

        // Copy each value from gadgets into the new array
        for (int i = 0; i < this.currentIndex; ++i) 
        {
            newArray[i] = this.gadgets[i];
        }
        return newArray;
    }

    /**
     * Add a single gadget object to Batman's belt
     * 
     * @param g  The gadget to be added to Batman's belt
     */
    public void addGadget(Gadget g) 
    {
        // Check if there is currently enough space in the belt
        if (this.currentIndex == this.gadgets.length) 
        {
            // Extend the size of the gadgets array
            this.gadgets=this.extendArray();
        }  
        
        // Add the gadget into the gadgets array
        this.gadgets[this.currentIndex] = g;
        this.currentIndex++;
        
    }

    // Getter methods

    /**
     * Get the value of all gadgets inside Batman's belt
     * 
     * @return  total The sum of price for all gadgets in Batman's belt
     */
    public double getTotalPrice() 
    {
        double total = 0;

        // Loop over all gadgets
        for (int i = 0; i < currentIndex; ++i) 
        {
            total += this.gadgets[i].getPrice();
        }
        return total;
    }

    /**
     * Get the total weight of all gadgets in Batman's belt
     * 
     * @return  total The sum of weight for all gadgets in Batman's belt
     */
    public double getTotalWeight() 
    {
        double total = 0;

        // Loop over all gadgets
        for (int i = 0; i <= this.currentIndex -1; ++i ) 
        {
            total += this.gadgets[i].getWeight();
        }
        return total;
    }

    /**
     * Get the total number of gadgets inside Batman's belt
     * 
     * @return  currentIndex The number of gadgets currently in Batman's belt
     */
    public int getSize() 
    {
        return this.currentIndex;
    }

    /**
     * Retrieve the array that constitutes Batman's utility belt
     * 
     * @return gadgets The Gadget array that is Batman's utility belt
     */

    public Gadget[] getGadgets()
    {
        return gadgets;
    }


    /**
     * Weigh all the gadgets in Batman's belt with the same name
     * 
     * @param name  Name of gadgets to calculate weight from
     * @return  totalWeight  Total weight of all gadgets in Batman's belt with a specified name 
     */
    public double weighGadgetByName(String name) 
    {
        double totalWeight = 0.0;

        // Loop over all gadgets
        for (int i = 0; i < this.currentIndex; ++i) 
        {
            //only perform the calculations if the names are equal
            Gadget gadget = this.gadgets[i];
            if (gadget.getName().equalsIgnoreCase(name))
            {
                totalWeight += gadget.getWeight();
            }
        }
        return totalWeight;
    }

    /**
     * Compute the price of all the gadgets in Batman's belt with the same name
     * 
     * @param name  Name of gadgets to calculate price
     * @return totalPrice  Total price of all gadgets in Batman's belt with a specified name
     */
    public double priceGadgetByName(String name) 
    {
        double totalPrice = 0;

        // Loop over all gadgets
        for (int i = 0; i < this.currentIndex; i++) 
        {
            //only perform the calculations if the names are equal.
            Gadget gadget = this.gadgets[i];
            if (gadget.getName().equalsIgnoreCase(name))
            {
                totalPrice += gadget.getPrice();
            }
        }
        return totalPrice;
    }

    /**
     * Print the information regarding all contents of Batman's belt, to be printed onto a dialogue prompt
     * on the lens of Batman's cowl
     * 
     * @return output  A string representing the information stored in the UtilityBelt class
     */
    @Override
    public String toString() 
    {
        String output = "Avalaible gadgets:\n";

        // Loop over all gadgets
        for (int i = 0; i < this.currentIndex; ++i)
        {
            //print out each Item in the array
            output += this.gadgets[i].toString() + "\n";
        }
        return output;
    }
}
