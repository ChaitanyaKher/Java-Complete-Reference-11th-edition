import java.util.Random;

public class HandleError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		Random random = new Random();
		
		for(int i=0;i<32000;i++) {
			try {
				b=random.nextInt();
				c=random.nextInt();
				a=12345/(b/c);
				System.out.println("No error");
				System.out.println();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: "+e);
			}catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Error: "+e);
				System.out.println("Division by zero.");
				a=0; // set to zero and continue
				System.out.println();
			}
			System.out.println("a: "+a);
			System.out.println();
		}
	}

}
