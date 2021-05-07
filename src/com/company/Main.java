package com.company;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class Main {

    public static void main(String[] args) {
        //TreeSet sınıfını kullanarak bir küme oluşturma
        Set<Integer> numbers = new TreeSet<>();

        //Sete öğeler ekleyin
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("TreeSet kullanarak ayarlayın: " + numbers);

        // Iterator() kullanarak Elements'e erişin
        System.out.print("İterator () kullanarak öğelere erişim: ");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

    }
}
