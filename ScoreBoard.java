import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard.java extends Actor
{
    
    private int aantalDiamanten = 0;
    
    
   public Scoreboard(){
        setImage(new GreenfootImage("X  " + aantalDiamanten, 30, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public void addDiamanten()
    {
       aantalDiamanten++; 
       setImage(new GreenfootImage("X  " + aantalDiamanten, 30, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
