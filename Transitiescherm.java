import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Transitiescherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Transitiescherm extends World
{
    /**
     * Constructor for objects of class Transitiescherm.
     * 
     */
    public Transitiescherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("bg.png");
        addObject(new StartTransitie(), 500, 200);
        addObject(new KarakterTransitie(1), 400, 650);
        addObject(new KarakterTransitie(2), 500, 650);
        addObject(new KarakterTransitie(3), 600, 650);
        addObject(new LevelNummer(1), 300, 500);
        addObject(new LevelNummer(2), 450, 500);
        addObject(new LevelNummer(3), 600, 500);
        addObject(new LevelNummer(4), 750, 500);
        resetMunten();
        voegMuntenToe();
        Hero.hasKey = false;
        LevelNummer.levelSelected = false;
        KarakterTransitie.karakterSelected = false;
    }
    
    void resetMunten(){
        Collectable.goudenMunten.clear();
        Collectable.zilverenMunten.clear();
    }
    
    void voegMuntenToe(){
        Munt gMunt1 = new Munt(450, 2054, 1);
        Collectable.goudenMunten.add(gMunt1);
        Munt gMunt2 = new Munt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt2);
        Munt gMunt3 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt3);
        Munt gMunt4 = new Munt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt4);
        Munt gMunt5 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt5);
        GoudenMunt gMunt6 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt6);
        GoudenMunt gMunt7 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt7);
        GoudenMunt gMunt8 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt8);
        GoudenMunt gMunt9 = new GoudenMunt(500, 2054, 1);
        Collectable.goudenMunten.add(gMunt9);
        GoudenMunt gMunt10 = new GoudenMunt(700, 2054, 1);
        Collectable.goudenMunten.add(gMunt10);
        GoudenMunt gMunt11 = new GoudenMunt(800, 2054, 1);
        Collectable.goudenMunten.add(gMunt11);
        GoudenMunt gMunt12 = new GoudenMunt(1000, 2054, 1);
        Collectable.goudenMunten.add(gMunt12);
        ZilverenMunt zMunt1 = new ZilverenMunt(900, 2054, 1);
        Collectable.zilverenMunten.add(zMunt1);
        
    }
}
