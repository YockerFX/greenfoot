import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private World link;
    public Button(String image, World link){
        //setzt Image
        setImage(new GreenfootImage(image));
        //link zur Welt
        this.link = link;
    }
    
    public void act()
    {
        //interaktion mit button
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
    }
}
