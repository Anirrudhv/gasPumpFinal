import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class nozzle extends Actor
{
   public boolean nozzle_check=false;
     Message m=new Message();
     MachineBase machine;
     
     private long lastTime;
private long elapsedTime = 0;
 private long currentTime;
 private boolean start=true;
private float sendVal;
private boolean mouseDown;
    public void setMessage(String msg)
           {
             
               World world=getWorld();
                world.addObject(m,480,50);
                m.setInstructions(msg);
              
            }
            
      
            public void setMachine(MachineBase m)
            {
                machine = m;
            }
            
    public void act() 
    {
        
        if(Greenfoot.mousePressed(this))
        {
            mouseDown=true;
            lastTime = System.currentTimeMillis();
        }
        
         if(Greenfoot.mouseClicked(this))
         {
             mouseDown=false;
             elapsedTime=elapsedTime + currentTime - lastTime;
             
             
             
             
         }
        
        /*
        if(Greenfoot.mouseClicked(this))
        {
             
           
            
            
            {
            lastTime = System.currentTimeMillis();           
            elapsedTime+=lastTime;
            machine.Fuelling(elapsedTime/100000);
            start=false;
            }
           
            
        }
        
        if(Greenfoot.mouseClicked(this))
        {
     //      if(!start)
           {
               
            currentTime = System.currentTimeMillis();
            elapsedTime += currentTime - lastTime;
            sendVal = elapsedTime/100000;
            machine.notFuelling(sendVal);
            start=true;
            }
        }

*/
           
           if(mouseDown)
           {
               setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());               
               currentTime = System.currentTimeMillis();
               elapsedTime= elapsedTime + currentTime -lastTime ;
               machine.Fuelling(elapsedTime);
               
           }
        
       
        
          
         
       
    }    
}
