//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AlienHorde
{
	private List<Alien> aliens;
	private boolean moveAble = true;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int x = 30;
		int y = 10;
		for(int i = 0; i <=size; i++) {
			if(x > 760) {
				x = 30;
				y+= 60;
			}
			aliens.add(new Alien(x,y,40,40,2));
			x+= 70;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien: aliens) {
			alien.draw(window);
		}
			
	}

	public void moveEmAll()
	{
	if(moveAble) {
		moveAble = false;
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				moveAble = true;
				timer.cancel();
			}
		},300);
			
		}
	}

	public void removeDeadOnes(Bullets bullet)
	{
		List<Alien> dead = new ArrayList<Alien>();
		List<Ammo> toKill = new ArrayList<Ammo>();
		for(Alien a : aliens) {
			for(Ammo ammo : bullet.getList()) {
				if((ammo.getX() >= a.getX() && ammo.getX() <= a.getX()+a.getWidth()
				&& ammo.getY()<= a.getY() + a.getHeight()-10)) {
					dead.add(a);
					toKill.add(ammo);
				}
			}
		}
		bullet.removeAll(toKill);
		aliens.removeAll(dead);
	}

	public String toString()
	{
		return "";
	}
}
