package com.practice.som.java8.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapBasics {

	public static void main(String[] args) {
		
		List<String> courses1 = List.of("Spring", "Spring Boot", "API" , "Microservices",
				"AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices",
				"AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		
		// Converting to a Stream of String[]
		List<String[]> list1 = courses1.stream().map(c->c.split("")).collect(Collectors.toList());
		System.out.println(list1);
		/* O/P-> [[Ljava.lang.String;@6b884d57, [Ljava.lang.String;@38af3868, [Ljava.lang.String;@77459877, 
		 * [Ljava.lang.String;@5b2133b1, [Ljava.lang.String;@72ea2f77, [Ljava.lang.String;@33c7353a, 
		 * [Ljava.lang.String;@681a9515, [Ljava.lang.String;@3af49f1c, [Ljava.lang.String;@19469ea2]*/
		
		
		// To convert Stream of String[] to Stream of characters need to flatten
		List<String> list2= courses1.stream().map(c->c.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
		System.out.println(list2);
		/* O/P-> [S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, 
		 * W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]*/
		
		
		// To display unique characters only
		List<String> list3 = courses1.stream().map(c->c.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		System.out.println(list3);
		/*  O/P-> [S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b]*/
		
		
		// To display in the format [[courses1[i]][courses2[j]]]
		List<List<String>> list4 = courses1.stream()
				.flatMap(c-> courses2.stream()
				.map(c2->List.of(c,c2)))
				.collect(Collectors.toList());
		System.out.println(list4);
		/* O/P-> [[Spring, Spring], [Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], 
		 * [Spring, PCF], [Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], 
		 * [Spring Boot, Spring Boot], [Spring Boot, API], [Spring Boot, Microservices], [Spring Boot, AWS], 
		 * [Spring Boot, PCF], [Spring Boot, Azure], [Spring Boot, Docker], [Spring Boot, Kubernetes], [API, Spring], 
		 * [API, Spring Boot], [API, API], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker], 
		 * [API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], [Microservices, API], 
		 * [Microservices, Microservices], [Microservices, AWS], [Microservices, PCF], [Microservices, Azure], 
		 * [Microservices, Docker], [Microservices, Kubernetes], [AWS, Spring], [AWS, Spring Boot], [AWS, API], 
		 * [AWS, Microservices], [AWS, AWS], [AWS, PCF], [AWS, Azure], [AWS, Docker], [AWS, Kubernetes], [PCF, Spring], 
		 * [PCF, Spring Boot], [PCF, API], [PCF, Microservices], [PCF, AWS], [PCF, PCF], [PCF, Azure], [PCF, Docker], 
		 * [PCF, Kubernetes], [Azure, Spring], [Azure, Spring Boot], [Azure, API], [Azure, Microservices], [Azure, AWS],
		 *  [Azure, PCF], [Azure, Azure], [Azure, Docker], [Azure, Kubernetes], [Docker, Spring], [Docker, Spring Boot], 
		 *  [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Docker], 
		 *  [Docker, Kubernetes], [Kubernetes, Spring], [Kubernetes, Spring Boot], [Kubernetes, API], 
		 *  [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker], 
		 *  [Kubernetes, Kubernetes]]*/
		
		
		// To display the the List where both the elements are not same
		List<List<String>> list5 = courses1.stream().flatMap(c-> courses2.stream()
				.map(c2->List.of(c,c2)))
				.filter(f-> !f.get(0).equals(f.get(1)))
				.collect(Collectors.toList());
		System.out.println(list5);
		/* O/P-> [[Spring, Spring Boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], 
		 * [Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring Boot, Spring], [Spring Boot, API], 
		 * [Spring Boot, Microservices], [Spring Boot, AWS], [Spring Boot, PCF], [Spring Boot, Azure], [Spring Boot, Docker], 
		 * [Spring Boot, Kubernetes], [API, Spring], [API, Spring Boot], [API, Microservices], [API, AWS], [API, PCF], 
		 * [API, Azure], [API, Docker], [API, Kubernetes], [Microservices, Spring], [Microservices, Spring Boot], 
		 * [Microservices, API], [Microservices, AWS], [Microservices, PCF], [Microservices, Azure], [Microservices, Docker], 
		 * [Microservices, Kubernetes], [AWS, Spring], [AWS, Spring Boot], [AWS, API], [AWS, Microservices], [AWS, PCF], 
		 * [AWS, Azure], [AWS, Docker], [AWS, Kubernetes], [PCF, Spring], [PCF, Spring Boot], [PCF, API], 
		 * [PCF, Microservices], [PCF, AWS], [PCF, Azure], [PCF, Docker], [PCF, Kubernetes], [Azure, Spring], 
		 * [Azure, Spring Boot], [Azure, API], [Azure, Microservices], [Azure, AWS], [Azure, PCF], [Azure, Docker], 
		 * [Azure, Kubernetes], [Docker, Spring], [Docker, Spring Boot], [Docker, API], [Docker, Microservices], 
		 * [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Kubernetes], [Kubernetes, Spring], 
		 * [Kubernetes, Spring Boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], 
		 * [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker]]*/
		
		
		// To display the the List where both the elements are not same but are of same length
		List<List<String>> list6 = courses1.stream().flatMap(c-> courses2.stream()
				.filter(c1->c1.length()==c.length())
				.map(c2->List.of(c,c2)))
				.filter(f-> !f.get(0).equals(f.get(1)))
				.collect(Collectors.toList());
		System.out.println(list6);
		/* O/P-> [[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], 
		 * [PCF, AWS], [Docker, Spring]]*/

		
	}

}
