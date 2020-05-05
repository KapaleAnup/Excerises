package javafortestesters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAppEnviroementTest {


    @Test
    public void canGetUrlStatically(){

      Assert.assertEquals("Returns harc coded url", "http://192.123.0.3:67"); TestAppEnv.getUrl();
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("Just the domain","192.123.0.3", TestAppEnv.DOMAIN);
        Assert.assertEquals("Just the Port","67", TestAppEnv.PORT);

    }


}
