package FinalProjectTask1;

/**
 * @author hasin
 *
 *  ShapeComparator class that overrides compare method and implements equals method
 * 
 * It Implements the Comparator interface
 */
import java.util.*;
public class ShapeComparator implements Comparator<Shape>{

    /**
     * overridden compare method
     * this method compares one passed object with another passed object.
     * the volumes of the objects is compared.
     * If volume of Object1(s1) is greater than volume of Object2(s2), return -1.
     * If volume of Object1(s1) is less than volume of Object2(s2), return 1.
     * 
     * @param s1 Object of type Shape, to be compared with another Object (s2) of type Shape
     * @param s2 Object of type Shape, to be compared with another Object (s1) of type Shape
     * @return -1 if Object(s1) comes before Object(s2), 0 if they are equal or 1 otherwise
     */ 
    @Override
    public int compare(Shape s1,Shape s2){
    if(s1.getVolume()>s2.getVolume()){
        return -1;}
    else if(s1.getVolume()<s2.getVolume()){
        return 1;}
    else{
        return 0;}
    }
    
    /**
     * method equals
     * If both Objects volumes are equal, returns true.
     * If both Objects volumes are not equal, returns false.
     * 
     * @param s1 Object of type Shape, to be compared with another Object (s2) of type Shape
     * @param s2 Object of type Shape, to be compared with another Object (s1) of type Shape
     * @return true if volumes of both objects are equal or false otherwise
     */
    public boolean equals(Shape s1,Shape s2){
        return s1.getVolume()==s2.getVolume();
    }

}
