import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver() 
    {
        super(1000, 800, 1, false);
    }
    public void act(){
        
        if(Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}