import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StreamTestSeryarize {

	public static void main(String[] args) {

		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\tmp\\obj.bin"));
			Employee emp = new Employee("testman", "testman@example.com");

			objectOutputStream.writeObject(emp);
			objectOutputStream.close();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
