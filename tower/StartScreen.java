import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartScreen extends World
{
    public StartScreen()
    {    
        super(1152, 704, 1); 
        
        Button playButton = new Button("buttons/play.png", new SelectMap());
        addObject(playButton, 574, 640);
        
        prepare();
    }
    
    private void prepare()
    {
        Logo logo = new Logo();
        addObject(logo,1120, 672);
    }

}
