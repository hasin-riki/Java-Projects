package FinalProjectTask1;
/**
 * @author hasin
 * 
 * Cube class extending Cuboid class
 * It has properties of a Cube 3d object that is similar to Cuboid
 */
public class Cube extends Cuboid{

    /**
     * This constructor uses the super to reference the extended Cuboid Class
     * @param edge the value for each edge of the Cube object
     */
    public Cube(double edge){
        super(edge,edge,edge);
    }
    
    /**
     * getShapeType method
     * This method returns the shape of the object, here it overrides
     * the Shape class getShapeType method
     * @return shape of the object here "Cube"
     */
    @Override
    public String getShapeType(){
        return "Cube";
    }       
}

