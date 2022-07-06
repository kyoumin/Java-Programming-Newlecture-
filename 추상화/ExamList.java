package part3.ex5.추상화;

import java.util.Scanner;

public class ExamList {

	Exam[] exams;
	int current;
	
	
	public Exam get(int i) {
		// TODO Auto-generated method stub
		return this.exams[i];
	}


	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			
			//1.크기가 5개 정도더큰 새로운 배열
			Exam[] temp = new Exam[size+5];
			
			//2값 이주시키기
			for(int i=0;i<size; i++) {
				
				temp[i] = exams[i];
				
			}
			//3. list.exams가 새로만든 temp배열을 참조할수있도록
			this.exams = temp;
			
			
			
		}
		
		
		this.exams[this.current] = exam;
		this.current++;
	System.out.println("────────────────────────");
	}


	public ExamList() {
		this.exams = new Exam[3];
		this.current = 0;
	 }


	public int size() {
		
		return current;
	}
		
}
