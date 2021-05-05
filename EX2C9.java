//git branch -m maxleirbag-EX2C9 EX2C9
//git fetch origin
//git branch -u origin/EX2C9 EX2C9

//package C9;

public class EX2C9 {

	public static void main(String[] args) {
		double serie = 0;
		for(int i = 1; i <= 100; i++) {
			serie+= (double) i / (Math.pow(i, 2) + (i-1));
		//	System.out.println(serie);
		}
		System.out.println("Série = "+serie);
	}
}
