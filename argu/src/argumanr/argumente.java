package argumanr;
import java.io.FileWriter;
import java.io.IOException;

public class argumente {
	
	public static void main(String[] args) {
		try {
		FileWriter writer = null;
		writer = new FileWriter(args[0]);
			writer.write(args[1]);
			writer.close();
	}
		catch (IOException e) {
			System.out.println("Da ist etwas schief gelaufen.");
		}
}
}