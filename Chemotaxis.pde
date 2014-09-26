Bacteria [] number;

void setup()   
{     
	//initialize bacteria variables here
	size(500,500);
	number=new Bacteria[1000];
	for (int i=0; i<number.length; i++){
		number[i]=new Bacteria();
	}

}   
void draw()   
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

	void move(){
		myX=myX+(int)(Math.random()*6-3);
		myY=myY+(int)(Math.random()*6-3);
	}    
	void show(){
		fill(Bcolor1,Bcolor2,Bcolor3);
		ellipse(myX,myY,10,10);

	}
}    