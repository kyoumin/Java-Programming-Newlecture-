package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamConsole list = new ExamConsole();
		
		//list.init();
		
		
		Exam[] exams = new Exam[3];
//		exams[0] = new Exam();
		int current = 0;
		
		boolean keepLoop = true;
		int menu;
		
		while(keepLoop)
		{
			menu = inputMenu();
			
			switch(menu)
			{
			case 1:
				
				list.inputList(); 
				break;
				
			case 2:
				
				//ExamList.printList(list);
				list.printList();
				break;
				
			case 3:
				System.out.println("Bye~~");
				
				keepLoop = false;
				break;
				
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
			}
		}
}

	

	 static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������������������������������������");
		System.out.println("��     ���� �޴�            ��");
		System.out.println("����������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();
		return menu;
	}
}
