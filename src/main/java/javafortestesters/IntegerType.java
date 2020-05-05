package javafortestesters;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerType {

    @Test
    public void IntegerTypes(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println("* 'byte' range:"+ Byte.MIN_VALUE + "to"+ Byte.MIN_VALUE);
        System.out.println("* 'Short' range:"+Short.MIN_VALUE + "to"+ Short.MIN_VALUE);
        System.out.println("* 'int' range:"+Integer.MIN_VALUE + "to"+ Integer.MIN_VALUE);
        System.out.println("* 'long' range:"+Long.MIN_VALUE + "to"+ Long.MIN_VALUE);
        System.out.println("* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);
        System.out.println( "* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);

        aLongHas8Bytes = 0L; //add suffix L for long
        Assert.assertEquals(0, aLongHas8Bytes);

        aByteHas1Byte = 0xA; //add prefix 0x for Hex
        Assert.assertEquals(10,aByteHas1Byte);
        anIntHas4Bytes = 010; //add 'zero' prefix for Octal
        Assert.assertEquals(8, anIntHas4Bytes);
        aByteHas1Byte = 0b0010; // Java 1.7 added 0b 'zero b' for binary
        Assert.assertEquals(aByteHas1Byte, 2);
// Java 1.7 allows underscores for readability
        aLongHas8Bytes = 9_000_000_000L; // 9 000 million
        Assert.assertEquals(9000000000L, aLongHas8Bytes);
    }


    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        Assert.assertEquals(11, ++num);
        Assert.assertEquals(10, --num);
        Assert.assertEquals(10, num++, "assertion shuld have failed");
        Assert.assertEquals(11, num);
        Assert.assertEquals(11, num--);
        Assert.assertEquals(10, num);


        System.out.println(++num);
        System.out.println(num++);
    }


    @Test
    public void booleanOperatorsExplored(){
        Assert.assertTrue(4==4);
        Assert.assertTrue(4!=5);
        Assert.assertTrue(3<4);
        Assert.assertTrue(5>4);
        Assert.assertTrue( 6 >= 6);
        Assert.assertTrue( 7 >= 6);
        Assert.assertTrue( 8 <= 8);
        Assert.assertTrue( 8 <= 9);

        Assert.assertTrue(!false);

        boolean thruth = true;
        Assert.assertFalse(!thruth);

    }

    @Test
    public void someStringMethods(){
        String text = "abcdef";
        Assert.assertEquals(6, text.length());
        Assert.assertTrue(text.compareToIgnoreCase("ABCDEF")==0);
        Assert.assertTrue(text.contains("cd"));
        Assert.assertTrue(text.startsWith("abc"));

        Assert.assertEquals('c', text.charAt(2));
        Assert.assertEquals("ef", text.substring(4));
        System.out.println(text.equals("abcdef"));
        System.out.println(text.concat("Test"));
    }


    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";
        url =  url.startsWith("http") ? url : addHttp(url);

        Assert.assertTrue(url.startsWith("http://"));
        Assert.assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url){
        return "http://"+ url;
    }

    @Test
    public void shortCodeValidation(){
        Assert.assertEquals("United Kingdom", shortCode("UK"));
        Assert.assertEquals("Rest of world",shortCode("ts"));
    }

    @Test
    public String shortCode(String codes){
        String shortcodes;

        switch (codes) {
            case "UK":
                shortcodes = "United Kingdom";
                break;
            case "US":
                shortcodes ="“United States";
                break;
            case "USA":
                shortcodes = "United States";
                break;
            case "FR":
                shortcodes = "France";
                break;
            case "SE":
                shortcodes ="Sweden";
                break;

                default:
                    shortcodes =  "Rest of world";
                            break;
        }
        return shortcodes;
    }

}
