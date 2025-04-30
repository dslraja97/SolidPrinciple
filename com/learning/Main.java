package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static  class Student{
		private String name;
		private String subject;
		private Integer mark;
		
		public Student(String name, String subject, Integer mark) {
			super();
			this.name = name;
			this.subject = subject;
			this.mark = mark;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public Integer getMark() {
			return mark;
		}

		public void setMark(Integer mark) {
			this.mark = mark;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", subject=" + subject + ", mark=" + mark + "]";
		}
		
		
	}
	public static void main(String[] args) {
		Student s1=new Student("Harish","Maths",76);
		Student s2=new Student("Sai", "Maths", 85);
		Student s3=new Student("Ali", "Science", 75);
		Student s4=new Student("zaheer", "Science", 86);
		List<Student> studList=new ArrayList<Student>();
		studList.add(s4);
		studList.add(s3);
		studList.add(s2);
		studList.add(s1);
		Map<String, Integer> markMap = studList.stream().collect(Collectors.groupingBy(Student::getSubject,Collectors.summingInt(Student::getMark)));
		
		markMap.forEach((sub,mar)->{
			System.out.println(sub+":"+mar);
		});
	}

}
