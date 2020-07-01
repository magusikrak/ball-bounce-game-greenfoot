import greenfoot.*; 
public class ball1 extends Actor
{
    
    public void act() 
    {
    
        action();//compiler moves to action() method
        

    } 
    public static  int c=0;//initialises integer c's to 0 and makes it a public variable
    public static int b=0;//initialises integer b's to 0 and makes it a public variable
    public void action()
    {
        int x=getX();//initialises integer x to X coordinate
        int y=getY();//initialises integer x to X coordinate
        move(4);//moves the actor by 4 steps at a time
        int r=Greenfoot.getRandomNumber(30);//initialises integer r to any random number between 0-30
        int a=Greenfoot.getRandomNumber(200);//initialises integer a to any random number between 0-200
        if (isTouching(baby1.class))//only executes method is the ball is touching baby1.class
        {
          
            setRotation(r);//rotates actor by r degrees
          
        }
       
        if (isTouching(baby2.class))//only executes method is the ball is touching baby2.class
        {
      
            setRotation(a);//rotates actor by a degrees
          
        }
       
        if (isTouching(baby3.class))//only executes method is the ball is touching baby3.class
        {
           
            setRotation(r);//rotates actor by r degrees
         
        }
     
        if (isTouching(baby4.class))//only executes method is the ball is touching baby1.class
        {
            setRotation(a);//rotates actor by a degrees
           
        }
        
      
        if(isTouching(wallLeft.class))//only executes method is the ball is touching baby1.class
        {
            b++;//increases the value of b by 1
            Greenfoot.stop();//stops the program
        
        }
      
       if(isTouching(wallRight.class))//only executes method is the ball is touching baby1.class
         {
            c++;//increases the value of c by 1
            Greenfoot.stop();//stops the program
           
        }
        
    }
    
}
