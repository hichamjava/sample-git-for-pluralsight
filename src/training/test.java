package training;

public class test {

	public static void main(String[] args) {
		String s = "2020.0";
		
		if (s.split("\\.").length > 1) {
			System.out.println(s.split("\\.")[0]);
		}
		
		System.out.println("test");

	}

	@Override
	public String toString() {
		return "test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
