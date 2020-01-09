package SDETJavaInteviewQuestions;

public class EvenAndOddFromArray {

    public static void main(String[] args) {

        int a[] = {1, 4, 6, 7, 8, 10, 3};

        System.out.println(" Even numbers are: ");
       /* for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
            }
*/

       // Enhanced loop

        for (int value:a
             ) {
            if(value%2==0)
                System.out.println(value);
        }

            System.out.println(" Odd numbers are: ");
           /* for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0)
                    System.out.println(a[i]);
                }*/

        for (int value:a
                ) {
            if(value%2!=0)
                System.out.println(value);
        }
            }
        }
