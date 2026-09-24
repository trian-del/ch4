
public class  Multadd {
	
	public static void main(String[] args) {
		multadd(Math.sin(Math.PI/4), 1, (Math.cos(Math.PI/4)/2));
	}
	
	public static double multadd(double a, double b, double c) {
		return a*b+c;
	}
	
	public static double expSum(double x) {
		return multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
	}
}
