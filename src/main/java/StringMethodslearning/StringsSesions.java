package StringMethodslearning;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringsSesions {


    @Test
    public void StringsConcat() {

        // Java StringMethods concat example

        // Java program to concatenate two strings to produce combined string.
        // We can pass an empty string as method argument. In this case, method will return the original string.
        // ‘null’ is not allowed  System.out.println("Hello".concat( null )); It will throw NullPointerException.

        String str = "Selenium";

        String add = str.concat(" Testing");

        System.out.println(add);

    }

    /**
     * Trim method is used to reduce the space from beginign in the statement.
     */

    @Test
    public void StringsTrim() {


        String str = "         Selenium is a best tool to learn automation";
      //  String test = "test+autoamtion";
        System.out.println(str.trim());

    }

        @Test
    public void StringsHashCode() {
        // Java StringMethods hashCode() method example
        // Java StringMethods hashCode() method returns the hash code for the StringMethods.
        // Hash code value is used in hashing based collections like HashMap, HashTable etc.
        // This method must be overridden in every class which overrides equals() method.

        String blogName = "howtodoinjava.com";
        String test = "8767510435";

      //  System.out.println(blogName.hashCode());

      //  System.out.println("hello world".hashCode());

      //  System.out.println(test);

    }

    @Test
    public void Stringscontains() {

        //Use StringMethods.contains() to find is a substring is present in given string or not.
        // Please remember that this method is case sensitive.
        // StringMethods.contains() method does not accept 'null' argument.
        // It will throw NullPointerException in case method argument is null.

        System.out.println("Hello World".contains("Hello"));    //true

        System.out.println("Hello World".contains("World"));    //true

        System.out.println("Hello World".contains("WORLD"));    //false - case-sensitive

        System.out.println("Hello World".contains("Java"));     //false
    }


    @Test
    public void StringsCompareTO() {

        // Java StringMethods compareTo() method compares two strings lexicographically.
        // We can consider it dictionary based comparison.

        System.out.println("apple".compareTo("banana"));  //-1 - apple comes before banana
        System.out.println("apple".compareTo("cherry"));  //-2 - apple comes before cherry
        System.out.println("cherry".compareTo("banana")); //1  - cherry comes after banana
        System.out.println("cherry".compareTo("cherry")); //0  - Both strings are equal
    }


    @Test
    public void StringsEquals() {

        //Java StringMethods equals() method is used to compare a string with the method argument object.

        // StringMethods class overrides equals() method from Object class. The equality is done in case-sensitive manner.
        //Use equals() method to check the equality of string contents.
        //Do not use '==' operator. It checks the object references, which is not not desirable in most cases.
        //Passing ‘null’ to method is allowed. It will return false.
        //Use equalsIgnoreCase() method to check equal strings in case-insensitive manner.

        String blogName = "howtodoinjava.com";
        String authorName = "Anup kapale";

        //1 - check two strings for same character sequence
        boolean isEqualString = blogName.equals(authorName);    //false

        //2
        isEqualString = blogName.equals("howtodoinjava.com");   //true

        //3
        isEqualString = blogName.equals(null);                  //false

        //4 - case-sensitive
        isEqualString = blogName.equals("HOWTODOINJAVA.COM");   //false

    }

    @Test
    public void StringsCharAt() {

        // The method java.lang.StringMethods.charAt(int index) returns the character at the specified index argument in the StringMethods object.
        //As we know, Java string is internally stored in char array.
        // This method simply use the index to get the character from that backing char array in string object.


        String blogName = "howtodoinjava.com";

        char c1 = blogName.charAt(0);   //first character
        char c2 = blogName.charAt(blogName.length() - 1);   //last character
        char c3 = blogName.charAt(5);        //random character

        System.out.println("Character at 0 index is: " + c1);
        System.out.println("Character at last is: " + c2);
        System.out.println("Character at 5 index is: " + c3);

        char c4 = blogName.charAt(50);        //invalid index
    }

    @Test
    public void StringIntern(){

        // The Java StringMethods intern() return the reference of a equal string literal present in string pool.
        // If there is an existing string literal present in string pool then it’s reference is returned.
        // Otherwise a new string with same content is created and the reference of new string is returned.
        //StringMethods equality is checked with StringMethods.equals() method.


        //StringMethods object in heap
        String str1 = new String("hello world");

        //StringMethods literal in pool
        String str2 = "hello world";

        //StringMethods literal in pool
        String str3 = "hello world";

        //StringMethods object interned to literal
        //It will refer to existing string literal
        String str4 = str1.intern();


        System.out.println(str1 == str2);       //false
        System.out.println(str2 == str3);       //true
         System.out.println(str2 == str4);       //true
       // System.out.println(str4);

    }

    @Test
    public void StringSplit(){

        //  The Java StringMethods split() returns string array after it splits the string around matches of the method argument regular expression.

     //   StringMethods[] strArray = "hello world".split(null);

        // Java split string with word or delimiter
        //Java program to split a string based on some token. In given example, I am splitting string for delimiter hyphen "-"

        String str = "how to do-in-java-provides-java-tutorials";

        String[] strArraye = str.split("-");

        System.out.println(Arrays.toString(strArraye));

        // Split a string by space

        String[] strArray = str.split("\\s");
        System.out.println(Arrays.toString(strArray));
    }


}
