import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class LosingScreen extends World
{
    public LosingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(18, 11, 64);
        
        Reset button = new Reset("buttons/reset.png");
        addObject(button,992, 608);
    }
}
