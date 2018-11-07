import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Courier{
	private static long deliveryNumSeq;
	static{
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("deliveryNumSeq.txt"));
			deliveryNumSeq = dis.readLong();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	public void setDelivery(Mobile mob){
		mob.setDelivery("Del123yes"+ ++deliveryNumSeq);
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("deliveryNumSeq.txt"));
			dos.writeLong(deliveryNumSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}