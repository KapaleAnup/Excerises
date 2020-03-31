package TestAutomationGuru;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

public class jfairyDemo {

    public static void main(String[] args) {

        Fairy fairy = Fairy.create();

       Person person = fairy.person();

       System.out.println(person.getFirstName());
       System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println( person.getAddress());
        System.out.println( person.getDateOfBirth());
        System.out.println(person.getEmail());
        System.out.println(person.getCompanyEmail());

        for (int i=0;i<3;i++){
            System.out.println(person);
        }
    }
}
