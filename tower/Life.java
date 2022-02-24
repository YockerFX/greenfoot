import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Life extends Actor
{
    ArenaEnd game;
    private World link;
    
    public Life(String image, World link)
    {
        //setzt Image
        setImage(new GreenfootImage(image));
        //link zur Welt
        this.link = link;
    }
    
    public void act()
    {
        endOfRoad();
        setImage(new GreenfootImage("life/" + game.playerHealth + ".png"));
    }
    
    public void endOfRoad()
    {
        //seperiert Gegner
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
            //zieht Leben des Spielers ab
            game.playerHealth--;
            //entfernt Gegner
            getWorld().removeObject(enemy);
        }
        //Link in andere Welt bei 0 Leben
        if(game.playerHealth < 1)
        {
            Greenfoot.setWorld(this.link);
        }
    }
}
