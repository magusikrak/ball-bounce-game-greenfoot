import greenfoot.*;  
public class baby3 extends Actor
{
   
     
    public void act() 
    {
      
     dance();//compiler moves to class dance()
    }    
  
     public void dance()
     {
         int y=getY();//initialises integer y to the Y coordinates 
         int speed=5;//initialises integer speed to 5
         if(Greenfoot.isKeyDown("w")) y-=speed;//if "w" key is pushed, value of y gets decreased by speed
         if(Greenfoot.isKeyDown("s")) y+=speed;//if "s" key is pushed, value of y gets increased by speed
         setLocation(getX(),y);//sets location of actor at its X coordinate and 'y'
             
           
     }
}
