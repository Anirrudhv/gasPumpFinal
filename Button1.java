import greenfoot.*;
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button1 extends Actor
{
    MouseInfo mouse = Greenfoot.getMouseInfo();

    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage gi = new GreenfootImage(20,20); 
    
    public Button1(String text) {
        
       
        //setTexts(text);
          gi.setColor(greenfoot.Color.BLACK);
          gi.drawString(text,0,25);
         setImage(gi);
        //((MyWorld) getWorld()).text().update("Welcome");
    }
    
    public void initTexts()
   
   {
      
       
    }
    
    public void setTexts(String msg)
    {
        gi.clear();
        gi.setColor(greenfoot.Color.YELLOW);
        gi.fill();
        gi.setColor(greenfoot.Color.BLACK);
        gi.drawString(msg,0,25);
    }
    
    
    public void act() 
    {
        // Add your action code here.
        //((MyWorld) getWorld()).text().update("Welcome");
        /*if(Greenfoot.mouseClicked(this))
        {*/
            getWorld().removeObjects(getWorld().getObjects(GasPump.class));
            //getWorld().removeObjects(getWorld().getObjects(Customer.class));
            ((MyWorld) getWorld()).text().update("Welcome");
            /*getWorld().addObject(machine1, 278,171);
            Greenfoot.delay(30);
            machine1.function();
        }*/
    }   
}


