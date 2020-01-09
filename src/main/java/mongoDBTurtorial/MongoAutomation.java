package mongoDBTurtorial;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoAutomation {

    public static void main(String args[]) throws Exception{

        try {
            MongoClient mongoClient = new MongoClient("52.66.194.239", 27017);

            MongoDatabase database = mongoClient.getDatabase("authService");

            MongoCollection collection = database.getCollection("otp");

            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("mobile","8767510435");


            FindIterable cursor = collection.find(searchQuery);


            for (Object document : cursor){

                System.out.println(document);
            }
           /* while (cursor.hasNext()){
                int i=1;
                System.out.println(cursor.next());
                i++;
            }
*/
            System.out.println("Connected to Database");
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Server is ready");


      /*  try {
            MongoClient mongoClient = new MongoClient( "52.66.194.239" , 27017);

            MongoDatabase db = (MongoDatabase) mongoClient.getDatabase("turtlemint");

            DBCollection dbCollection = (DBCollection) db.getCollection("Partner");

            BasicDBObject searchquary = new BasicDBObject();
            searchquary.put("dpNo","NumberLong(196)");

            DBCursor cursor = dbCollection.find(searchquary);

            StringMethods response = null;
            try {
                while(cursor.hasNext()) {
                    response = response.concat(cursor.next().toString());
                }
            }
            finally {
                cursor.close();
            }
*/
            //Asserting the fetched response with expected value
           // Assert.assertTrue(response.contains("ExpectedValue"));

        /*} catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
