import greenfoot.*;  


public class Earth extends World
{

    
    public Earth()
    {    
        
        super(600, 400, 1); //creates a world of dimension 600 in the X axis and 400 in the Y axis
        for (int loop=0; loop<20; loop=loop+1)//initialise loop to 0; sets condition for loop to be under 20 and increases value of loop by 1
        {
            addObject(new barrier(), 300, 20*loop);//adds barrier object in the center of the world
        }
        addObject(new baby1(), 150, 200);//adds actor baby1 in the location(X,Y) (150,200)
        addObject(new baby2(), 450, 200);//adds actor baby2 in the location(X,Y) (450,200)
        addObject(new ball1(), 200,200);//adds actor ball1 in the location(X,Y) (200,200)
        
    }
}
