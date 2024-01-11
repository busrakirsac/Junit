package d12;

import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01 extends TestBase {

    @Test
    public void test01() {

        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));

        String userHome = System.getProperty("user.home");
        System.out.println("userHome = " + userHome);


        ///Users/busrakirsac/Desktop/Deneme.txt

        String ortakYol = "/Desktop/Deneme.txt";

        String path = userHome+ ortakYol;

        boolean exists = Files.exists(Paths.get(path));
        Assert.assertTrue(exists);
    }
}
