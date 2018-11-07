public class Customer{
	public static void main(String[] args){
		System.out.println("\nCustomer.main() execution is started");
		Flipkart coolpadFlipkart = new Flipkart();
		Mobile mob = coolpadFlipkart.buy();
		Courier kCourier = new Courier();
		kCourier.setDelivery(mob);
		mob.setPrice(10000);
		mob.display();
		System.out.println("\n"+mob.getOwnerName()+"performing mobile operations");
		mob.start();
		mob.call();
		mob.lock();
		System.out.println("\nCustomer.main() execution is completed");
	}
}
