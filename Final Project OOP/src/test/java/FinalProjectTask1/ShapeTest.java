package FinalProjectTask1;

import java.util.ArrayList;
import java.util.Collections;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author hasin
 * Shape classes JUnit Testing Class
 */
public class ShapeTest{
    
    /**
     * Tests of abstract Shape class
     */
    
    /**
    * Test the compareTo method of abstract class Shape
    * (not overridden by child classes)
    */
    @Test
    public void testCompareTo()
    {   Shape s1 = new Sphere(4.0);
        Shape s2 = new Sphere(4.0);
        Shape s3 = new Cylinder(4.0, 1.0);
        
        int expResult1 = 0;
        
        Assert.assertEquals("Testing comparison of equal Surface Areas of different objects",expResult1, s1.compareTo(s2));
        
        int expResult2= -1;
        
        Assert.assertEquals("Testing comparison of different Surface Areas of different objects",expResult2, s3.compareTo(s1));
        
        int expResult3= 1;
        
        Assert.assertEquals("Testing comparison of different Surface Areas of different objects",expResult3, s1.compareTo(s3));
        
        //Cuboids with same surface area but different volumes
        Shape s4 = new Cuboid(1.0, 1.0, 5.0);
        Shape s5 = new Cuboid(1.0, 2.0, 3.0);
        
        Assert.assertEquals("Testing comparison of equal Surface Areas but different Volumes of different objects",expResult2, s4.compareTo(s5));
        
        Assert.assertEquals("Testing comparison of equal Surface Areas but different Volumes of different objects", expResult3, s5.compareTo(s4));
        
        //list in ascending order
        ArrayList<Shape> expList=new ArrayList<>();
        expList.add(s4);
        expList.add(s5);
        expList.add(s3);
        expList.add(s1);
        expList.add(s2);
        
        //random sorted list
        ArrayList<Shape> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        Collections.sort(list);
        
        /**
         * Comparing list manually set in ascending order with list set in ascending order by compareTo method
         */
        Assert.assertEquals("Testing compareTo method on ArrayList", expList, list);
    }
    
    /**
     * Tests of ShapeComparator class
     */
    
    public void testCompare(){
        ShapeComparator obj = new ShapeComparator();

        Shape s1 = new Cuboid(3.0, 4.0, 5.0);
        Shape s2 = new Cuboid(3.0, 4.0, 5.0);
        
        int expResult1 = 0;
        
        Assert.assertEquals("Testing comparison of equal Volumes of different objects",expResult1, obj.compare(s1, s2));
        
        Shape s3= new Cube(2.0);
        
        int expResult2= -1;
        
        Assert.assertEquals("Testing comparison of different Volumes of different objects",expResult2, obj.compare(s1, s3));
        
        Shape s4= new Cuboid(3.0, 4.0, 6.0);
        
        int expResult3= 1;
        
        Assert.assertEquals("Testing comparison of equal Volumes of different objects",expResult3, obj.compare(s1, s4));
        
        //list in descending order
        ArrayList<Shape> expList=new ArrayList<>();
        expList.add(s4);
        expList.add(s1);
        expList.add(s2);
        expList.add(s3);
        
        //random sorted list
        ArrayList<Shape> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        Collections.sort(list, new ShapeComparator());
        
        /**
         * Comparing list manually set in descending order with list set in descending order by compare method
         */
        Assert.assertEquals("Testing compare method on ArrayList", expList, list);
    }

    /**
     * Test of equals method, of class ShapeComparator.
     */
    @Test
    public void testEquals(){
        ShapeComparator obj = new ShapeComparator();

        Shape s1 = new Cuboid(3.0, 4.0, 5.0);
        Shape s2 = new Cuboid(3.0, 4.0, 5.0);
        Shape s3 = new Cuboid(3.0, 5.0, 4.0);
        Shape s4 = new Cuboid(3.0, 6.0, 7.0);
        
        Assert.assertEquals("Testing comparison of Volumes of different objects",true, obj.equals(s1, s2));
        Assert.assertEquals("Testing comparison of Volumes of different objects",true, obj.equals(s1, s3));
        Assert.assertEquals("Testing comparison of Volumes of different objects",false, obj.equals(s1, s4));
    }
    
    /**
     * Tests of Sphere class
     */
    
    private static Sphere sphere=new Sphere(4.0);
    private final static double ACCURACY = .000001;

    /**
     * Test of getSurfaceArea method, of class Sphere.
     */
    @Test
    public void testGetSurfaceAreaSphere(){
        Assert.assertEquals("Test of Surface Area of Sphere", 201.061930, sphere.getSurfaceArea(), ACCURACY);
    }

    /**
     * Test of getVolume method, of class Sphere.
     */
    @Test
    public void testGetVolumeSphere(){
        Assert.assertEquals("Test of Volume of Sphere", 268.082506, sphere.getVolume(), ACCURACY);
    }

    /**
     * Test of getShapeType method, of class Sphere.
     */
    @Test
    public void testGetShapeTypeSphere(){
        Assert.assertEquals("Test of String Shape Name", "Sphere", sphere.getShapeType());
    }

    /**
     * Test of getBreadth method, of class Sphere.
     */
    @Test
    public void testGetRadiusSphere(){
        Assert.assertEquals("Test of Radius of Sphere", 4.00, sphere.getRadius(), ACCURACY);
    }

    /**
     * Test of toString method, of class Cylinder.
     */
    @Test
    public void testToStringSphere(){
        String toString="Sphere:\tID = 0\tSurfaceArea = 201.06\tVolume = 268.08\tradius = 4.00";
        Assert.assertEquals("Test of toString method of Sphere", toString, sphere.toString());
    }
    
    /**
     * Test of getID method, of superclass Shape.
     */
    public void testGetIdSphere(){
        Assert.assertEquals("Test of ID of Sphere object", 0, sphere.getId());
    }
    
    /**
     * Tests of Cylinder class
     */
    
    private static Cylinder cylinder=new Cylinder(4.0,1.0);

    /**
     * Test of getSurfaceArea method, of class Cylinder.
     */
    @Test
    public void testGetSurfaceAreaCylinder(){
        Assert.assertEquals("Test of Surface Area of Cylinder", 31.415926, cylinder.getSurfaceArea(), ACCURACY);
    }

    /**
     * Test of getVolume method, of class Cylinder.
     */
    @Test
    public void testGetVolumeCylinder(){
        Assert.assertEquals("Test of Volume of Cylinder", 12.566370, cylinder.getVolume(), ACCURACY);
    }

    /**
     * Test of getShapeType method, of class Cylinder.
     */
    @Test
    public void testGetShapeTypeCylinder(){
        Assert.assertEquals("Test of String Shape Name", "Cylinder", cylinder.getShapeType());
    }

    /**
     * Test of getBreadth method, of class Cylinder.
     */
    @Test
    public void testGetRadiusCylinder(){
        Assert.assertEquals("Test of Radius of Cylinder", 1.00, cylinder.getRadius(), ACCURACY);
    }

    /**
     * Test of getHeight method, of class Cylinder.
     */
    @Test
    public void testGetHeightCylinder(){
        Assert.assertEquals("Test of Height of Cylinder", 4.00, cylinder.getHeight(), ACCURACY);
    }

    /**
     * Test of toString method, of class Cylinder.
     */
    @Test
    public void testToStringCylinder(){
        String toString="Cylinder:\tID = 1\tSurfaceArea = 31.42\tVolume = 12.57\theight = 4.00\tradius = 1.00";
        Assert.assertEquals("Test of toString method of Cylinder", toString, cylinder.toString());
    }
    
    /**
     * Test of getID method, of superclass Shape.
     */
    public void testGetIdCylinder(){
        Assert.assertEquals("Test of ID of Cylinder object", 1, cylinder.getId());
    }
    
    /**
     * Tests of Cuboid class
     */
    
    private static Cuboid cuboid=new Cuboid(3.0,4.0,5.0);

    /**
     * Test of getSurfaceArea method, of class Cuboid.
     */
    @Test
    public void testGetSurfaceAreaCuboid(){
        Assert.assertEquals("Test of Surface Area of Cuboid", 94.000000, cuboid.getSurfaceArea(), ACCURACY);
    }

    /**
     * Test of getVolume method, of class Cuboid.
     */
    @Test
    public void testGetVolumeCuboid(){
        Assert.assertEquals("Test of Volume of Cuboid", 60.000000, cuboid.getVolume(), ACCURACY);
    }

    /**
     * Test of getShapeType method, of class Cuboid.
     */
    @Test
    public void testGetShapeTypeCuboid(){
        Assert.assertEquals("Test of String Shape Name", "Cuboid", cuboid.getShapeType());
    }

    /**
     * Test of getLength method, of class Cuboid.
     */
    @Test
    public void testGetLengthCuboid(){
        Assert.assertEquals("Test of Length of Cuboid", 3.00, cuboid.getLength(), ACCURACY);
    }

    /**
     * Test of getBreadth method, of class Cuboid.
     */
    @Test
    public void testGetBreadthCuboid(){
        Assert.assertEquals("Test of Breadth of Cuboid", 4.00, cuboid.getBreadth(), ACCURACY);
    }

    /**
     * Test of getHeight method, of class Cuboid.
     */
    @Test
    public void testGetHeightCuboid(){
        Assert.assertEquals("Test of Height of Cuboid", 5.00, cuboid.getHeight(), ACCURACY);
    }

    /**
     * Test of toString method, of class Cuboid.
     */
    @Test
    public void testToStringCuboid(){
        String toString="Cuboid:\tID = 2\tSurfaceArea = 94.00\tVolume = 60.00\tlength = 3.00\tbreadth = 4.00\theight = 5.00";
        Assert.assertEquals("Test of toString mthod of Cuboid", toString, cuboid.toString());
    }
    
    /**
     * Test of getID method, of superclass Shape.
     */
    public void testGetIdCuboid(){
        Assert.assertEquals("Test of ID of Cuboid object", 2, cuboid.getId());
    }
    
    /**
     * Tests of Cube class
     */
    
    private static Cube cube=new Cube(2.0);

    /**
     * Test of getShapeType method, of class Cube.
     */
    @Test
    public void testGetShapeTypeCube(){
        Assert.assertEquals("Test of String Shape Name", "Cube", cube.getShapeType());
    }
    
    /**
     * Test of getSurfaceArea method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testGetSurfaceAreaCube(){
        Assert.assertEquals("Test of Surface Area of Cube", 24.000000, cube.getSurfaceArea(), ACCURACY);
    }

    /**
     * Test of getVolume method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testGetVolumeCube(){
        Assert.assertEquals("Test of Volume of Cube", 8.000000, cube.getVolume(), ACCURACY);
    }

    /**
     * Test of getLength method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testGetLengthCube(){
        Assert.assertEquals("Test of Length of Cube", 2.00, cube.getLength(), ACCURACY);
    }

    /**
     * Test of getBreadth method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testGetBreadthCube(){
        Assert.assertEquals("Test of Breadth of Cube", 2.00, cube.getBreadth(), ACCURACY);
    }

    /**
     * Test of getHeight method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testGetHeightCube(){
        Assert.assertEquals("Test of Height of Cube", 2.00, cube.getHeight(), ACCURACY);
    }

    /**
     * Test of toString method, of superclass Cuboid from class Cube's context.
     */
    @Test
    public void testToStringCube(){
        String toString="Cube:\tID = 3\tSurfaceArea = 24.00\tVolume = 8.00\tlength = 2.00\tbreadth = 2.00\theight = 2.00";
        Assert.assertEquals("Test of toString mthod of Cuboid", toString, cube.toString());
    }
    
    /**
     * Test of getID method, of superclass Shape.
     */
    public void testGetIdCube(){
        Assert.assertEquals("Test of ID of Cube object", 3, cube.getId());
    }
}

