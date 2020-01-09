package SDETJavaInteviewQuestions;

public class LinearSearch {

    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50};

        int search_number= 20;

        boolean flag= false;

        for (int i=0;i<a.length;i++){

            if(search_number== a[i]){
                System.out.println("Searched element is found at index :" + i);
                flag = true;
                break;
            }
        }

        if (flag == false){

            System.out.println("Searched element is not found");
        }
    }
}
