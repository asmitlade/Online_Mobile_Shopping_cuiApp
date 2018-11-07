import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Mobile{
	private static String brand;
	private String modelNo;
	private int productId;
	private String mColor;
	private String ownerName;
	private double price;
	private String delivery;
	private static int count;
	static{
		try{
			Scanner sc = new Scanner(new File("mobdetails.txt"));
			brand = sc.nextLine();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	{ count ++;	}
	Mobile(String modelNo, String mColor){
		if(brand == null){
			throw new RuntimeException("Brand is not initialized");
		}
		this.modelNo = modelNo;
		this.mColor = mColor;
	}
	public String getModelNo(){
		return this.modelNo;
	}
	public String getMColor(){
		return this.mColor;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	public String getOwnerName(){
		return this.ownerName;
	}
	public void setDelivery(String delivery){
		this.delivery = delivery;
	}
	public int getCount(){
		return count;
	}
	public void start(){
		System.out.println(this.ownerName + " Started "+ this.brand);
	}
	public void call(){
		System.out.println(this.ownerName+"is Calling from"+this.brand);
	}
	public void lock(){
		System.out.print(this.ownerName+" locked screen of"+this.brand);
	}
	public void display(){
		System.out.println("Owner Name :"+this.ownerName);
		System.out.println("Brand :"+this.brand);
		System.out.println("Model No. :"+this.modelNo);
		System.out.println("Color :"+this.mColor);
		System.out.println("Price :"+this.price);
		System.out.println("Delivery :"+this.delivery);
	}
}