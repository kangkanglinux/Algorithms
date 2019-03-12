package capter1;

public class Simple {
	
	/**
	 * 绝对值
	 * @param x
	 * @return
	 */
	public static int abs(int x) {
		if(x < 0) return -x;
		else      return x;
	}
	/**
	 * 浮点数绝对值
	 * @param x
	 * @return
	 */
	public static double abs(double x) {
		if(x < 0.0)  return -x;
		else         return x;
	}
	/**
	 * 判断素数
	 * @param N
	 * @return
	 */
	public static boolean isPrime(int N) {
		if(N < 2) return false;
		for(int i = 2; i * i <= N; ++i)
			if(N % i == 0) return false;
		return true;
	}
	/**
	 * 牛顿迭代法
	 * @param c
	 * @return
	 */
	public static double sqrt(double c) {
		if(c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t - c/t) > err * t) {
			t = (c/t + t) / 2.0;
			System.out.println(t);
		}
		return t;
	}
	/**
	 * 三角形斜边
	 * @param a
	 * @param b
	 * @return
	 */
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}
	/**
	 * 计算调和级数
	 * @param N
	 * @return
	 */
	public static double H(int N) {
		double sum = 0.0;
		for(int i = 1; i <= N; ++i)
			sum += 1.0 / i;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(12.0));
	}

}
