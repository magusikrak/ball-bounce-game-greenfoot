import greenfoot.*;  

public class counterLeft extends Actor
{
   
    public void act() 
    {
       int d= ball1.c;//equalises the value of integer d to public variable c from ball1 class
       String t=Integer.toString(d);//converts integer d to string and stores it in string variable t
        if(d==5)//only execures the lines if value of d is equal to 5
       {
           ball1.b=0;//sets the value of public variable b to 0
           ball1.c=0;//sets the value of public variable c to 0
           t="a wins";//changes the text of s variable to "a wins"
        }
      GreenfootImage img = new GreenfootImage(t,40,Color.PINK,Color.WHITE);//creates a greenfoot image "img" and sets it to display text from "t" variable, font size 40, text colour pink and background colour black
      setImage(img);//sets the image in the actor
    }   
}