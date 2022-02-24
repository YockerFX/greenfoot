import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Credit extends Actor
{
    ArenaEnd game; 
    
    public Credit(String image)
    {
        //setzt Image
        setImage(new GreenfootImage(image));
    }
    public void act()
    {
        //updatet Image
        setImage(new GreenfootImage("credits/" + game.amount + ".png"));
    }
}
