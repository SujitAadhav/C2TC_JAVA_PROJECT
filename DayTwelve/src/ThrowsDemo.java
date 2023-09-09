import java.io.IOException;

public class ThrowsDemo{
	
	void myMethod(int num) throws IOException, ClassNotFoundException{
		if(num==1) {
			throw new IOException("IOException Occured");
		}
		else {
			throw new ClassNotFoundException("Class Not Found Exception Occured");
		}
	}
	
	public static void main(String[] args) {
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.myMethod(2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
