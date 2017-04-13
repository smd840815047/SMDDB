import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class File {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("d:/a.txt");
			FileOutputStream fos = new FileOutputStream("d:/b.txt");
			byte [] buf = new byte[1024];
			int len = 0;
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


