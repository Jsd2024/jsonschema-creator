//package org.demo.app.controller;
//
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import org.demo.app.model.Employee;
//import org.demo.app.service.DatabaseService;
//import org.demo.app.service.EmpServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//import java.io.*;
//import java.util.*;
//import java.util.function.Function;
//
//import static java.lang.Integer.valueOf;
//import static org.demo.app.controller.TreeMax.maxNodeLevel;
//import static org.demo.app.controller.TreeMax.newNode;
//
//@CrossOrigin("*")
//@RestController
//public class Controller {
//    @Autowired
//    EmpServiceImpl empService;
//    @Autowired
//    TreeMaxNodeLevel treeMaxNodeLevel;
//
//    @RequestMapping("/get/employees")
//    public ResponseEntity<List<Employee>> getEmpData() {
//
//        List<Employee> employeeList = empService.getEmployeeData();
//
//        Function<String, String> identity = Function.identity();
//
//        String input = "Hello, world!";
//        String output = identity.apply(input);
//
//        System.out.println(output); // prints "Hello, world!"
//
//
//        return new ResponseEntity<>(employeeList, HttpStatus.OK);
//    }
//
//
//    @RequestMapping(value = "/insert/employees", method = RequestMethod.POST)
//    public ResponseEntity<List<Employee>> createEmpData(@RequestBody Employee employee) {
//
//        List<Employee> employeeList = empService.createEmployeeData(employee);
//        return new ResponseEntity<>(employeeList, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/delete/employees/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<String> deleteEmpData(@PathVariable("id") String employeeId) {
//
//        String deletedMsg = empService.deleteEmployeeData(employeeId);
//        return new ResponseEntity<>(deletedMsg, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/update/employees/{name}", method = RequestMethod.PUT)
//    public ResponseEntity<String> updateEmpData(@PathVariable("name") String name, @RequestBody Employee emp) {
//
//        String updatedMsg = empService.updateEmployeeData(name, emp);
//        return new ResponseEntity<>(updatedMsg, HttpStatus.OK);
//    }
//
//
//    @RequestMapping("/test/jaxb")
//    public ResponseEntity<List<Employee>> getJaxbData() throws JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
//        System.out.println("jaxbContext: " + jaxbContext);
//        return null;
//    }
//
//    @RequestMapping("/pattern")
//    public void commonPatternMatchAndGet() {
//        String s1 = "helloworld";//"horlelwdlo";
//        String s2 = "world";
//        List<String> sourceString = List.of(s1.split(""));
//        List<String> destString = List.of(s2.split(""));
//        Set common = new LinkedHashSet<>(destString);
//        common.retainAll(sourceString);
//        System.out.println("sourceString: " + sourceString);
//        System.out.println("destString: " + destString);
//        String joinCommon = String.join("", common);
//        System.out.println("common: " + joinCommon);
//
////        List<Employee> employeeList1 =
////                List.of(Employee.builder().name("Abc").build(),
////                        Employee.builder().name("Def").build(),
////                        Employee.builder().name("Rew").build());
////        List<Employee> employeeList2 =
////                List.of(Employee.builder().name("Mno").build(),
////                        Employee.builder().name("Rew").build(),
////                        Employee.builder().name("Gfd").build(),
////                        Employee.builder().name("Ytr").build(),
////                        Employee.builder().name("Def").build());
////        Set<Employee> commonEmpl = new LinkedHashSet<>(employeeList2);
////        commonEmpl.retainAll(employeeList1);
////        System.out.println("commonEmployees: " + commonEmpl);
//    }
//
//    @RequestMapping("/hmVsHt")
//    public void hmVsHt() {
//        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
//        ht.put(101, " ajay");
//        ht.put(101, "Vijay");//duplicate key
//        ht.put(102, "Ravi");
//        ht.put(103, "Rahul");
//        ht.put(105, "Rahul");
////        ht.put(106, null); //null  value -> err
////        ht.put(null, null); //null key, value-> err
//        System.out.println("-------------Hash table--------------");
//        for (Map.Entry m : ht.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//
//        //----------------hashmap--------------------------------
//        HashMap<Integer, String> hm = new HashMap<Integer, String>();
//        hm.put(100, "Amit");
//        hm.put(104, "Amit");//duplicate value
//        hm.put(101, "Vijay");
//        hm.put(101, "Rahul");
//        hm.put(103, null); //null key, value
//        hm.put(null, "nullVal"); //null key, value
//        hm.put(105, null); //null key, value
//        System.out.println("-----------Hash map-----------");
//        for (Map.Entry m : hm.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//    }
//
//    @RequestMapping("/pbvr")
//    public void passByValueRef() {
//        Map<String, String> gfg = new HashMap<String, String>();
//
//        // enter name/url pair
//        gfg.put("GFG", "geeksforgeeks.org");
//        gfg.put("Practice", "practice.geeksforgeeks.org");
//        gfg.put("Code", "code.geeksforgeeks.org");
//        gfg.put("Quiz", "www.geeksforgeeks.org");
//        gfg.entrySet()
//                .stream()
//                .forEach((entry) -> {
//                    System.out.println("Initial Key = " + entry.getKey() +
//                            ", Initial  Value = " + entry.getValue());
//                });
//
//        int intVar = 5;
//        Integer intWrapperVar = 11;
//
//        Map<Integer, Double> mapHetero = new HashMap<>();
//        mapHetero.put(9, 9.6);
//        mapHetero.put(valueOf(8), 4.0);
//        mapHetero.put(valueOf(2), 6.2);
//
//
//        changeMapEntry(gfg, intVar, intWrapperVar, mapHetero);
//        for (Map.Entry<String, String> entry : gfg.entrySet()) {
//            System.out.println("After Change Key = " + entry.getKey() +
//                    ", After Change  Value = " + entry.getValue());
//        }
//        System.out.println("After Change intVar = " + intVar);
//        System.out.println("After Change intWrapperVar = " + intWrapperVar);
//
//        mapHetero.entrySet().stream()
//                .map(entry -> {
//                    double entryNew = entry.getValue() + 1.4;
//                    entry.setValue(entryNew);
//                    return entry;
//                })
//                .forEach((entry) -> {
//                    System.out.println("mapHetero After Change Key = " + entry.getKey() +
//                            ", mapHetero After Change  Value = " + entry.getValue());
//                });
//    }
//
//    private static void changeMapEntry(Map<String, String> gfg, int intVar, Integer intWrapperVar, Map<Integer, Double> mapHetero) {
//        for (Map.Entry<String, String> entry : gfg.entrySet()) {
//            String chengedEntry = entry.getValue() + ":added";
//            entry.setValue(chengedEntry);
//        }
//        //change
//        intVar = intVar + 5;
//        intWrapperVar = intWrapperVar + 8;
//        System.out.println("Within Change intVar = " + intVar);
//        System.out.println("Within Change intWrapperVar = " + intWrapperVar);
//
//
//        for (Map.Entry<String, String> entry : gfg.entrySet()) {
//
//            System.out.println("Within Change Key = " + entry.getKey() +
//                    ", Within Change  Value = " + entry.getValue());
//        }
//
//        mapHetero.entrySet().stream()
//                .map(entry -> {
//                    double entryNew = entry.getValue() + 1.4;
//                    entry.setValue(entryNew);
//                    return entry;
//                })
//                .forEach((entry) -> {
//                    System.out.println("mapHetero Within Change Key = " + entry.getKey() +
//                            ", mapHetero Within Change  Value = " + entry.getValue());
//                });
//    }
//
//    @RequestMapping("/serDeser")
//    public int serialDeserialization() throws Exception {
//        Save save = new Save();
//        save.i = 4;//state->4
//        File file = new File("serDeser.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
////        oos.write(save.i);
//        oos.writeObject(save.i);
//
//        FileInputStream fis = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
////        Save save1 = new Save();
////        save1.i = ois.read();
////        Save save1 = (Save) ois.readObject();
//        System.out.println("save1.i 1 = " + ois.readObject());
//        return save.i;
//    }
//
////    @RequestMapping("/pojoToJson")
////    public int pojoToJson() throws Exception{
////        Employee employee = Employee.builder()
////                .name("Ram")
////                .age(35)
////                .empId("Emp123")
////                .build();
////
//////        RestAssured
//////                .
////    }
//
//    @RequestMapping(value = "/max", method = RequestMethod.GET)
//    public int getTreeMaxNodeLevel() {
//// binary tree formation
//        TreeMax.Node root = newNode(2);     /*	 2	 */
//        root.left = newNode(1);     /*	 / \ */
//        root.right = newNode(3);     /*	 1	 3	 */
//        root.left.left = newNode(4);     /* / \ \ */
//        root.left.right = newNode(6);     /* 4	 6 8 */
//        root.right.right = newNode(8); /*	 /	 */
//        root.left.right.left = newNode(5);/*	 5	 */
//        int maxNodeLevel = maxNodeLevel(root);
//        System.out.println("Level having maximum number of Nodes from Controller : " + maxNodeLevel);
//
//        return maxNodeLevel;
//    }
//
//    @RequestMapping("/maxLevel")
//    public int findMaxNodeLevelInTree() {
//        int maxLevel = treeMaxNodeLevel.findMaxNodeLevel();
//        return maxLevel;
//    }
//
//
//    //String int sort
//    @RequestMapping("/sort")
//    public int[] getArrSorted() {
//        int[] arr = {14, 156, 164, 73, 16, 2024};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                int temp = 0;
//                if (arr[i] < arr[j]) {//asc < , desc >
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        //loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        return arr;
//    }
//
//    @RequestMapping("/dp/{id}")
//    public int dp(@PathVariable("id") int id) {
//        if (id == 1) {//fib
//            int n = 9;
//            int fib = fibDp(n);
//            System.out.println(fib);
//            return fib;
//        }
//        if (id == 2) {//fact
//            int n = 3;
//            int fact = fact(n);
//            System.out.println(fact);
//            return fact;
//        }
//        if (id == 3) {//catalan no.
//            int n = 10;
//            for (int i = 0; i < 10; i++) {
//                int i1 = catalanDP(i);
//                System.out.print(i1 + " ");
//                return i1;
//            }
//            return n;
//        }
//        if (id == 4) {//binomial Coefficient
//            int n = 5, k = 2;
//            return binomialCoeff(n, k);
//
//        }
//
//        if (id == 5) {//binomial Coefficient
//            int n = 5, k = 2;
//            String s1 = "utrhelloollehpiy";
//            String s2 = "anbdvf";
//
//            int maxLen = findLongestPalindromSubString(s1);
//            maxLen = findLongestPalindromSubString(s2);
//            return maxLen;
//
//        }
//
//
//        if (id == 6) {
//            String w1 = "ab";
//            String w2 = "pquy";
//            mergeAlternately(w1, w2);
//        }
//
//        if (id == 7) {
//            String w1 = "LEET";
//            String w2 = "CODE";
//            gcdOfStrings(w1, w2);
//        }
//        if (id == 8) {
//            int candies[] = {2, 3, 5, 1, 3};
////            int kidsCount = 5;
////            boolean result[]=new boolean[kidsCount];
//            int extraCandies = 3;
//            kidsWithGreatestCandies(candies, extraCandies);
//        }
//
//        if (id == 9) {
//
//
//            String in = "baf";
//            String out = stringReverse(in);
//            System.out.println("out : "+out);
//
////            return out.length();
//        } else {
//            return id;
//        }
//        return 0;
//    }
//
//    private String stringReverse(String in) {
//        StringBuilder sbldrOut = new StringBuilder();
//        char[] inArr = in.toCharArray();
//
//        for (int i = inArr.length - 1; i >= 0; i--) {
//            sbldrOut.append(inArr[i]);
//        }
//        String out = sbldrOut.toString();
//
//        return out;
//    }
//
//    private List<Boolean> kidsWithGreatestCandies(int[] candies, int extraCandies) {
//        candies = new int[]{12, 1, 12};
//
//        int maxCandies = Arrays.stream(candies).max().getAsInt();
//        int kidsCount = candies.length;
//        List<Boolean> resultArr = new ArrayList<>();
//        for (int i = 0; i < kidsCount; i++) {
//            int greatestNoOfCandies = 0;
//
//            if ((extraCandies + candies[i]) > greatestNoOfCandies) {
//                greatestNoOfCandies = (extraCandies + candies[i]);
//                if (greatestNoOfCandies >= maxCandies) {
//                    // result[i] = true;
//                    resultArr.add(true);
//                } else {
//                    resultArr.add(false);
//                }
//            }
//
//        }
//        return resultArr;
//
//    }
//
//    private void gcdOfStrings(String w1, String w2) {
//        //https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
//        //Input: str1 = "ABCABC", str2 = "ABC"
//        //Output: "ABC"
//        //Input: str1 = "ABABAB", str2 = "ABAB"
//        //Output: "AB"
////        Input: str1 = "LEET", str2 = "CODE"
////Output: ""
//        int n1 = w1.length();
//        int n2 = w2.length();
//        StringBuffer oStrBfr = new StringBuffer();
//        int i = 0, j = 0;
//
//        for (int k = 0; k < (n1 < n2 ? n2 : n1); k++) {
//            if ((n1 - i) != 0 && (n2 - j) != 0) {
//                if (w1.charAt(i) == w2.charAt(j)
//                /*&&(!oStrBfr.toString().contains(w1.charAt(i)+"")
//                        || !oStrBfr.toString().contains(w2.charAt(j)+"")
//                )*/
//                ) {
//                    oStrBfr.append(w1.charAt(i));
//                    i++;
//                    j++;
//
//                }
//
//            }
//        }
//        System.out.println("oStrBfr :: " + oStrBfr);
//
//    }
//
//
//    private void mergeAlternately(String w1, String w2) {
//        int n1 = w1.length();
//        int n2 = w2.length();
//        String oStr = null;
//        StringBuffer oStrBfr = new StringBuffer();
//        int i = 0, j = 0;
//
//        for (int k = 0; k < (n1 < n2 ? n2 : n1); k++) {
//            if ((w1.length() - i) != 0) {
//                oStrBfr.append(w1.charAt(i));
//                i++;
//            }
//            if ((w2.length() - j) != 0) {
//                oStrBfr.append(w2.charAt(j));
//                j++;
//            }
//        }
//    }
//
//    private int findLongestPalindromSubString(String str) {
//        int n = str.length();
//        if (n < 2) {
//            return 1;
//        }
//
//        int start = 0, maxLength = 1;
//        int high, low;
//        for (int i = 0; i < n; i++) {
//            high = i + 1;
//            low = i - 1;
//            while (high < n && str.charAt(high) == str.charAt(i)) {
//                high++;
//            }
//            while (low >= 0 && str.charAt(low) == str.charAt(i)) {
//                low--;
//            }
//            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
//                low--;
//                high++;
//            }
//            int length = high - low - 1;
//            if (length > maxLength) {
//                maxLength = length;
//                start = low + 1;
//            }
//
//        }
//        System.out.println("Largest Pal SubString :" + str.substring(start, start + maxLength));
//
//        return maxLength;
//    }
//
//    private int binomialCoeff(int n, int k) {
//        int bcof[][] = new int[n + 1][k + 1];
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= min(i, k); j++) {
//                if (j == 0 || j == i) {
//                    bcof[i][j] = 1;
//                } else {
//                    bcof[i][j] = bcof[i - 1][j - 1] + bcof[i - 1][j];
//                }
//            }
//        }
//        return bcof[n][k];
//    }
//
//    private int min(int i, int k) {
//        return (i < k ? i : k);
//    }
//
//
//    // A dynamic programming based function to find nth
//    // Catalan number
//    static int catalanDP(int n) {
//        // Table to store results of subproblems
//        int catalan[] = new int[n + 2];
//
//        // Initalize first two values in table
//        catalan[0] = 1;
//        catalan[1] = 1;
//
//        // Fill entries in catalan[]
//        // using recursive formula
//        for (int i = 2; i <= n; i++) {
//            catalan[i] = 0;
//            for (int j = 0; j < i; j++) {
//                catalan[i]
//                        += catalan[j] * catalan[i - j - 1];
//            }
//        }
//
//        // Return last entry
//        return catalan[n];
//    }
//
//
//    private int fact(int n) {
//        int fact[] = new int[n + 1];
//        fact[0] = 1;
//        fact[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            fact[i] = i * fact[i - 1];
//
//        }
//        System.out.println("Elements: " + fact);
//        return fact[n];
//    }
//
//    private int fibDp(int n) {
//        /* Declare an array to store Fibonacci numbers. */
//        int fib[] = new int[n + 2]; // 1 extra to handle case, n = 0
//        int i;
//
//        /* 0th and 1st number of the series are 0 and 1*/
//        fib[0] = 0;
//        fib[1] = 1;
//
//        for (i = 2; i <= n; i++) {
//            /* Add the previous 2 numbers in the series
//              and store it */
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//
//        return fib[n];
//    }
//    @Autowired
//    private DatabaseService dbServer;
//    @RequestMapping("/propsrc")
//    public List<String> getTestPropertySource() {
//        List<String> propsList = List.of(dbServer.getName(), dbServer.getThreadPool()+"");
//        return propsList;
//    }
//
//
//
//
//}
//
//class Save implements Serializable {
//    int i;
//}
//
//
