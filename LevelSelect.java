import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    private void prepare() 
    {
     Level1titel level1titel = new Level1titel();   
     Level2titel level2titel = new Level2titel();
     Level3titel level3titel = new Level3titel();
     Level4titel level4titel = new Level4titel();
     Level5titel level5titel = new Level5titel();
     addObject(level1titel, 142 ,426);
     addObject(level2titel, 287 ,453);
     addObject(level3titel, 547 ,600);
     addObject(level4titel, 731 ,487);
     addObject(level5titel, 869 ,405);
     
    }
    public void act()
    {
     if(Greenfoot.isKeyDown("1"));
     {
       Greenfoot.setWorld(new MyWorld()); 
     }     
    }
}
