import greenfoot.*; 


public class baby4 extends Actor
{
    
    public void act() 
    {
     int p=getX();//initialises the value of integer p to X coordinate of the actor
     int q=getY();//initialises the value of integer q to Y coordinate of the actor
     int h=ball1.x;//initialises the value of integer h to global variable x from ball1 class
     int k=ball1.y;//initialises the value of integer k to global variable y from ball1 class
       
       if(k<q)//only executes code if k is smaller than q
        {
            q=q-3;//decreases value of q by 3 units
            setLocation(p,q);//sets location of actor at (p,q) coordinates
        }
        
        if(k>q)//only executes code if k is greater than q
        {
            q+=3;//increases value of q by 3 units
            setLocation(p,q);//sets location of actor at (p,q) coordinates
        }
      
    }    
}
