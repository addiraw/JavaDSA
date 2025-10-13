package lambda;

interface Funct {
	String func(String param);
}

interface Funct2 {
	void func(String param);
}

public class ReferenceTo {

	static String function1(String param) {
		return param;
	}

	String function2(String param) {
		return param;
	}

	public ReferenceTo(String param) {
		System.out.println(param);
	}

	public ReferenceTo() {
		System.out.println("Reference to Constructor without param");
	}

	public static void main(String args[]) {

		Funct f = ReferenceTo::function1;
		System.out.println(f.func("calling from a reference to lmbda function"));
		ReferenceTo r = new ReferenceTo();

		Funct g = r::function2;
		System.out.println(g.func("this is new"));
		Funct2 gh = ReferenceTo::new;
//		ReferenceTo ghi = 
		gh.func("any thing");
//		ghi.function2("called aga9n");

	}
}
