package finalsPractice;

import java.util.Iterator;

import acm.program.ConsoleProgram;

public class SchoolTst extends ConsoleProgram {
	
	public void run() {
		School school = new School();
		school.addTeacher("mari");
		school.addTeacher("nino");
		school.addTeacher("dato");
		school.addTeacher("luka");

		school.addSubject("mari", "cs");
		school.addSubject("mari", "math");
		school.addSubject("nino", "physics");	
		school.addSubject("dato", "algo");
		
		
		school.addPupil("ana", "cs");
		school.addPupil("ana", "physics");
		school.addPupil("salo", "cs");
		school.addPupil("sofo", "pe");
		school.addPupil("irakli", "algo");
		school.addPupil("irakli", "cs");
		school.addPupil("bejani", "algo");

		Iterator<String> pup = school.getPupils("mari");
		println("\nTest 1: Pupils of: mari");
		println("EXPECTED: salo, ana, irakli");
		print("ACTUAL: ");
		printIteratorElems(pup);

		println("\nTest 2: Teachers of: ana");
		println("EXPECTED: mari, nino");
		print("ACTUAL: ");
		Iterator<String> t = school.getTeachers("ana");
		printIteratorElems(t);

		println("removing mari");
		school.removeTeacher("mari");
		
		println("\nTest 3: Teachers of: ana");
		println("EXPECTED: nino");
		print("ACTUAL: ");
		t = school.getTeachers("ana");
		printIteratorElems(t);
		
		println("\nTest 4: Teachers of: irakli");
		println("EXPECTED: dato");
		print("ACTUAL: ");
		t = school.getTeachers("irakli");
		printIteratorElems(t);
		

	}
	
	private void printIteratorElems(Iterator<String> it) {
		if (it == null) {
			println("null");
		} else {
			while (it.hasNext()) {
				print(it.next() + ", ");
			}
			println();
		}
	}
}