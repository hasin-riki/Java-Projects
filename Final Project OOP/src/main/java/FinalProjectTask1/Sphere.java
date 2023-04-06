package FinalProjectTask1;

/**
 * 
 * @author hasin
 * 
 * Sphere class that extends the Shape class.
 * It has properties for the sphere 3d object.
 *
 */
public class Sphere extends Shape{

    /**
     * The radius of the Cylinder object
     */
    private double radius;
    
    /**
	  * Constructor for the Sphere Class
	  * @param radius Information related to the radius of the sphere
	  */
    public Sphere(double radius){
        super();
        this.radius=radius;
    }
    
    /**
     * getSurfaceArea method, overrides the shape class getSurfaceArea() method
     * @return Total Surface Area of the Sphere Object
     */
    @Override
    public double getSurfaceArea(){
	double surfaceArea = 4 * Math.PI * radius * radius;
        return surfaceArea;
    }
    
    /**
     * getVolume Method, overrides the shape class getVolume() method
     * @return Volume of the Sphere Object
     */
    @Override
    public double getVolume(){
        return 1.333333 * Math.PI * Math.pow(radius, 3);
    }
    
    /**
     * getShapeType method
     * This method returns the shape of the object, overrides the shape class getShapeType method.
     * @return shape of the object here "Sphere"
     */
    @Override
    public String getShapeType(){
        return "Sphere";
    }

    /**
     * getRadius method
     * This method returns the radius of the sphere object.
     * @return radius of the sphere object.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * toString method
     * It overrides the Shape class toString method
     * @return All information about the cylinder in the single line of the format
     * Sphere\tID = 0\tSurface Area = 201.06\tVolume = 268.08\tradius = 4.00";
     */
    @Override
    public String toString() {
                return super.toString() + String.format("\tradius = %.2f",radius);
    }

}