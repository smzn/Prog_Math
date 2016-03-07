package math;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Math_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression e = new ExpressionBuilder("1 / 2 * (x1 -x2^2)^2 + 1 / 4 * (x2 - 2)^4")
		        .variables("x1", "x2")
		        .build()
		        .setVariable("x1", 1.4693877551020404)
		        .setVariable("x2", 1.3061224489795917);
		double result = e.evaluate();
		System.out.println(result);
	}

}
