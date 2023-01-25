package QuizApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.logic();

	}

}

class Quiz{
	Scanner sc=new Scanner(System.in);
	int cansCount=0;
	int wansCount=0;
	
	
	public void logic() {
		Questions q1=new Questions("Which component is used to compile, debug and execute the java programs?","a) JRE","b) JIT","c) JDK","d) JVM");
		Questions q2=new Questions("Which one of the following is not a Java feature?","a) Object-oriented","b) Use of pointers","c) Portable","d) Dynamic and Extensible");
		Questions q3=new Questions("Which of these cannot be used for a variable name in Java?","a) identifier & keyword","b) identifier","c) keyword","d) none of the mentioned");
		Questions q4=new Questions("What is the extension of java code files?","a) .js","b) .txt","c) .class","d) .java");
		
		Map<Questions, Character> hmap=new HashMap<>();
		hmap.put(q1, 'c');
		hmap.put(q2, 'b');
		hmap.put(q3, 'c');
		hmap.put(q4, 'd');
		
		for(Map.Entry<Questions, Character> map:hmap.entrySet()) {
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			
			System.out.println("Enter your answer: ");
			Character ans=sc.next().charAt(0);
			
			int cans=Character.compare(ans, map.getValue());
			if(cans==0) {
				System.out.println("Correct");
				System.out.println();
				cansCount++;
			}
			else {
				System.out.println("Wrong");
				System.out.println();
				wansCount++;
			}
			
		}
		
		System.out.println("-----Result-----");
		System.out.println("Total no. of questions: "+hmap.size());
		System.out.println("Correct answers: "+cansCount);
		System.out.println("Wrong answers: "+wansCount);
		int percentage=(100*cansCount)/hmap.size();
		System.out.println("Percentage: "+percentage);
		
		if(percentage>=95) {
			System.out.println("Performance: VERY GOOD");
		}
		else if(percentage<=35) {
			System.out.println("Performance: VERY LOW");
		}
		else {
			System.out.println("Performance: MEDIUM");
		}		
	}
}
