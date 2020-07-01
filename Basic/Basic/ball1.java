import greenfoot.*;  


public class ball1 extends Actor
{
   
    public void act() 
    {
       
        move(1);//moves ball 1 step at a time
       
        Actor baby_1 = getOneIntersectingObject(baby1.class);//changes value of baby_1 to not-null if actor ball1 intersects baby1
        if (baby_1!=null)//checks if value of baby_1 is null or not
        {
            turn(180);//turns 180 degrees       
        }
        Actor baby_2 = getOneIntersectingObject(baby2.class);//changes value of baby_2 to not-null if actor ball1 intersects baby2
        if (baby_2!=null)//checks if value of baby_2 is null or not
        {
            turn(180);//turns 180 degrees
        }

    } 
    
}
