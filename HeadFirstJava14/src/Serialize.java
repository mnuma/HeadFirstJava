import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Serialize {

	public static void main(String[] args) {

		try {

			byte data[] = "はじめてのJava入門".getBytes();
			FileOutputStream fo = new FileOutputStream("aaa.txt");

			 for(int i = 0; i < data.length; i++){
				 fo.write(data[i]);
			 }

			 fo.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
