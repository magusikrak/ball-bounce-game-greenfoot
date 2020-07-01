import greenfoot.*; 

public class ball1 extends Actor
{
    
    public void act() 
    {
        action();//compiler moves to action() method
    } 
    public static int c=0;//initialises public variable c to 0
    public static int b=0;//initialises public variable b to 0
    public static int x=0;//initialises public variable x to 0
    public static int y=0;//initialises public variable y to 0
    public void action()
    {
      x=getX();//initialises integer x to X-coordinate
      y=getY();//initialises integer y to Y-coordinate     
      move(4);//moves the actor 4 step at a time    
      int r=Greenfoot.getRandomNumber(55);//initialises integer r to any random number between 0-55
      int a=Greenfoot.getRandomNumber(50);//initialises integer a to any random number between 0-50
        if (isTouching(baby1.class))//only executes the code if the actor is touching baby1.class
        {
           
            setRotation(r);//rotates the actor by r units
            Greenfoot.playSound("tock.wav");//plays "tock.wav"
         
        }
      
        if (isTouching(baby2.class))//only executes the code if the actor is touching baby2.class
        {
        
            setRotation(a+155);//rotates the actor by a+155 units where value of rotating factor becomes 155-205
            Greenfoot.playSound("tock.wav");//plays "tock.wav"
           
        }
      
        if (isTouching(baby3.class))//only executes the code if the actor is touching baby3.class
        {
        
            setRotation(r);//rotates the actor by r units
            Greenfoot.playSound("tock.wav");//plays "tock.wav"
         
        }
    
        if (isTouching(baby4.class))//only executes the code if the actor is touching baby4.class
        {
           
         
            setRotation(a+155);//rotates the actor by a+155 units where value of rotating factor becomes 155-205
            Greenfoot.playSound("tock.wav");//plays "tock.wav"
       
        }
        if(isTouching(wallRight.class) || isTouching(wallLeft.class))//only executes the code if actor is touching either wallRight or wallLeft
        {
                if(isTouching(wallRight.class))//only executes code if actor is touching wallRight 
                {
                        c++;//increases value of c by 1
                        Greenfoot.stop();//stops the program
                        Greenfoot.playSound("tutu.wav");//plays "tutu.wav"
                  }
                  else if(isTouching(wallLeft.class))//only executes code if actor is touching wallRight 
                  {
                        b++;//increases value of b by 1
                        Greenfoot.stop();//stops the program
                        Greenfoot.playSound("tutu.wav");//plays "tutu.wav"
                    }
        }
     
    }
    
}
