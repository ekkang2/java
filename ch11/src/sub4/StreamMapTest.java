package sub4;
/*
 * 날짜 : 2024/07/23
 * 이름 : 강은경
 * 내용 : 자바 컬렉션 스트림 맵 실습하기 
 * 
 */

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class StreamMapTest {

	public static void main(String[] args) {
		
		// Person 리스트 생성
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 21));
		people.add(new Person("장보고", 33));
		people.add(new Person("강감찬", 43));
		people.add(new Person("이순신", 53));
		
		// map 스트림
		List<String> names = people.stream()
							       .map((person) -> {
							    	  return person.getName();	// 새로운 데이터 변환해서 당므 스트림으로 전달
							       })
							       .collect(Collectors.toList());	// 스트림으로 전송된 데이터 취합해 컬렉션으로 반환
		
		System.out.println(names);
		
		// flatMap 스트림
		List<List<String>> lists = List.of( // 리스트 생성
										Arrays.asList("apple", "banana"),
										Arrays.asList("cherry", "grape"),
										Arrays.asList("orange", "mango")
									);
					
		System.out.println(lists);
		
		//2차원에서 1차원 
		List<String> fruits = lists.stream()
				                   .flatMap((list)->{
				                	   return list.stream();
				                   })
				                   .collect(Collectors.toList());
		
		System.out.println(fruits);
	}
}
