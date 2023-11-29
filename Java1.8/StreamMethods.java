import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.function.Predicate;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.*;

public class StreamMethods 
{
	public static void main(String[] args) 
	{
		List<Integer> arr1 = Arrays.asList(1,2,3,4,5,6);

		// peek() --> It's allow to perform the operation on each elements of streams without consuming stream.
		arr1.stream().peek(value -> System.out.print(value+" ")).collect(Collectors.toList());
		System.out.println("");

		// map() --> Returns a stream consisting of the results of applying the given function to the elements of this stream
		List<Integer> streamObj1 = arr1.stream().map(value -> value*2).collect(Collectors.toList());
		System.out.println(streamObj1);

		// flatMap() --> It is used to transform each element of a stream of values into zero or more elements, and then flattens these transformed elements into a single stream.
		// OR It's particularly useful when you have a stream of collections or multiple streams and you want to combine them into a single stream
		List<Integer> temp1 = Arrays.asList(1,2,3);
		List<Integer> temp2 = Arrays.asList(4,1,6,4,1);
		List<Integer> temp3 = Arrays.asList(7,2,9);
		
		// way-1
		List<List<Integer>> arr2 = Arrays.asList(temp1,temp2,temp3);
		Stream<Integer> streamObj2 = arr2.stream().flatMap(Collection::stream); // Note: Collection.stream() // convert the collection into stream Ex: temp2.stream()
		streamObj2.forEach(System.out::print);
		System.out.println("");
		// way-2
		Stream<List<Integer>> arr3 = Stream.of(temp1,temp2,temp3);
		Stream<Integer> streamObj3 = arr3.flatMap(Collection::stream);
		streamObj3.forEach(System.out::print);
		System.out.println("");

		// distinct
		Stream<Integer> streamObj4 = temp2.stream().distinct();
		streamObj4.forEach(System.out::print);
		System.out.println("");

		// count
		long streamObj5 = temp2.stream().count();
		System.out.println(streamObj5);

		// sorted
		Stream<Integer> streamObj6 = temp2.stream().sorted();
		streamObj6.forEach(System.out::print);
		System.out.println("");

		// sorted(Comparator)
		DesSort des  = new DesSort();
		Stream<Integer> streamObj7 = temp2.stream().sorted(des);
		streamObj7.forEach(System.out::print);
		System.out.println("");

		// filter
		Stream<Integer> streamObj8 = temp2.stream().sorted(Comparator.reverseOrder()).filter(value-> value%2 == 0);
		streamObj8.forEach(System.out::print);
		System.out.println("");

		// max
		Stream<Integer> number1 = Stream.of(1,3,2,4,53,12);
		Optional<Integer> max = number1.max(Integer::compare);
		if(max.isPresent()){
			System.out.println("Maximum: "+max.get());
		}else{
			System.out.println("Stream is empty");
		}

		// min
		Stream<Integer> number2 = Stream.of(1,3,2,4,53,12);
		Optional<Integer> min = number2.min(Integer::compare);
		if(min.isPresent()){
			System.out.println("Minimum: "+min.get());
		}else{
			System.out.println("Stream is empty");
		}

		// reduce
		List<Integer> number3 = Arrays.asList(1,3,2,4,53,12);
		//Stream<Integer> number3 = Stream.of(1,3,2,4,53,12);
		int sum = number3.stream().reduce(0, (a,b)-> a+b);
		System.out.println("Reduce Value: "+sum);

		// reduce with Max
		int maxValue = number3.stream().reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b);
		System.out.println("Reduce Max Value: "+maxValue);

		// reduce with Min
		int minValue = number3.stream().reduce(Integer.MAX_VALUE, (a,b)-> a<b?a:b);
		System.out.println("Reduce Min Value: "+minValue);

		// limit
		Stream<Integer> limitValue = number3.stream().limit(3);
		limitValue.forEach(value -> System.out.print(value+" "));
		System.out.println("");

		// allMatch, anyMatch, noneMatch
		Boolean matchValue = number3.stream().allMatch(value-> value>1);
		System.out.println(matchValue);

		// findAny, findFirst
		// Optional<Integer> findAnyValue = number3.stream().findAny();
		Optional<Integer> findAnyValue = number3.stream().findFirst();
		if(findAnyValue.isPresent()){
			System.out.println("Find Any: "+findAnyValue.get());
		}else{
			System.out.println("Stream is empty");
		}

		// Iterate -->  It is a way to create an infinite stream of values based on an initial value and a function that generates the next value from the previous one.
		Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
        evenNumbers.limit(10).forEach(System.out::print);
		System.out.println("");

		// Generate --> It is used to create a stream of values based on a provided supplier function. Unlike the iterate method, generate method produces values using a supplier function without the need for an initial value or recurrence
		Stream<Integer> randomIntegers = Stream.generate(() -> new Random().nextInt(100) + 1);
        randomIntegers.limit(10).forEach(System.out::print);
		System.out.println("");

		// Range --> It's allow you to generate a stream of values within a specified range of numbers.
		// Create an IntStream with values from 1 to 10 (exclusive) // exclusive means ignore last value(ex:- 10)
        IntStream rangeStream = IntStream.range(1, 10);
		rangeStream.forEach(System.out::print);
        System.out.println("");

        // Create an IntStream with values from 1 to 10 (inclusive) // include last value(ex:- 10)
        IntStream rangeClosedStream = IntStream.rangeClosed(1, 10);
		rangeClosedStream.forEach(System.out::print);
		System.out.println("");

		// forEach-> no guarentees of order in parallel stream, forEachOrdered-> It guarantees that the elements are processed in the same order in which they appear in the source stream,
		number3.stream().forEachOrdered(System.out::print);
		System.out.println("");

		// sum and mapToInt
		IntStream intStreamValue = number3.stream().mapToInt(Integer::intValue);
		int totalSum = intStreamValue.sum();
		System.out.println(totalSum);

		// Average and mapToDouble
		DoubleStream doubleStreamValue = number3.stream().mapToDouble(Integer::intValue);
		OptionalDouble averageNum = doubleStreamValue.average();
		if(averageNum.isPresent()){
			System.out.println("averageNum: "+averageNum.getAsDouble());
		}else{
			System.out.println("Stream is Empty");
		}

		///// Collect

		// Joining --> It's concatenate the elements of a stream into a single string. 
		Stream<String> word1 = Stream.of("apple", "banana", "cherry", "date");
        String result = word1.collect(Collectors.joining(", ", "Fruits: [", "]"));
        System.out.println(result);

		// Counting --> to count the number of elements in a stream
		Stream<String> word2 = Stream.of("apple", "banana", "cherry", "date");
        long count = word2.collect(Collectors.counting());
        System.out.println("Number of words: " + count);

		// Mapping --> It is used to apply a mapping function to each element in a stream and then collect the results into a collection.
		Stream<String> word3 = Stream.of("apple", "banana", "cherry", "date");
        List<Integer> wordLengths = word3.collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println("Word lengths: " + wordLengths);

		// minBy and maxBy using Collect --> 
		Stream<String> word4 = Stream.of("apple", "banana", "cherry", "date");

        // Find the minimum element based on length
        Comparator<String> byLength = Comparator.comparing(String::length);
        Optional<String> minLengthWord = word4.collect(Collectors.minBy(byLength));
        System.out.println("Shortest word: " + minLengthWord.orElse("N/A"));
        // Stream can't be reused; create a new stream
        word4 = Stream.of("apple", "banana", "cherry", "date");
        // Find the maximum element based on length
        Optional<String> maxLengthWord = word4.collect(Collectors.maxBy(byLength));
        System.out.println("Longest word: " + maxLengthWord.orElse("N/A"));

		// sum and avg using collect

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        // Calculate the sum using Collectors.summingInt()
        int sumCollect = numbers.collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum: " + sumCollect);
        // Stream can't be reused; create a new stream
        numbers = Stream.of(1, 2, 3, 4, 5);
        // Calculate the average using Collectors.averagingInt()
        double averageCollect = numbers.collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: " + averageCollect);

		// grouping by
		/*
		List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("David", 25)
        );

        Map<Integer, List<Person>> peopleByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));
		*/

		// PartitioningBy --> collector is used to partition the elements of a stream into two groups based on a given predicate
		List<Integer> partitionNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Map<Boolean, List<Integer>> evenAndOdd = partitionNumber.stream()
            .collect(Collectors.partitioningBy(isEven));

        System.out.println("Even numbers: " + evenAndOdd.get(true));
        System.out.println("Odd numbers: " + evenAndOdd.get(false));

		// Parallel Stream --> that allows you to process data in parallel, taking advantage of multiple processor cores to improve performance on multi-core machines
		//Using parallelStream() method on a collection:
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
		Stream<String> parallelStreamforCollection = list.parallelStream();
		//Using parallel() method on an existing stream:
		Stream<String> stream = Stream.of("apple", "banana", "cherry", "date");
		Stream<String> parallelStreamforStream = stream.parallel();
		// Example:-
		List<String> word5 = Arrays.asList("apple", "banana", "cherry", "date");
		int totalLength = word5.parallelStream().mapToInt(String::length).sum();
		System.out.println("Total length of words: " + totalLength);

		// Builder --> builder is a creational design pattern used to construct complex objects step by step. The builder pattern is particularly useful when you have an object with a large number of properties or configuration options and you want to create instances of this object in a clear and organized manner.
		/*
		Person person = new Person.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .build();
		*/

		// Empty stream
		Stream<Integer> emptyStream = Stream.empty();

		// Skip --> It is used in the context of streams to skip a specified number of elements at the beginning of a stream and produce a new stream without those elements.
		IntStream skipNumbers = IntStream.of(1, 2, 3, 4, 5, 6);
        // Skip the first three elements
        IntStream skippedStream = skipNumbers.skip(3);
        // Print the remaining elements
        skippedStream.forEach(System.out::print);
		System.out.println();

		// toArray --> convert the elements of a stream into an array.
		Stream<String> stringStream = Stream.of("apple", "banana", "cherry", "date");
        String[] stringArray = stringStream.toArray(String[]::new);
        // Print the elements in the array
        for (String item : stringArray) {
            System.out.print(item+" ");
        }
		System.out.println();

		// toArray(generator)
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        // Convert the stream to an array of integers
        Integer[] integerArray = intStream.boxed().toArray(size -> new Integer[size]); //boxed() method is used to convert the IntStream to a Stream<Integer before applying toArray
        // Print the elements in the array
        System.out.println(Arrays.toString(integerArray));

		// frequency
		List<Integer> freqList = Arrays.asList(1,2,3,1,2,4,5,3);
		Set<Integer> duplicateList = freqList.stream().filter(i -> Collections.frequency(freqList,i) > 1).collect(Collectors.toSet());
		System.out.println(duplicateList);
	}
}

class DesSort implements Comparator<Integer>
{
	@Override
	public int compare(Integer a, Integer b){
		// Decending Order
		if(a>b){
			return -1;
		}else if(a<b){
			return 1;
		}else{
			return 0;
		}
	}
}