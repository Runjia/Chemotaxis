import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] number;

public void setup()   
{     
	//initialize bacteria variables here
	size(500,500);
	number=new Bacteria[1000];
	for (int i=0; i<number.length; i++){
		number[i]=new Bacteria();
	}

}   
public void draw()   
{    
	background(0);
 	//move and show the bacteria
 	for (int i=0; i<number.length; i++){
 		number[i].move();
 		number[i].show();
 	}  
}  
class Bacteria    
{     
	//lots of java!
	int myX,myY;
	int Bcolor1=(int)(Math.random()*255);
	int Bcolor2=(int)(Math.random()*255);
	int Bcolor3=(int)(Math.random()*255);
	Bacteria(){
		myX=(int)(Math.random()*500);
		myY=(int)(Math.random()*500);
	}

	public void move(){
		myX=myX+(int)(Math.random()*6-3);
		myY=myY+(int)(Math.random()*6-3);
	}    
	public void show(){
		fill(Bcolor1,Bcolor2,Bcolor3);
		ellipse(myX,myY,10,10);

	}
}    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
