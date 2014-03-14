import java.util.ArrayList;

public class array{


	public static void main(String[] args) {
		
		String[] names = new String[] {"james", "Michael", "matt", "tim", "bill"};

		ArrayList<Strings> students = new ArrayList<Strings>();

		students.add("Leonardo");
		students.add("Rafael");
		students.add("Michaelangelo");
		students.add("Donatello");

		students.set(1, "Rafael");

		System.out.println(students.get(3));

		students.remove(2);

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		for (String s : students) {
			System.out.println(s);
		}


	}




}
