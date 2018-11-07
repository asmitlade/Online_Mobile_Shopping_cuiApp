import java.util.Scanner;

public class Flipkart{
	private Scanner scn;
	private RealMe_Factory coolpad; 
	private Mobile[] mobs; 
	private int index; 
	public Flipkart(){
		scn = new Scanner(System.in);
		coolpad = new RealMe_Factory();
		mobs = coolpad.getMobs(5);
		index = 0;
	}
	public Mobile buy(){
		if((mobs == null)||(index == mobs.length)){
			mobs = coolpad.getMobs(5);
		}
		Mobile mob = mobs[index];
		System.out.println("Enter Owner Name :");
		mob.setOwnerName(scn.nextLine());
		mobs[index] = null;
		index ++;
		return mob;
	}
}
