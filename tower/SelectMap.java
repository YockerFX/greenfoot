import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SelectMap extends World
{
    public SelectMap()
    {    
        super(18, 11, 64);  
        Button mapOneButton = new Button("buttons/map1.png", new ArenaDefault());
        addObject(mapOneButton, 5, 7);
        Button mapTwoButton = new Button("buttons/map_end.png", new ArenaEnd());
        addObject(mapTwoButton, 12, 7);
        
        prepare();
    }
    
        private void prepare()
    {        
        Logo logo = new Logo();
        addObject(logo,17, 10);
    }
}
