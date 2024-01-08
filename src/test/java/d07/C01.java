package d07;

import org.junit.Assert;
import org.junit.Test;

public class C01 {

    @Test
    public void test01() {
        String expectedData = "selenium";
        String actualData = "selenium";
        Assert.assertEquals(expectedData,actualData);
    }



    @Test
    public void test02() {
        Assert.assertTrue("selenium".contains("E"));
    }



    @Test
    public void test03() {
        Assert.assertFalse("JAVA".contains("E"));//PASS
        Assert.assertFalse("SELENIUM".contains("E"));//FAIL
        System.out.println("test03 method ici calisma durdu");
    }


    @Test
    public void test04() {
        Assert.assertNotEquals("SELENIUM","JAVA");//PASS
        Assert.assertNotEquals("SELENIUM","SELENIUM");//FAIL

    }
}
