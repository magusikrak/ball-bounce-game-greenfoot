import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int a=3;
        move(1);
        Actor net = getOneIntersectingObject(barrier.class);
        if (net!=null)
        {
            //turn(180);
            //move(1);
        }
            
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            turn(180);
            //move(5);
        }
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            turn(180);
          //  move(-5);
        }

    } 
    
}
