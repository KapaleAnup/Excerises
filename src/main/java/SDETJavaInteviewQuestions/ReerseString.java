package SDETJavaInteviewQuestions;

public class ReerseString {

    public static void main(String[] args) {

        String str = "ABCD , is not java";
        String rev = "";
//
//        int length = str.length();
//
//        for(int i = length -1;i>=0;i--){
//
//            rev = rev + str.charAt(i);
//
//        }


        // using CharArray
//
//        char a[] = str.toCharArray();
//
//       int length =  a.length;
//
//       for (int i= length-1;i>=0;i--){
//
//           rev = rev + a[i];
//
//       }


        // Uaing Srting Buffer class

        StringBuffer stringBuffer = new StringBuffer(str);

        System.out.println("Reversed string is : " + stringBuffer.reverse());
    }
}

