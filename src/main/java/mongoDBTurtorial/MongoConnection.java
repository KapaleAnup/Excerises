package mongoDBTurtorial;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class MongoConnection {

    public static void main(String[] args) {

        MongoClient mongo = new MongoClient( "52.66.194.239" , 27017 );
        MongoDatabase database = mongo.getDatabase("dev");
        database.getCollection("Partner");
        System.out.println("Collection created successfully");


        MongoCollection<Document> collection = database.getCollection("Partner");
        System.out.println("Collection Partner selected successfully");

        collection.find();
    }

}
