import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Enemy extends Actor
{
    //leben der Gegner
    public int enemyHealth = 5;
    
    int speed = 0;
    
    ArenaEnd world;
    public void act()
    {
        movement();
        gotHit();
    }
    
    public void movement()
    {
        //Geschwindigkeit
        move(speed);
        //Rotation/Bewegungsrichtung der Figur
        List <Road> roadDown = getObjectsAtOffset(-32, 0, Road.class);
        for(Road roads: roadDown)
        {
            if(roads.straight == false && getRotation() == 0)
            {
                setRotation(roads.turn);
            }
        }
        
        List <Road> roadRight = getObjectsAtOffset(0, -32, Road.class);
        for(Road roads: roadRight)
        {
            if(roads.straight == false && getRotation() == 90)
            {
                setRotation(roads.turn);
            }
        }
        
        List <Road> roadBackwards = getObjectsAtOffset(0, 32, Road.class);
        for(Road roads: roadBackwards)
        {
            if(roads.straight == false && getRotation() == 270)
            {
                setRotation(roads.turn);
            }
        }
        
        List <Road> roadUp = getObjectsAtOffset(32, 0, Road.class);
        for(Road roads: roadUp)
        {
            if(roads.straight == false && getRotation() == 180)
            {
                setRotation(roads.turn);
            }
        }
    }
    
    public void gotHit()
    {
        //Seperiert Projektiele 
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile != null)
            {
                //zieht Leben des Gegners ab
                enemyHealth--;
                //entfernt Projektiel
                getWorld().removeObject(projectile);
            }
        //Kill bei 0 Leben
            if(enemyHealth < 1)
        {
            //Geld für Kill
            //world.amount += 100;
            getWorld().removeObject(this);
        }
    }
    
    public Enemy(int level)
    {
        if(level == 1)
        {
            setImage("enemy/yellow.png");
            speed += 2;
        }
        if(level == 2)
        {
            setImage("enemy/green.png");
            enemyHealth += 5;
            speed += 2;
        }
        if(level == 3)
        {
            setImage("enemy/aqua.png");
            enemyHealth += 2;
            speed += 4;
        }
        if(level == 4)
        {
            setImage("enemy/blue.png");
            enemyHealth += 10;
            speed += 2;
        }
        if(level == 5)
        {
            setImage("enemy/pink.png");
            enemyHealth += 10;
            speed += 3;
        }
        if(level == 6)
        {
            setImage("enemy/red.png");
            enemyHealth += 25;
            speed += 1;
        }
        if(level == 7)
        {
            setImage("enemy/white.png");
            enemyHealth += 15;
            speed += 2;
        }
        if(level == 8)
        {
            setImage("enemy/gray.png");
            enemyHealth += 10;
            speed += 6;
        }
        if(level == 9)
        {
            setImage("enemy/black.png");
            enemyHealth += 50;
            speed += 4;
        }
    }
}
