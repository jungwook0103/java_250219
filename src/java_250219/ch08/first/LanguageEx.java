package java_250219.ch08.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LanguageEx {
	
	public static void main(String[] args) {
		
//		ArrayList<String> test = new ArrayList<>();
//		List<String> test = new ArrayList<>();
		List<String> test = new Vector<>();
		
		System.out.println("test.size(): " + test.size());
		
		
		test.add("Tony");
		test.add("Tiffany");
		test.add("Jeniifer");
		test.add("John");
		test.add("Tom");
		test.add("Andrew");
		test.add("Tiger");
		test.add("Selly");		
		
		System.out.println("test.size(): " + test.size());
		
		for (int i = 0; i < test.size(); ++i) {
			System.out.printf("test.get(%d): %s\n", i, test.get(i));
		}		
		
		for (String item : test) {
            System.out.println(item);
        }
		
//		test.forEach(item -> System.out.println(item));  Chatgpt가 알려준 방법
		
		
		test.remove(1);
		test.clear();
		//a.removeAll(b); // a 를 기준으로 b 와 공통된 변수 삭제
		
	}

}
