package mintproflow;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo {

    @Test
    public demo demoerter(){

        demo de = new demo();
        Calendar cal = Calendar.getInstance();
      cal.getTime().toString().split(" ");
            return de;

    }

    @Test
    public void getCurrenttime(){

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj).toString());
      //  return df.format(dateobj) ;
    }

    @Test
    public void getCurrenttimeUpdate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Calendar calobj = Calendar.getInstance();
      //  calobj.setTime(new Date());
       // calobj.add(Calendar.HOUR_OF_DAY,1);
       calobj.add(Calendar.HOUR_OF_DAY, 1);
        System.out.println(df.format(calobj.getTime()).toString());
      //  return df.format(calobj.getTime());
    }
}
