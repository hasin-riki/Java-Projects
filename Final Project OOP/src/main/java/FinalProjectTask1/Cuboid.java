package FinalProjectTask1;

/**
 * 
 * @author hasin
 * 
 * Cuboid class that extends the Shape class.
 * It has properties for the cuboid 3d object.
 *
 */
public class Cuboid extends Shape{

    /**
     * The length of the Cuboid object
     */
    private double length;
    /**
     * The breadth of the Cuboid object
     */
    private double breadth;
    /**
     * The height of the Cuboid object
     */
    private double height;
    
    /**
     * Constructor for the Cuboid Class
     * @param length Information related to the length of the cuboid
     * @param breadth Information related to the breadth of the cuboid
     * @param height Information related to the height of the cuboid
     */
    public Cuboid(double length,double breadth,double height){
        super();
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    
    /**
     * getSurfaceArea method, overrides the shape class getSurfaceArea() method
     * @return Total Surface Area of the Cuboid Object
     */
    @Override
    public double getSurfaceArea(){
	double surfaceArea = 2 * ((length*breadth)+(breadth*height)+(height*length));
        return surfaceArea;
    }
    
    /**
     * getVolume Method, overrides the shape class getVolume() method
     * @return Volume of the Cuboid Object
     */
    @Override
    public double getVolume(){
        return length * breadth * height;
    }
    
    /**
     * getShapeType method
     * This method returns the shape of the object, overrides the shape class getShapeType method.
     * @return shape of the object here "Cuboid"
     */
    @Override
    public String getShapeType(){
        return "Cuboid";
    }

    /**
     * getLength method
     * This method returns the length of the cuboid object.
     * @return length of the cuboid object.
     */	
    public double getLength() {
        return length;
    }

    /**
     * getBreadth method
     * This method returns the breadth of the cuboid object.
     * @return breadth of the cuboid object.
     */	
    public double getBreadth() {
        return breadth;
    }

    /**
     * getHeight method
     * This method returns the height of the cuboid object.
     * @return height of the cuboid object.
     */	
    public double getHeight() {
        return height;
    }

    /**
     * toString method
     * It overrides the Shape class toString method
     * @return All information about the cylinder in the single line of the format
     * Cuboid:\tID = 2\tSurface Area = 94.00\tVolume = 60.00\tlength = 3.00\tbreadth = 4.00\theight = 5.00";
     */
    @Override
    public String toString() {
        return String.format("%s\tlength = %.2f\tbreadth = %.2f\theight = %.2f", super.toString(), length, breadth, height);
    }

}
