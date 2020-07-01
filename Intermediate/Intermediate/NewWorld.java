import greenfoot.*; 
public class NewWorld extends World
{

   
    
    public NewWorld()
    {    
        super(600, 400, 1); //creates a world of dimension 600 in the X axis and 400 in the Y axis
        for (int loop=0; loop<20; loop=loop+1)//initialise loop to 0; sets condition for loop to be under 20 and increases value of loop by 1
        {
            addObject(new barrier(), 300, 20*loop);//adds barrier object in the center of the world
        }
        addObject(new baby1(), 150, 200);//adds actor baby1 in the location(X,Y) (150,200)
        addObject(new baby2(), 450, 200);//adds actor baby2 in the location(X,Y) (450,200)
        addObject(new ball1(), 200,200);//adds actor ball1 in the location(X,Y) (200,200)
        addObject(new baby3(), 100, 200);//adds actor baby3 in the location(X,Y) (100,200)
        addObject(new baby4(), 500, 200);//adds actor baby4 in the location(X,Y) (500,200)
        wall();//compiler moves to method class()
        counter();//compiler moves to method counter()
      
    }

    public void counter()
    {
        counterRight right=new counterRight();//gets the value of object counterRight() to the object right
        counterLeft left=new counterLeft();//gets the value of counterLeft() to the object left
        addObject(right,350,40);//adds object right at (350,40)
        addObject(left,250,40);//adds object left at (250,40)
    }
  

    public void wall()
    {
        for(int a=0;a<300;a+=30)//initialises value of integer a to 0, keeps loop going while value of a is less than 300 and increses the value of a by 30 in each loop
        {
            addObject(new wallLeft(),a,0);//adds object wallLeft() at (a,0)
            addObject(new wallLeft(),a,400);//adds object wallLeft at (a,400)
        }
        for(int b=300;b<=600;b+=30)//initialises value of integer b to 300, keeps loop going while value of a is less than 600 and increses the value of a by 30 in each loop
        
        {
            addObject(new wallRight(),b,0);//adds object wallRight at (b,0)
            addObject(new wallRight(),b,400);//adds object wallRight at (b,400)
        }
        for(int c=0;c<=400;c+=15)//initialises value of integer c to 0, keeps loop going while value of a is less than 400 and increses the value of a by 15 in each loop
        
        {
            addObject(new wallLeft(),0,c);//adds object wallLeft at (0,c)
            addObject(new wallRight(),600,c);//adds object wallRight at (600,c)
        }
    }

    
    
}
