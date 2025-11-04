 // Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
			String name2=args[1];
			String name3=args[2];
			int sum=Integer.parseInt(args[3]);
			double bill=sum;
			bill=Math.ceil(bill/3.0);
			System.out.println("Dear "+ name3+", "+name2+", and "+name1+": Pay "+bill+" Shekels each.");

			//new rhing
	    // Replace this comment with the rest of your code   
	}
}
