package org.example.Strings;

public class StringBufferDemo {

   static StringBuffer sb = new StringBuffer("Hello");

   static StringBuilder sd = new StringBuilder("Hello");

    public static void main(String[] args) {

        //Start time
        long begin = System.currentTimeMillis();
        //Call the function
//        for(int i=0; i<=100000; i++) {
//            sb.append(":").append(i);
//        }
//        System.out.println(sb);
//        for(int i=0; i<=100000; i++) {
//            sd.append(":").append(i);
//        }
//        System.out.println(sd);             //StringBuilder is faster as compared to String Buffer

        StringBuilder sbu = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sbu.append(ch);
        }
        System.out.println(sbu);
        //End time
        long end = System.currentTimeMillis();
        long time = end-begin;
        System.out.println(time+" Milli seconds");

    }

}
