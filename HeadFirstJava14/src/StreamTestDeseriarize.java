import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class StreamTestDeseriarize {

	public static void main(String[] args) {

		try {

			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\tmp\\obj.bin"));
			Employee emp = (Employee) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println("name: " + emp.getName() + " mail: " + emp.getEmail());

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
