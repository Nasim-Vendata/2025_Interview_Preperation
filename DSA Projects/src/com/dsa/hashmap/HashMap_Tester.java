package com.dsa.hashmap;

public class HashMap_Tester {

	public static void main(String[] args) {
		My_HashMap<String, Integer> map = new My_HashMap<>();

        map.putData("A", 1);
        map.putData("B", 2);
        map.putData("C", 3);

        System.out.println(map.getData("A")); // 1
        System.out.println(map.getData("C")); // 3

        map.putData("A", 10);
        System.out.println(map.getData("A")); // 10 (updated)

        map.removeData("B");
        System.out.println(map.getData("B")); // null

	}

}
