package TestAutomationGuru;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.company.Company;
import io.codearte.jfairy.producer.payment.CreditCard;
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


        Fairy fairy1=  Fairy.create();
        CreditCard creditCard = fairy1.creditCard();

        System.out.println(creditCard.getVendor());
        System.out.println(creditCard.getExpiryDate());
        System.out.println(creditCard.getExpiryDateAsString());

        Fairy fairy2=  Fairy.create();
        Company company = fairy2.company();

        System.out.println(company.getDomain());
        System.out.println(company.getEmail());
        System.out.println(company.getName());
        System.out.println(company.getUrl());;
        System.out.println(company.getVatIdentificationNumber());

    }
}
