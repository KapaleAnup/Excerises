package makeseleniumeasy;

public class StringProvideinproperIndex {


    public static void main(String[] args) {

        String s1 = "MakeEasy";
        String s2 = "Selenium";
        int insertIndex = 4;
        String result = "";

        for(int i=0;i<s1.length();i++){

            if( i !=  insertIndex){
                result +=  s1.charAt(i);

            }else{
                result += s1 + s2.charAt(i);

            }
            s1= result;
            System.out.println("index added : "+s1);
        }
    }
}
