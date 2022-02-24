import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Road extends Actor
{
    
    public int turn;
    public boolean straight;
    //Bewegung nach rechts (straight)
    public Road(String image, boolean straight)
    {
        setImage(new GreenfootImage(image));
        this.straight = straight;
    }
    //int = Neigungsgrad
    public Road(String image, int turn)
    {
        setImage(new GreenfootImage(image));
        this.turn = turn;
    }
    
    
    
    public void act()
    {
        // Add your action code here.
    }
}
