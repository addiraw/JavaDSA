package lambda;

interface newInterface {
	int func(int param);
}

public class LambdaExpression {

	static final newInterface nI = (p) -> 2 + p;
	static newInterface nI2 = (p) -> {
		return p;
	};

	static final int paramFunction(newInterface param, int param2) {
		return param.func(param2);
	}

	public static void main(String args[]) {
		int b = 100;
//		System.out.print(nI.func(4));
		int a = paramFunction((p) -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(p++ + ++p);
			}
			return p;
		}, 3);
		a = paramFunction((p) -> p, 3);
	}

}
