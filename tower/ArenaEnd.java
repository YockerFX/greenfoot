import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class ArenaEnd extends World
{
    public static int amount = 100;
    
    public static int playerHealth = 5;
    
    int testTowerPrice = 100;
    
    int worldTime;
    
    int wave = 1;
        
    int map[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 1, 1, 2, 0, 0, 3, 1, 1, 2, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 3, 4, 0, 0, 1, 0, 0, 0, 0 },
                    { 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 3, 1 },
                    { 0, 0, 3, 1, 4, 0, 0, 0, 1, 0, 0, 1, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 },
                    { 0, 0, 0, 0, 0, 0, 2, 1, 5, 0, 0, 1, 0 },
                    { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 4, 0 },
                    { 0, 0, 0, 0, 0, 0, 3, 1, 1, 1, 4, 0, 0 }
                  };
        
    public ArenaEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1152, 704, 1); 
        
        Menu menu = new Menu("menu_end.png",new LosingScreen());
        addObject(menu,992, 352);
        
        Logo logo = new Logo();
        addObject(logo,1120, 672);
        
        Reset button = new Reset("buttons/reset.png");
        addObject(button,992, 608);
        
        Life health = new Life("life/" + playerHealth + ".png",new LosingScreen());
        addObject(health,928, 608);
        
        CreditDisplay title = new CreditDisplay("credits/title.png");
        addObject(title, 992, 96);
        
        Credit credits = new Credit("credits/" + amount + ".png");
        addObject(credits, 985, 142);
        
        prepare(); 
    }
    
    public void act()
    {
       addTower();
       worldTime++;
       spawnWave();
    }
    
    private void prepare()
    {
        for(int b = 0; b < 13; b++)
            for(int a = 0; a < 9; a++)
            {
                if(map[a][b] == 1)
                {
                    addObject(new Road("road_end.png", true), 96 + b * 64, 96 + a * 64);
                }
                if(map[a][b] == 2)
                {
                    //runter
                    addObject(new Road("road_end.png", 90), 96 + b * 64, 96 + a * 64);
                }
                if(map[a][b] == 3)
                {
                    //rechts
                    addObject(new Road("road_end.png", 0), 96 + b * 64, 96 + a * 64);
                }
                if(map[a][b] == 4)
                {
                    //hoch
                    addObject(new Road("road_end.png", 270), 96 + b * 64, 96 + a * 64);
                }
                if(map[a][b] == 5)
                {
                    //links
                    addObject(new Road("road_end.png", 180), 96 + b * 64, 96 + a * 64);
                }
            }
    }
    
    public void addTower()
    {
        if(Greenfoot.mouseClicked(null) && Greenfoot.getMouseInfo().getActor() ==null && amount >=testTowerPrice)
        {
            addObject(new Tower("tower.png"), (Greenfoot.getMouseInfo().getX() / 64) * 64 + 32, (Greenfoot.getMouseInfo().getY() / 64) * 64 + 32);
            amount -= testTowerPrice;
        }
    }
    
    public void spawnWave()
    {
        if(worldTime % 60 == 0)
        {
            addObject(new Enemy(wave), 65, 160);
        }
        if(worldTime % 810 == 809)
        {
            //wave++;
            addObject(new Enemy(wave += 1), 65, 160);
        }
    }
}
