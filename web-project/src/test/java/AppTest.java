import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;


public class AppTest {
	
	static Logger logger = Logger.getLogger(AppTest.class);
	
	public static void main(String[] args) {
		String path = "\\Oracle\\Middleware\\user_projects\\domains\\cayte_dev_domain\\";
		File file = new File(path + "file: holamundo.txt");
		File file_test = new File(path + "file_test: holamundo2.txt");
		try {
			file.createNewFile();	
			logger.info("Inicia el renombrado del archivo");
			boolean result = file.renameTo(file_test);
			logger.info("File test: " + file_test.getCanonicalPath());
			logger.info("File: " + file.getCanonicalPath() + " resultado: " + result );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new AppTest().executeOperation();
		logger.info("Finaliza creacion de archivo");
	}
	
	public void displaySystemProperties(){
		Properties prop = System.getProperties();
		System.out.println(prop.getProperty("java.io.tmpdir"));
		prop.list(System.out);
	}
	
	public void executeOperation(){
		Integer result = 4*10-6/2;
		System.out.println(result);
	}

}
