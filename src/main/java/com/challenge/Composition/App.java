package com.challenge.Composition;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell","240",dimensions);
        
        Monitor monitor = new Monitor("27inch Beast", "Asus", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        
        PC pc = new PC(motherboard, monitor, theCase);
        pc.powerUp();
        
        
    }
}
