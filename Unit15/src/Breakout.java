
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int speed = 2;
	private int brickX = 3;
	private int brickY = 2;
	private int spacing= 6;
	private Color brickColor = new Color(99,99,99);
	private ArrayList<Brick> brickList;
	public Breakout()
	{
		gameInit(1);
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
	  
   }
   public void gameInit(int health) {
	   brickList = new ArrayList<Brick>();
		for(int i = 0; i < 17; i++) {
			for(int y = 0; y < 2; y++) {
				brickList.add(new Brick(brickX,brickY,40,20,brickColor,health));
				brickY += 20+spacing;
			}
			brickX += 40+spacing;
			brickY=2;
		}
		brickX = 3;
		brickY = 520;
		for(int i = 0; i < 17; i++) {
			for(int y = 0; y < 2; y++) {
				brickList.add(new Brick(brickX,brickY,40,20,brickColor,health));
				brickY += 20 + spacing;
			}
			brickX +=  40+spacing;
			brickY=520;
		}
		brickX=3;
		brickY=52;
		for(int i =0; i < 18; i++) {
			for(int y = 0; y < 2; y++) {
				brickList.add(new Brick(brickX,brickY,40,20,brickColor,health));
				brickX+= 40+spacing;
			}
			brickY+=20 + spacing;
			brickX=3;
		}
		brickX=693;
		brickY=52;
		for(int i =0; i < 18; i++) {
			for(int y = 0; y < 2; y++) {
				brickList.add(new Brick(brickX,brickY,40,20,brickColor,health));
				brickX+= 40+spacing;
			}
			brickY+=20 + spacing;
			brickX=693;
		}
		brickX = 3;
		brickY = 2;
		//set up all variables related to the game
		ball = new Ball(200,200,10,10,-1,-1);
		leftPaddle = new Paddle(0,0,40,40,Color.black,speed);
		keys = new boolean[4];
		ball.setColor(new Color(28,113,213));
   
		setBackground(Color.WHITE);
		setVisible(true);
   }
   public void restart() {
	   	gameInit(2);
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
		for(Brick i : brickList) {
			i.draw(graphToBack);
		}
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
		if(brickList.size()<=120) {
			restart();
		}
		ArrayList<Brick> remove = new ArrayList<Brick>();
			for(Brick brick : brickList) {
				if(((ball.getX() + ball.getWidth() >= brick.getX()) && (ball.getX() <= brick.getX() + brick.getWidth())) && 
						((ball.getY() + ball.getHeight() >= brick.getY() && (ball.getY() <= brick.getY() + brick.getHeight())))) {
					remove.add(brick);
					if(ball.getX() == brick.getX() + brick.getWidth() || ball.getX() + ball.getWidth() == brick.getX()) {
						ball.setXSpeed(-ball.getXSpeed());
					} else {
						ball.setYSpeed(-ball.getYSpeed());
					}
					break;
				}
			}

		for(Brick brick : remove) {
			brick.getHit();
			if(brick.checkIfDead()) {
				brickList.remove(brick);
			}
		}
		
		
		//see if the paddle hits the top or bottom wall 
		if(!(leftPaddle.getY()>=52 && leftPaddle.getY()<= 513 - leftPaddle.getHeight())){
			if(leftPaddle.getY() <=52) {
				leftPaddle.setY(52);
			}
			if(leftPaddle.getY() >=513-leftPaddle.getHeight()) {
				leftPaddle.setY(513-leftPaddle.getHeight());
			}
			//restart();
			
		}
		//see if the paddle hits left or right wall
		if(!(leftPaddle.getX()>=92 && leftPaddle.getX()<=688-leftPaddle.getWidth())){
			if(leftPaddle.getX()<= 92) {
				
				leftPaddle.setX(92);
			}
			if(leftPaddle.getX() >= 688-leftPaddle.getWidth()) {
				leftPaddle.setX(688 -leftPaddle.getWidth());
				
				
			}
			
		}
		leftPaddle.setSpeed(speed);
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=0 && ball.getY()<= 550)){
			ball.setYSpeed(-ball.getYSpeed());
			//restart();
			
		}
	//see if the ball hits the right side
		if((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()) && (ball.getX() > leftPaddle.getX()) && (ball.getY() >= leftPaddle.getY()) && (ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() - 2))
		{
			if(ball.getXSpeed() < 0) {
				ball.setXSpeed(-ball.getXSpeed());
			}
			else {
				ball.setX(ball.getX() + ball.getWidth());
			}
			
		}
		//see if the ball hits the left side
		if ((ball.getX()+ ball.getWidth() >= leftPaddle.getX()) && (ball.getX() < leftPaddle.getX() + leftPaddle.getWidth()) && (ball.getY() >= leftPaddle.getY()) && (ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() - 2))
	        {
			if(ball.getXSpeed() > 0) {
				ball.setXSpeed(-ball.getXSpeed());

			}
			else {
				ball.setX(ball.getX() - ball.getWidth());

			}
		

	        }
		//see if ball hits top of paddle
		if((ball.getY()+ ball.getHeight() >= leftPaddle.getY()) && (ball.getY() < leftPaddle.getY() + leftPaddle.getHeight()) && (ball.getX() >= leftPaddle.getX()) && (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-2))
		{
			if(ball.getYSpeed() < 0) {
				ball.setY(ball.getY() - ball.getHeight() );	

			}
			else {
				ball.setYSpeed(-ball.getYSpeed());

			}
		}
		//see if ball hits bottom of paddle
		if ((ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()) && (ball.getY() > leftPaddle.getY()) && (ball.getX() >= leftPaddle.getX()) && (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-2))
	        {
				if(ball.getYSpeed() > 0) {
					ball.setY(ball.getY() + ball.getHeight());

				}
				else {
					ball.setYSpeed(-ball.getYSpeed());

				}
				//ball.setY(leftPaddle.getY() + leftPaddle.getHeight() + ball.getHeight());	
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
   		   Thread.currentThread().sleep(2);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}