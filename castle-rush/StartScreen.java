import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        Buttons settingsButton = new Buttons("assets/start/settings.png", new Settings());
        addObject(settingsButton, 253, 562);
        
        Buttons playButton = new Buttons("assets/start/play.png", new GameBoard());
        addObject(playButton, 642, 562);
        
        Buttons creditsButton = new Buttons("assets/start/credits.png", new Credits());
        addObject(creditsButton, 1025, 562);
        
    }
}
