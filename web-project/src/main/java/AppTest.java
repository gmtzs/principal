import java.text.DateFormat;


public class AppTest {
	
	
	public static void main(String[] args) {
		
		String df = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
		System.out.println(df);
	}

}
