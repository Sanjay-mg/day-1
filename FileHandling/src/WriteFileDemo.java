import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileDemo {
	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		Writer out;
		try {
			out = new FileWriter("output.txt");
			BufferedWriter bufferedwriter = new BufferedWriter(out);
			bufferedwriter.write("Writing into file");
			bufferedwriter.write("Writing into file again");
			bufferedwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
