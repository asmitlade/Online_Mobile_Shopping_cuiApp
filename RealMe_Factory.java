import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RealMe_Factory{
	private static long productIdSeq;
	static{
		try{
			DataInputStream dis = new DataInputStream(new FileInputStream("productIdSeq.txt"));
			productIdSeq = dis.readLong();
			dis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	Mobile[] getMobs(int noOfMobs){
		Mobile[] mobs = new Mobile[noOfMobs];
		for(int index = 0; index < noOfMobs; index++){
			String productId = "ABC123PQ"+ ++productIdSeq;
			String color;
			if((productIdSeq%2)== 0){
				color = "RED";
			}
			else{
				color = "YELLOW";
			}
			mobs[index] = new Mobile(productId, color);
		}
		try{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("productIdSeq.txt"));
			dos.writeLong(productIdSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return mobs;
	}
}
