package baeldung;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.jvm.hotspot.utilities.Assert;

public class CompareTwoJSONObjects {


    public static void main(String[] args) {
        // ObjectMapper class has method readTree which wll provide jsonNode as a return type and then we can compare.

        // It support for simple josn object:
       /* {
            "employee":
            {
                "id": "1212",
                    "fullName": "John Miles",
                    "age": 34
            }
        }*/


       //It support for JSON Objects with a Nested Element:
/*

        {
            "employee":
            {
                "id": "1212",
                    "fullName":"John Miles",
                    "age": 34,
                    "contact":
                {
                    "email": "john@xyz.com",
                        "phone": "9999999999"
                }
            }
        }
*/

        // It supports for JSON Objects Containing a List Element:

        /*{
            "employee":
            {
                "id": "1212",
                    "fullName": "John Miles",
                    "age": 34,
                    "skills": ["Java", "C++", "Python"]
            }
        }*/

        String s1 = "{ \n" +
                "    \"employee\":\n" +
                "    {\n" +
                "        \"id\": \"1212\",\n" +
                "        \"fullName\":\"John Miles\",\n" +
                "        \"age\": 34,\n" +
                "        \"contact\":\n" +
                "        {\n" +
                "            \"email\": \"john@xyz.com\",\n" +
                "            \"phone\": \"9999999999\"\n" +
                "        }\n" +
                "    }\n" +
                "}";


        String s2 = "{\n" +
                "    \"employee\":\n" +
                "    {\n" +
                "        \"id\": \"1212\",\n" +
                "        \"age\": 34,\n" +
                "        \"fullName\": \"John Miles\",\n" +
                "        \"contact\":\n" +
                "        {\n" +
                "            \"email\": \"john@xyz.com\",\n" +
                "            \"phone\": \"9999999999\"\n" +
                "        }\n" +
                "    }\n" +
                "}";


        ObjectMapper objectMapper = new ObjectMapper();

        try {
           JsonNode node1 =  objectMapper.readTree(s1);
           JsonNode node2 =  objectMapper.readTree(s2);

            org.testng.Assert.assertEquals(node1,node2,"Response doesn't match");
            System.out.println("Both json are correct.");

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
