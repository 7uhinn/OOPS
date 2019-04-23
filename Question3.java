import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Iterator;

class Student {
	String roll;
	String marks;
	String name;

	Student(String r, String m, String n) {
		this.roll = r;
		this.marks = m;
		this.name = n;
	}
}

class Teacher {
	String id;
	String dept;
	String name;

	Teacher(String i, String d, String n) {
		this.id = i;
		this.dept = d;
		this.name = n;
	}
}

public class Question3 {
	public static void main(String[] args) throws Exception {
		ArrayList<Student> s_list = new ArrayList<Student>();
		ArrayList<Teacher> t_list = new ArrayList<Teacher>();
		ArrayList<Teacher> pt_list = new ArrayList<Teacher>();

		Scanner take = new Scanner(System.in);
		System.out.println("enter the no of student details in the input file: ");
		int n, m;
		n = take.nextInt();
		System.out.println("enter the no of teacher details in the input file: ");
		m = take.nextInt();

		// FileReader fr =new FileReader("file.txt");
		Scanner scanner = new Scanner(new File("assets/file.txt"));
		int i, count = 0, x = 1;

		while ((scanner.hasNextLine())) {
			String na = "", dep = "", rol = "", mak = "", id = "";
			String line = scanner.nextLine();
			if (count < n) {

				if (x % 3 == 1) {
					rol = line;
				}
				if (x % 3 == 2) {
					mak = line;
				}
				if (x % 3 == 0) {
					na = line;
					s_list.add(new Student(rol, mak, na));

					rol = "";
					mak = "";
					na = "";
				}
				x += 1;
			}
			if (count >= n) {
				if (x % 3 == 1) {
					id = line;
				}
				if (x % 3 == 2) {
					dep = line;
				}
				if (x % 3 == 0) {
					na = line;
					if (dep == "OOPS" || dep == "MATH") {
						System.out.println("Name: " + na + "Department: " + dep + "ID: " + id);
						pt_list.add(new Teacher(id, dep, na));
					} else {
						t_list.add(new Teacher(id, dep, na));
					}
					id = "";
					dep = "";
					na = "";
				}
				x += 1;

			}

			count += 1;

			Scanner scaner = new Scanner(new File("assets/file.txt"));
     while(scaner.hasNextLine()){
	
	String a=scaner.nextLine();     	
	System.out.println(a);		
	}

		}
	}
}
