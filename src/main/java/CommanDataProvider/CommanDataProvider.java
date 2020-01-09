package CommanDataProvider;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class CommanDataProvider {

    @Test
    public void getData(Method method)
    {
        System.out.println(method.getName());
    }
}
