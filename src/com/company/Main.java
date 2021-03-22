package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        RFF rff=new RFF();
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        addList(A);
        print(A);
        addList(B);
        print(B);
        Collections.reverse(B);
        Iterator<String> itA=A.iterator();
        Iterator<String> itB=B.iterator();
        while (itA.hasNext()&& itB.hasNext()){//hasNext - возвращает boolean
            C.add(itA.next());
            C.add(itB.next());

        }print(C);
        Collections.sort(C, rff);// сортируем
        print(C);



        // A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1

        // 1,2,3,4,5
        // 5,4,3,2,1
        // сначало А затем В
        // список В его отзеркалили reverse (это функция которая зеркалит)

    }

    public static void print(ArrayList<String> list) throws InterruptedException {
        Iterator<String> iterator = list.iterator();
        //iterator - это системный класс который распечатывает Arraylist.
        System.out.println("Ваш список распечатывается ... ");
        while (iterator.hasNext()) {//hasNext- есть ли в (iterator) имеет ли ...
            System.out.println(iterator.next());//next-возвращает значение
            //Thread.sleep(1000);
        }
        System.out.println("Ваш список распечатан !");

    }

    public static void addList(ArrayList<String> list) {
        System.out.println("Введите 5 имен : ");
        Scanner scanner = new Scanner(System.in);
        int position = 0;
        while (position < 5) {
            list.add(scanner.nextLine());//пользователь вводит 5 значений
            position++;
        }
        System.out.println("Вы заполнили словарь ! ");

    }



}