package mongoDBTurtorial;


import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.QueryBuilder;
import com.mongodb.operation.OrderBy;
import org.apache.commons.lang3.RandomStringUtils;

public class MongoDBConnection {


    static MongoClient mongo;
    public static String Flashotp;


 public  static String getMobileNumber(){
     //RandomStringUtils.randomNumeric(9);
    String mobile= "8767510435";
    System.out.println("");
    return mobile;
 }

    public static DBObject getWhereClause_1()
    {
        BasicDBObjectBuilder wherebuilder = BasicDBObjectBuilder.start();
        wherebuilder.append("mobile", "1"+getMobileNumber());
        DBObject where = wherebuilder.get();
        System.out.println("Fetching Otp for: " + where.toString());
        return where;
    }


    public static void main(String[] args) throws UnknownHostException {


        MongoClient mongo = new MongoClient("service.magnet.stage.mintpro.in", 27017);
        System.out.println("Connecting to server...");
        DB db = mongo.getDB("authService");
        DBCollection collection = db.getCollection("otp");
        DBObject orderBy = new BasicDBObject("createdAt", -1);
        DBObject where = getWhereClause_1();
        DBCursor cursor = collection.find(where).sort(orderBy).limit(1);
        DBObject recievedData = cursor.next();
        DBObject rec = cursor.curr();

        if(recievedData.containsField("otp")) {
            System.out.println(recievedData.get("otp"));
            Flashotp = recievedData.get("otp").toString();
        }else {
            System.out.println("no otp found in collection "+ recievedData);
        }


    }

}
