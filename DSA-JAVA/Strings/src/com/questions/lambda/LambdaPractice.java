package com.questions.lambda;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
interface Something<T,S,R>{
	R runMf(T t,S s);
}


@FunctionalInterface
interface Something2{
	int runMf(int a, int b);
}




public class LambdaPractice {

	public static void main(String[] args) {
//		Something<Integer,Integer,Integer> s = (b,a) -> a+b;
//		System.out.println(s.runMf(1, 1));
//		Consumer<String> ja = a -> { System.out.println(a);};
//		ja.accept("loda");
//		BiConsumer<String,Integer> jha2 = (a,b )-> { System.out.println(a.length() + b);};
//		jha2.accept("loda",2);
//		
//		Something2 ssa = (b,a) -> a-b;
//		System.out.println(ssa.runMf(10, 10));
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(43);
		list.add(134);
		list.add(1);
		list.add(012);
		System.out.println(list);

//		 Optional<Integer> opt2 =  list.stream().filter(x-> x%2==0).findFirst();
//		 System.out.println(opt2.get());
//		Collections.sort(list,(a,b)->b.compareTo(a));
//		System.out.println(list);
		
//		 List<Integer> evenNums =  list.stream().sorted((a,b)->b.compareTo(a)).filter(x-> x%2==0).collect(Collectors.toList());
//		 evenNums.add(11);
//		 System.out.println(evenNums);
		int[] arr = new int[] {1,2,4,5,6,7,8,8};
// 		List<Integer> listing  = Arrays.stream(arr).boxed().collect(Collectors.toList());

 		List<Integer> listing  = Arrays.asList(1,2,3,4,5,6).stream().collect(Collectors.toList());
		listing.add(100);
		System.out.println(listing);
		 
//		 Optional<Integer> opts = list.stream().filter(x->x%10==0).reduce((a,b)->a+b);
//		 System.out.println(opts.get());
	}

}
