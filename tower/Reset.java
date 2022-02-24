import greenfoot.*;  
public class Reset extends Actor
{
    ArenaEnd game; 
    public Reset(String image)
    {
        //setzt Image
        setImage(new GreenfootImage(image));
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {    
            //Setzt das Geld auf 100
            game.amount = 100;
            //Setzt die Leben des Spielers auf 3
            game.playerHealth = 5;
            //Setzt die Welt zur Map Selection
            Greenfoot.setWorld(new SelectMap());
        }
    }
}
