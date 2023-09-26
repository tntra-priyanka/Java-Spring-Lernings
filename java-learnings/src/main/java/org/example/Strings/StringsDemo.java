package org.example.Strings;

public class StringsDemo {
    //T.C O(n)
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //T.C O(n)
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {            //north
                y++;
            } else if (dir == 'S') {      //south
                y--;
            } else if (dir == 'E') {      //East
                x++;
            } else {                     //West
                x--;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i <= str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    //T.C- O(n)
    public static String compressString(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "madam";              //strings are immutable
//        String str2 = "madam";
        String str1 = new String("madam");
        String str2 = new String("madam");

        String name = "my name is priyanka.";
        System.out.println(name.length());
        System.out.println(name.charAt(5));

        //check is palindrome
        System.out.println(isPalindrome(str));

        //print shortest path
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + getShortestPath(path));

        //To compare- (==) - This only compare the reference(memory address)
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //To compare value of String use equals() method - This compare the actual content
        if (str.equals(str1)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println(name.substring(0, 5));

        //String Builder- makes memory efficient- T.C (n)
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

        //first letter to uppercase
        System.out.println(toUpperCase(name));

        //compress
        System.out.println(compressString("aaaabbbbccdddde"));


    }
}