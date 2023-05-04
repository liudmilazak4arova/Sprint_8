import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AccontTest {
    private String name;
    private boolean isEmboss;

    public  AccontTest(String name, boolean isEmboss){
        this.name = name;
        this.isEmboss = isEmboss;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] data = new Object[][]{
                {"L a", true},
                {"Lion Aaaaaaaaaaaaa", true},
                {"L a ", false},
                {"hfgkjshgkjfhdg  gahjksglkdfhglkdjfshgkjfdh", false},
                {" Lion Cats", false},
                {"Lion Cats", true},
                {"Lion", false}
        };
        return Arrays.asList(data);
    }

    @Test
    public void legth2Test(){
        Account account = new Account(name);
        boolean actualIsEmboss = account.checkNameToEmboss();
        Assert.assertEquals(isEmboss, actualIsEmboss);
    }
}
