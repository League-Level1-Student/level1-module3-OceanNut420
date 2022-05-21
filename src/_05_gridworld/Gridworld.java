package _05_gridworld;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		Location loc = new Location(2,2);
		Location loog = new Location(x,y);
		Location looog = new Location(x,y-1);
		Location loooog = new Location(x,y+1);
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug boog = new Bug();
		Flower fl = new Flower();
		Flower flo = new Flower();
		boog.setColor(java.awt.Color.blue);
		boog.turn();
		boog.turn();
		world.add(loc, bug);
		world.add(loog, boog);
		//world.add(looog, fl);
		//world.add(loooog, flo);
		
		int xx = 0;
		int yy = 0;
		for(int i=0;i<100;i++) {
			Flower flow = new Flower();
			Location loca = new Location(xx,yy);
			if(xx == 2 && yy == 2 || xx == x && yy == y) {
				xx = xx + 1;
			}
			world.add(loca, flow);
			xx = xx + 1;
			if(xx>=10) {
				yy = yy + 1;
				xx = 0;
			}
		}
		
		
				
	}
		
}
