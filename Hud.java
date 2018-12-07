import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Hud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud extends Actor
{
    public static char type;
    static ArrayList<Munt> munten = new ArrayList();
    public void update(){
        // HUD interface.
        // Heart
        if(Hero.levens > StartScherm.hudLevens){
            getWorld().removeObjects(getWorld().getObjects(Heart.class));
            StartScherm.hudLevens = 0;
            for(int i = 0; StartScherm.hudLevens < Hero.levens; i++){
                getWorld().addObject(new Heart(),(50+(60*StartScherm.hudLevens)), 50);
                StartScherm.hudLevens++;
            }
        }
        // Munten
        /*if(Hero.munten > Startscherm.hudMunten){
                for(int i = 0; Startscherm.hudMunten < Hero.munten; i++){
                    if(munten.get(munten.size()-1).type == 'g'){
                        getWorld().addObject(new Munt('g'), (950-(10*Startscherm.hudMunten)), 50);
                    }
                    else if(munten.get(munten.size()-1).type == 'z'){
                        getWorld().addObject(new Munt('z'), (950-(10*Startscherm.hudMunten)), 50);
                    }
                    Startscherm.hudMunten++;
                }
        }*/
        if(Hero.munten > StartScherm.hudMunten){
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            StartScherm.hudMunten = 0;
            for(int i = 0; i < munten.size(); i++){
                getWorld().addObject(munten.get(i), (950-(10*i)), 50);
            }
        }
        // Reset munten in HUD wanneer er 40 muntjes zijn verzameld.
        if(Hero.muntWaarde >= 20){
            Hero.muntWaarde -= 20;
            munten.clear();
            getWorld().removeObjects(getWorld().getObjects(Munt.class));
            Hero.levens++;
        }
        
        //Diamanten
        //addObject(new Diamanten(), 50, 110);
    }
    
    public static void reset(){
        StartScherm.hudLevens = 0;
        StartScherm.hudMunten = 0;
        munten.clear();
    }
    public void act() 
    {
        update();
    }  

}