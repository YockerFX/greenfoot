import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Menu extends Actor
{   
    private World link;
    ArenaEnd game;
    public Menu(String image, World link)
    {
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    
    public void act()
    {
       endOfRoad();
    }
    //siehe Life.class
    public void endOfRoad()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
            game.playerHealth--;
            getWorld().removeObject(enemy);
        }
        if(game.playerHealth < 1)
        {
            Greenfoot.setWorld(this.link);
        }
    }
}
