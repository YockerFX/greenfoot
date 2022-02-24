import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Projectile extends Actor
{

    public Projectile(String image)
    {
        //setzt Image
        setImage(new GreenfootImage(image));
    }
    
    public void act()
    {
        //Geschwindigkeit
        move(10);
    }
}
