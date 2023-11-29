import java.util.*;
import java.util.stream.*;

class ConvertListIntoHashMap 
{
	public static void main(String[] args) 
	{
		List<Student> studentList = Arrays.asList( new Student("Ram",35), new Student("Sham",76), new Student("Mohan",53));

		// Convert List to Map Using Lambda
		HashMap<String,Integer> studentMap1 = new HashMap<String,Integer>();
		studentList.forEach(value -> studentMap1.put(value.getStudentName(),value.getMarks()));

		System.out.println("Lambda Map: "+studentMap1);

		// Convert List to Map Using Method Reference
		Map<String,Integer> studentMap2 = new HashMap<String,Integer>();
		studentList.forEach(student -> student.updateStudentMap(studentMap2));
		//studentList.forEach(Student::updateStudentMap);
		System.out.println("Method Reference Map: "+studentMap2);

		// Convert Map to Stream
		// 1st Way
		Stream<Map.Entry<String,Integer>> stream1 = studentMap2.entrySet().stream(); //Map.entrySet() method which returns a Set view of the mappings contained in this map.
		System.out.println(Arrays.toString(stream1.toArray()));
		// 2nd Way
		Stream<String> stream2 = studentMap2.keySet().stream(); //  returns a Set view of the keys contained in this map
		System.out.println(Arrays.toString(stream2.toArray()));
		Stream<Integer> stream3 = studentMap2.values().stream(); // returns a Set view of the values contained in this map
		System.out.println(Arrays.toString(stream3.toArray()));

	}
}

class Student
{
	private String studentName;
	private int marks;

	public Student(String name, int marks){
		this.studentName = name;
		this.marks = marks;
	}

	public String getStudentName(){
		return studentName;
	}

	public int getMarks(){
		return marks;
	}

	public void updateStudentMap(Map<String, Integer> studentMap){
		studentMap.put(studentName,marks);
	}
}
