import greenfoot.*;  

public class baby4 extends Actor
{
    
    public void act() 
    {
        int x=getX();//initialises integer x to the X coordinates 
     int y=getY();//initialises integer y to the Y coordinates 
        if(Greenfoot.isKeyDown("up")) //if "up" key is pushed, then the codes below will continue
        {
            y--; //value of y gets decreased by 1
        }
        else if(Greenfoot.isKeyDown("down")) //if "down" key is pushed, then the codes below will continue
        {
            y++;//value of y gets increased by 1
        }
        setLocation(x,y);//sets location of actor at its coordinate at (x,y)
    }    
}
