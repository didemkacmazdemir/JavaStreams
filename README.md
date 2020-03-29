# JavaStreams
in Java 8, the Stream API is used to process collections of objects.(List, Set ve Queue).
Using stream, you can process data in a declarative way(ifade eden sekilde) similar to SQL statements. 
Collection interface has two methods to generate a Stream.
1-)stream() − Returns a sequential stream considering collection as its source.
2-)parallelStream() − Returns a parallel Stream considering collection as its source.

Stream Methods
1-) forEach
  Stream has provided a new method ‘forEach’ to iterate each element of the stream.
  
   Stream<String> s = Stream.of("one", "two", "three", "four");
   s.forEach(System.out::println);
  
2-) map
  The ‘map’ method is used to map each element to its corresponding result.
  
  every i corresponds i*i
  List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
  
3-) filter
  The ‘filter’ method is used to eliminate elements based on a criteria.
  
  List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
  //get count of empty string
  int count = strings.stream().filter(string -> string.isEmpty()).count();

4-) limit
  The ‘limit’ method is used to reduce the size of the stream.
  
  Random random = new Random();
  random.ints().limit(10).forEach(System.out::println);
  
5-) sorted
  The ‘sorted’ method is used to sort the stream.
  
  Random random = new Random();
  random.ints().limit(10).sorted().forEach(System.out::println);

6-) Collectors
  Collectors are used to combine the result of processing on the elements of a stream. Collectors can be used to return a list or a string.
  -> List<String> result = givenList.stream().collect(toList());
  -> Set<String> result = givenList.stream().collect(toSet());
  -> Map<String, Integer> stringToLength = listOfString.stream() // key is String itself and value is their length
        .collect(
          Collectors.toMap(
            Function.identity(), String::length));//The Function.identity() used here denotes that same object is used as a key.
                                                  //if your Stream contains duplicate elements than this conversion will fail.
  
7-) toCollection()
  There is also a toCollection() method in the Collectors class which allows you to convert Stream to any collection.
  
  ArrayList<String> stringWithLengthGreaterThanTwo 
  = listOfString
      .stream()
      .filter( s -> s.length() > 2)
      .collect(Collectors.toCollection(ArrayList::new));
