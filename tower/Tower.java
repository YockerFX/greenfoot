import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Tower extends Actor
{
    int fireRate = 0;
    public Tower(String image)
    {
        setImage(new GreenfootImage(image));
    }
    
    public void act()
    {
        findEnemy();
    }
    
    public void findEnemy()
    {
        fireRate++;
        //Range default Tower = 128
        List<Enemy> enemies = getObjectsInRange(128, Enemy.class);
        for(Enemy everyEnemy : enemies)
        {
            //Anzahl der Schüsse
            if(fireRate > 20)
            {
                //setz Image des Schusses
                Projectile projectile = new Projectile("pew.png");
                //Schuss wird am Tower erstellt
                getWorld().addObject(projectile, getX(), getY());
                //Gegner Position
                projectile.turnTowards(everyEnemy.getX(), everyEnemy.getY());
                fireRate = 0;
            }
        }
    }
}
