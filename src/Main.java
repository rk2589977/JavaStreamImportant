import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // how to create the list of stream from the array
//        List<Integer> list= Arrays.asList(1,2,3,4,5);
//        **********************************************

        // print the list with the help of for each loop
//        list.forEach(System.out::println);

        //        **********************************************

        // use of the map
//        Question: Given a List<Integer>, write a stream operation to square each number and print the results.

//        List<Integer> list2=Arrays.asList(1,2,3,4,5);
//        List<Integer> ansList=list2.stream().map(x->x*x).toList();
//        System.out.println(ansList);

        //        **********************************************

        // Q2. Convert a list of strings to uppercase

//        List<String> list=Arrays.asList("rahul","mohit","rohit");
//        List<String> ans=list.stream().map(String::toUpperCase).toList();
//
//        System.out.println(ans);

        //        **********************************************

//        Q3. Get lengths of each string in a list

//        List<String> list=Arrays.asList("rahul","mohit","rohit","krishna");
//        Map<String,Integer> mapList=list.stream().collect(Collectors.toMap(Function.identity(),String::length));
//        System.out.println(mapList);


//        Map<Integer, List<String>> mapGrouped = list.stream()
//                .collect(Collectors.groupingBy(String::length));

//        {5=[rahul, mohit, rohit], 7=[krishna]}

        // **********************************************

      //  Convert a list of objects to a list of one property (e.g., employee names)
//
//        class Employee {
//            String name;
//            int age;
//            Employee(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//        }
//
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", 30),
//                new Employee("Bob", 25)
//        );
//
//        List<String> list=employees.stream().map(e->e.name).collect((Collectors.toList()));
//        System.out.println(list);


//        ***************************************************************

//        List<String> fruits=Arrays.asList("apple","banana");
//        List<Character> initial=fruits.stream()
//                .map(s->s.charAt(0))
//                .toList();
//
//        System.out.println(initial);

//        ******************************************************

//        Convert a list of Employee objects to a map of name -> age

//        class Employee {
//            String name;
//            int age;
//            Employee(String name, int age) {
//                this.name = name;
//                this.age = age;
//            }
//        }
//
//        List<Employee> list = Arrays.asList(
//                new Employee("Alice", 30),
//                new Employee("Bob", 25)
//        );
//
//        Map<String,Integer> map= list.stream().collect(Collectors.toMap(e->e.name, e->e.age));
//        System.out.println(map);

//        *****************************************************************


//        entrySet() with Stream and map()
//        we use map.entrySet()
//        Loop through key-value pairs

        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Grapes", 40);

//        items.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
//
//        Map<String,Integer> map=items.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        System.out.println(map);

//        Filter entries where value > 20, return keys

//        Map<String,Integer> map1=items.entrySet().stream()
//                .filter(e->e.getValue()>20)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//        System.out.println(map1);
//
//        List<String> keys = items.entrySet().stream()
//                .filter(entry -> entry.getValue() > 20)
//                .map(Map.Entry::getKey)   // this is the prefered way
//                .map(e->e.getKey())
//                .toList();
//
//        System.out.println(keys);

//        Map<String, Integer> doubledMap=items.entrySet().stream()
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        e -> e.getValue()*2
//                ));
//
//        System.out.println(doubledMap);


//        ascending order
//        Map<String, Integer> sortedByValue = items.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));
//
//        System.out.println(sortedByValue);


        //desending order
//        Map<String, Integer> sortedByValue = items.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));
//
//        System.out.println(sortedByValue);


// Sort by value, then by key if values are equal
//        Map<String, Integer> sorted = items.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (e1, e2) -> e1,
//                        LinkedHashMap::new
//                ));


//        Concatenate all key-value pairs into a single comma-separated String
//        String result = items.entrySet().stream()
//                .map(entry -> entry.getKey() + "=" + entry.getValue())
//                .collect(Collectors.joining(", "));
//        System.out.println(result);


//        Count how many values are greater than 15
//        long count = items.entrySet().stream()
//                .filter(entry -> entry.getValue() > 15)
//                .count();

//        Access key and value at once	map.entrySet()
//        Transform key or value	map() inside stream
//        Filter on value or key	filter()
//        Collect to new map	Collectors.toMap()
//        Maintain order	LinkedHashMap::new


//        ***********************************************************

//        Collectors.groupingBy() lets you group elements in a Stream
//        Collectors.groupingBy() is used to group elements in a stream by a classifier function, and return a Map where:
//
//        the key is the result of applying the classifier function,
//
//        and the value is a list of elements that share that key.

        // simple terms mai group by group mai kar deta hai

//        Group strings by their length
//        List<String> words=Arrays.asList("apple", "banana", "orange", "grapes");
//
//        Map<Integer,List<String>> groupedByLength=words.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println(groupedByLength);


//        Group numbers by even or odd
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Map<String,List<Integer>> mapListOfOddEven =numbers.stream().collect(Collectors.groupingBy(x->x%2 == 0 ? "even" : "odd"));
//        System.out.println(mapListOfOddEven);

//        Count how many items in each group:
//        Map<Integer,Long> countByLength= words.stream().collect(
//                Collectors.groupingBy(String::length,Collectors.counting())
//        );
//        System.out.println(countByLength);

//        Group by first character and join the words:

//        List<String> words=Arrays.asList("apple", "banana", "orange", "grapes");
//
//        Map<Character,String> joined=words.stream().collect(
//                Collectors.groupingBy(
//                        w->w.charAt(0),
//                        Collectors.joining(",")
//                )
//        );
//        System.out.println(joined);

//        ****************************************************

//        List<String> words = Arrays.asList("apple", "bat", "banana", "ant");
//
//        List<String> result = words.stream()
//                .filter(w -> w.length() > 3)
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(result);
// Output: [APPLE, BANANA]

//        *********************************************************

//        Flatten a List of Lists and Get Unique, Sorted Elements

//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(2, 3, 4),
//                Arrays.asList(4, 5)
//        );

//        List<Integer> result = listOfLists.stream()
//                .flatMap(List::stream) // stream of integer mai convert karta hai
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(result);

//        Filter and Flatten Names Starting with “A”


//        List<List<String>> names = Arrays.asList(
//                Arrays.asList("Alice", "Bob"),
//                Arrays.asList("Arjun", "Ravi"),
//                Arrays.asList("Amit", "Ramesh")
//        );
//
//        List<String> filtered = names.stream()
//                .flatMap(List::stream)
//                .filter(name -> name.startsWith("A"))
//                .collect(Collectors.toList());
//        System.out.println(filtered);

//        Remove Duplicates, Sort in Descending Order

//        List<Integer> numbers = Arrays.asList(5, 2, 4, 2, 3, 5, 1);
//
//        List<Integer> sortedUnique = numbers.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//
//        List<List<Integer>> nested = Arrays.asList(
//                Arrays.asList(10, 15),
//                Arrays.asList(20, 25, 30),
//                Arrays.asList(35, 40)
//        );
//
//        List<Integer> evenSorted = nested.stream()
//                .flatMap(List::stream)
//                .filter(n -> n % 2 == 0)
//                .sorted()
//                .collect(Collectors.toList());

//        Unique Names in Uppercase After Filtering Length > 4

//        List<String> names = Arrays.asList("Rahul", "Mohit", "Ankit", "Ankit", "Ravi", "Ramesh");
//        List<String> result = names.stream()
//                .distinct()
//                .filter(name -> name.length() > 4)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(result); // Output: [RAHUL, MOHIT, RAMESH]


//        Filter and Skip First 2 Even Numbers

//        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12);
//        List<Integer> result = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .skip(2)
//                .collect(Collectors.toList());
//
//        System.out.println(result); // Output: [6, 8, 10, 12]

//        class User {
//            String name;
//            String email;
//            User(String name, String email) {
//                this.name = name;
//                this.email = email;
//            }
//        }
//
//        List<User> users = Arrays.asList(
//                new User("Ankit", "ankit@gmail.com"),
//                new User("Ravi", "ravi@gmail.com"),
//                new User("Amit", "amit@gmail.com"),
//                new User("Ramesh", "ramesh@gmail.com")
//        );
//
//        List<String> result = users.stream()
//                .map(user -> user.email)
//                .filter(email -> email.startsWith("a"))
//                .collect(Collectors.toList());
//
//        System.out.println(result); // Output: [ankit@gmail.com, amit@gmail.com]


//        Skip First 2, Then Get Distinct Words with Length > 6
//        List<String> words = Arrays.asList("java", "spring", "java", "microservices", "cloud", "springboot");
//
//        List<String> result = words.stream()
//                .skip(2)
//                .distinct()
//                .filter(word -> word.length() > 6)
//                .collect(Collectors.toList());
//
//        System.out.println(result); // Output: [microservices, springboot]
//
//*************************************************************

//        Use collect() to Convert a List to a Set

//        List<String> names = Arrays.asList("Java", "Python", "Java", "C++");
//
//        Set<String> uniqueNames = names.stream()
//                .collect(Collectors.toSet());
//
//        System.out.println(uniqueNames); // Output: [Java, Python, C++]

//        Use reduce() to Get Sum of All Numbers
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
//
//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//
//        System.out.println(sum); // Output: 100
//
//        int sum = numbers.stream()
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println(sum); // Output: 100

//        Use count() to Count Strings Starting with "A"

//        List<String> names = Arrays.asList("Ankit", "Ravi", "Ankur", "Amit", "Mohan");
//        long count = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .count();
//
//        System.out.println(count); // Output: 3

//        Use anyMatch() to Check if Any Number is Even

//        List<Integer> nums = Arrays.asList(1, 3, 5, 7, 8);
//        boolean hasEven = nums.stream()
//                .anyMatch(n -> n % 2 == 0);
//
//        System.out.println(hasEven); // Output: true


//        Use allMatch() to Check if All Numbers are > 0

//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
//
//        boolean allPositive = nums.stream()
//                .allMatch(n -> n > 0);
//
//        System.out.println(allPositive); // Output: true

//        findFirst() to Get First Element Starting with “J”

//        List<String> langs = Arrays.asList("C++", "Java", "Python", "JavaScript");
//
//        Optional<String> firstJ = langs.stream()
//                .filter(lang -> lang.startsWith("J"))
//                .findFirst();
//
//        firstJ.ifPresent(System.out::println); // Output: Java


//        Use reduce() to Get Maximum Number

//        List<Integer> numbers = Arrays.asList(5, 10, 15, 2, 50);
//
//        Optional<Integer> max = numbers.stream()
//                .reduce(Integer::max);
//
//        max.ifPresent(System.out::println); // Output: 50

//        Use count() with distinct() to Count Unique

//        List<String> items = Arrays.asList("pen", "book", "pen", "pencil", "book");
//        long uniqueCount = items.stream()
//                .distinct()
//                .count();
//
//        System.out.println(uniqueCount); // Output: 3

//*****************************************************************************

//        reduce()

//        Product of All Numbers
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//        int product = numbers.stream()
//                .reduce(1, (a, b) -> a * b);
//
//        System.out.println(product); // Output: 24

//        Longest String in List
//        List<String> words = Arrays.asList("apple", "banana", "grapes", "kiwi");
//
//        String longest = words.stream()
//                .reduce("", (a, b) -> a.length() > b.length() ? a : b);
//
//        System.out.println(longest); // Output: banana

//        Sum of Squares

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//
//        int result = numbers.stream()
//                .map(n -> n * n)
//                .reduce(0, Integer::sum);
//
//        System.out.println(result); // Output: 30

//        Custom Object — Find Employee with Max Salary

//        class Employee {
//            String name;
//            int salary;
//            Employee(String name, int salary) {
//                this.name = name;
//                this.salary = salary;
//            }
//        }
//        List<Employee> employees = Arrays.asList(
//                new Employee("Rahul", 30000),
//                new Employee("Amit", 50000),
//                new Employee("Mohit", 40000)
//        );
//
//        Optional<Employee> highestPaid = employees.stream()
//                .reduce((e1, e2) -> e1.salary > e2.salary ? e1 : e2);
//
//        highestPaid.ifPresent(e -> System.out.println(e.name + " - " + e.salary));
// Output: Amit - 50000


//        any match

//### ✅ **Q1. Check if List Contains Any Even Number**
//
//        List<Integer> nums = Arrays.asList(1, 3, 5, 8);
//
//        boolean hasEven = nums.stream()
//                .anyMatch(n -> n % 2 == 0);
//
//        System.out.println(hasEven); // Output: true


//### ✅ **Q2. Check if Any String Starts with “A”**

//        List<String> names = Arrays.asList("Rahul", "Ankit", "Mohit");
//
//        boolean startsWithA = names.stream()
//                .anyMatch(name -> name.startsWith("A"));
//
//        System.out.println(startsWithA); // Output: true

//
//        ### ✅ **Q4. Check if Any Salary is Greater Than 1 Lakh**
//        List<Integer> salaries = Arrays.asList(35000, 45000, 120000, 25000);
//        boolean highSalary = salaries.stream()
//                .anyMatch(salary -> salary > 100000);
//
//        System.out.println(highSalary); // Output: true
//
//
//### ✅ **Q5. Check if Any City Name Contains "del" (case-insensitive)**
//
//        List<String> cities = Arrays.asList("Mumbai", "New Delhi", "Chennai");
//        boolean containsDel = cities.stream()
//                .anyMatch(city -> city.toLowerCase().contains("del"));
//
//        System.out.println(containsDel); // Output: true
//
//### ✅ **Q6. Check if Any Number Is Negative**
//
//        List<Integer> numbers = Arrays.asList(3, 0, -2, 5);
//
//        boolean hasNegative = numbers.stream()
//                .anyMatch(n -> n < 0);
//
//        System.out.println(hasNegative); // Output: true

//        Get First Square > 50

//        List<Integer> nums = Arrays.asList(3, 5, 6, 8, 10);
//        Optional<Integer> firstSquare = nums.stream()
//                .map(n -> n * n)
//                .filter(sq -> sq > 50)
//                .findFirst();
//
//        firstSquare.ifPresent(System.out::println); // Output: 64

//        **********************************************************
//
//
//### ✅ `Collectors.mapping()`
//
//* Used **inside `Collectors.groupingBy()`** or other collectors.
//                * Transforms elements before collecting them.
//
//
//### ✅ `Collectors.reducing()`
//
//* A collector version of `reduce()`, often used in **groupingBy** to aggregate results like **sum, max, min, etc.**
//
//
//## 🔷 **Part 1: Questions Using `Collectors.mapping()`**
//
//### ✅ **Q1. Group Names by First Character and Collect in Uppercase**
//
//                List<String> names = Arrays.asList("Ankit", "Amit", "Ravi", "Ramesh", "Rohit");
//
//**Task:**
//
//* Group by first character
//* Convert each name to uppercase
//                * Collect into list
//
//        Map<Character, List<String>> grouped = names.stream()
//                .collect(Collectors.groupingBy(
//                        name -> name.charAt(0),
//                        Collectors.mapping(String::toUpperCase, Collectors.toList())
//                ));
//
//        System.out.println(grouped);
//// Output: {A=[ANKIT, AMIT], R=[RAVI, RAMESH, ROHIT]}
//
//
//
//### ✅ **Q2. Group Cities by Country and Get Their Lengths**
//
//        Map<String, List<String>> input = Map.of(
//                "India", List.of("Delhi", "Mumbai"),
//                "USA", List.of("New York", "LA")
//        );
//
//**Task:**
//        Flatten it and group cities by country, and collect city name lengths.
//
//```java
//        Map<String, List<Integer>> cityLengths = input.entrySet().stream()
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        entry -> entry.getValue().stream()
//                                .collect(Collectors.mapping(String::length, Collectors.toList()))
//                ));
//
//        System.out.println(cityLengths);
//// Output: {India=[5, 6], USA=[8, 2]}
//
//### ✅ **Q3. Group Employees by Department, Extract Only Names**
//
//        class Employee {
//            String name;
//            String dept;
//            Employee(String name, String dept) {
//                this.name = name;
//                this.dept = dept;
//            }
//        }
//        List<Employee> emps = List.of(
//                new Employee("Rahul", "IT"),
//                new Employee("Amit", "HR"),
//                new Employee("Ravi", "IT")
//        );
//
//**Task:** Group by department, collect only names using `mapping()`.
//
//        Map<String, List<String>> result = emps.stream()
//                .collect(Collectors.groupingBy(
//                        emp -> emp.dept,
//                        Collectors.mapping(emp -> emp.name, Collectors.toList())
//                ));
//
//        System.out.println(result);
//// Output: {HR=[Amit], IT=[Rahul, Ravi]}
//
//
//## 🔷 **Part 2: Questions Using `Collectors.reducing()`**
//
//
//### ✅ **Q4. Sum All Numbers with `Collectors.reducing()`**
//
//        List<Integer> numbers = List.of(10, 20, 30);
//```
//
//**Task:** Use `reducing()` to get total sum.
//
//        int sum = numbers.stream()
//                .collect(Collectors.reducing(0, Integer::sum));
//
//        System.out.println(sum); // Output: 60
//
//
//### ✅ **Q5. Get Longest String in a List**
//
//        List<String> strings = List.of("Java", "JavaStream", "API");
//
//        String longest = strings.stream()
//                .collect(Collectors.reducing((s1, s2) ->
//                        s1.length() > s2.length() ? s1 : s2
//                )).orElse("");
//
//        System.out.println(longest); // Output: JavaStream
//
//### ✅ **Q6. Group by Department, and Count Total Characters in All Names**
//
//        List<Employee> emps = List.of(
//                new Employee("Rahul", "IT"),
//                new Employee("Amit", "IT"),
//                new Employee("Raj", "HR")
//        );
//**Task:** Group by department and get total length of all names per department.
//
//```java
//        Map<String, Integer> nameCharCount = emps.stream()
//                .collect(Collectors.groupingBy(
//                        e -> e.dept,
//                        Collectors.reducing(
//                                0,
//                                e -> e.name.length(),
//                                Integer::sum
//                        )
//                ));
//
//        System.out.println(nameCharCount);
// Output: {HR=3, IT=9}
//
//### ✅ **Q7. Group Numbers by Even/Odd, and Reduce to Max**
//
//                List<Integer> nums = List.of(10, 15, 20, 25, 30);
//
//**Task:** Group into even/odd and get max number in each group.
//
//                Map<String, Integer> maxByGroup = nums.stream()
//                .collect(Collectors.groupingBy(
//                        n -> (n % 2 == 0) ? "Even" : "Odd",
//                        Collectors.reducing(
//                                Integer.MIN_VALUE,
//                                n -> n,
//                                Integer::max
//                        )
//                ));
//
//        System.out.println(maxByGroup);
// Output: {Even=30, Odd=25}

    }
}