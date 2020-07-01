import greenfoot.*;  

public class counterRight extends Actor
{
    
    public void act() 
    {
       int c= ball1.b; //equalises the value of integer c to public variable b from ball1 class
       String s=Integer.toString(c);//converts integer c to string and stores it in string variable s
       if(c==5)
       {
           ball1.c=0;//sets the value of public variable c to 0
           ball1.b=0;//sets the value of public variable b to 0
           s="b wins";//changes the text of s variable to "b wins"
        }
      GreenfootImage da = new GreenfootImage(s,40,Color.BLACK,Color.WHITE);//creates a greenfoot image "img" and sets it to display text from "s" variable, font size 40, t
     setImage(da);//sets the image in the actor
    }    
}
