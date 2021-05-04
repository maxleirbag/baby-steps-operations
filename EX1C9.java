package C9;

public class EX1C9 {

	public static void main(String[] args) {
		double serieb = 0;

		for (int i = 0; i <= 36; i++) {

			serieb += (double) ((38 - i) * (37 - i)) / (i + 1);
			//System.out.println(serieb);
		}

		System.out.println("Série = " + serieb);
	}
}
