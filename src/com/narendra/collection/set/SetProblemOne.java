package com.narendra.collection.set;

import java.util.*;

public class SetProblemOne {

    public static void main(String[] args) {
        // test1();
       //test2();  //HashSet
      //  test3();
      //  test4();  // LinkedHashSet
        test5();  //TreeSet
    }

    public static void test1() {
        Set<Integer> hs = new HashSet<>();
        hs.addAll(Arrays.asList(2, 4, 2, 6, 8, 10, 1, 3, 5, 7, 9));

        Set<Integer> hs2 = new HashSet<>();
        hs2.addAll(Arrays.asList(2, 7, 9, 10, 12, 13, 15, 18, 20));

        Set<Integer> union = new HashSet<>(hs);
        union.addAll(hs2);
        System.out.println("Uinon Elemnets: " + union);

        Set<Integer> intersection = new HashSet<>(hs);
        intersection.retainAll(hs2);
        System.out.println("Intersection Elemnets: " + intersection);

        Set<Integer> difference = new HashSet<>(hs);
        difference.removeAll(hs2);
        System.out.println("Difference Elemnets: " + difference);
    }

    public static void test2() {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Narendra"));
        System.out.println(set.add("Chathurya"));
        System.out.println(set.add("narendra"));
        System.out.println(set.add("Rajasekhar"));
        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        String check = "Venkatesh";
        System.out.println("contains " + check + " " + set.contains(check));
    }

    public static void test3(){
        String narendra = "narendra";
        String Narendra = "Narendra";
        String rajasekhar = "Rajasekhar";
        System.out.println("narendra hashcode " + narendra.hashCode());
        System.out.println("Narendra hashcode " + Narendra.hashCode());
        System.out.println("rajasekhar hashcode " + rajasekhar.hashCode());
    }

    public static void test4() {
        Set<String> set = new LinkedHashSet<>();
        set.add("Narendra");
        set.add("Chathurya");
        set.add("narendra");
        set.add("Narendra");
        set.add("Rajasekhar");
        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        String check = "Venkatesh";
        System.out.println("contains " + check + " " + set.contains(check));
    }

    public static void test5(){
        Set<Integer> set = new TreeSet<>();
        System.out.println(set.add(5));
        System.out.println(set.add(9));
        System.out.println(set.add(4));
        System.out.println(set.add(7));
        System.out.println(set.add(3));
        System.out.println(set.add(6));
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
