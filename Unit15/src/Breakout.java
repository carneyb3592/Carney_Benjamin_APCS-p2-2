
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Brick brick;
	private Paddle leftPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore=0;
	private int speed = 2;
	private int counter = 0;
	private int prevPaddlePos;
	public Breakout()
	{
		//set up all variables related to the game
		brick = new Brick(0,0,50,50,Color.GREEN,1);
		ball = new Ball(200,200,10,10,-1,-1);
		leftPaddle = new Paddle(0,0,40,40,Color.black,speed);
		keys = new boolean[4];
		ball.setColor(Color.red);
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
	  
   }
   public void restart() {
	   brick = new Brick(0,0,50,50,Color.GREEN,1);
	   ball = new Ball(200,200,10,10,-1,-1);
		leftPaddle = new Paddle(0,0,40,40,Color.black,speed);
	   keys = new boolean[4];
	   ball.setColor(Color.red);
   
	
		
		
		
   }
   public void paint(Graphics window)
   {
	   

		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		 back = (BufferedImage)(createImage(getWidth(),getHeight()));
		//take a snap shot of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.drawString("Left Score: " + leftScore, 10, 10);
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);

		//see if ball hits left wall or right wall or up and down wall
		if(!(ball.getX()>=10 && ball.getX()<=780)){
			if(ball.getX()<= 0) {
				
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(ball.getX() >= 760) {
				ball.setXSpeed(-ball.getXSpeed());
				
				
			}
			
		}
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<= 550)){
			ball.setYSpeed(-ball.getYSpeed());
			//restart();
			
		}
	//see if the ball hits the right side
		if(ball.getX() == leftPaddle.getX() + leftPaddle.getWidth() && 
				((leftPaddle.getY() <= ball.getY()) && 
				(ball.getY() <= leftPaddle.getY() 
				+ leftPaddle.getHeight())))
		{
			ball.setX(ball.getX() + ball.getWidth());
			ball.setXSpeed(-ball.getXSpeed());
		}
		//see if the ball hits the left side
		if (ball.getX() + ball.getWidth()== leftPaddle.getX()  && 
				((leftPaddle.getY() <= ball.getY()) && 
						(ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())))
	        {
			ball.setX(ball.getX() - ball.getWidth());	
			ball.setXSpeed(-ball.getXSpeed());
	        	/**System.out.println(true);
	        	System.out.println(leftPaddle.getX() - leftPaddle.getWidth() );
	        	System.out.println(leftPaddle.getX());
	        	System.out.println(ball.getX());*/
	        	
	        }
		//see if ball hits bottom
		if(ball.getY() == leftPaddle.getY() + leftPaddle.getHeight() && 
				((leftPaddle.getX() <= ball.getX()) && 
				(ball.getX() <= leftPaddle.getX() 
				+ leftPaddle.getWidth())))
		{
			ball.setY(ball.getY() + ball.getHeight());
			ball.setYSpeed(-ball.getYSpeed());
		}
		//see if ball hits top
		if ((ball.getY()  + ball.getHeight() == leftPaddle.getY()) && 
				((leftPaddle.getX() <= ball.getX()) && 
						(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth())))
	        {
	        	ball.setY(ball.getY() - ball.getHeight());	
				ball.setYSpeed(-ball.getYSpeed());
	        	//System.out.println(true);

	        }
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			leftPaddle.moveDownAndDraw(window);
		}
		if(keys[1] == true)
		{
			leftPaddle.moveUpAndDraw(window);

		}
		if(keys[2] == true)
		{
			leftPaddle.moveLeftAndDraw(window);
		}
		if(keys[3] == true)
		{
			leftPaddle.moveRightAndDraw(window);
		}

		twoDGraph.drawImage(back, null, 0, 0);
		prevPaddlePos = leftPaddle.getX();
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
		case 'W' : keys[0]=false; break;
		case 'S' : keys[1]=false; break;
		case 'A' : keys[2]=false; break;
		case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}