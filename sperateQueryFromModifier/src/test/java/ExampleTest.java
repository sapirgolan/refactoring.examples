import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.hasItemInArray;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.junit.MatcherAssume.assumeThat;


/**
 * Created by I062070 on 16/03/2017.
 */
@RunWith(JUnitQuickcheck.class)
public class ExampleTest {
    private Example classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = Mockito.spy(new Example());
    }

    @Test
    public void checkSecurity_CalledWithDon() throws Exception {
        classUnderTest.checkSecurity(new String[]{"roue", "Don"});
        Mockito.verify(classUnderTest).someLaterCode("Don");
    }

    @Test
    public void checkSecurity_CalledWithJohn() throws Exception {
        classUnderTest.checkSecurity(new String[]{"John", "Don"});
        Mockito.verify(classUnderTest).someLaterCode("John");
    }

    @Test
    public void checkSecurity_CalledWithEmptyString() throws Exception {
        classUnderTest.checkSecurity(new String[]{"Johni", "Dson"});
        Mockito.verify(classUnderTest).someLaterCode("");
    }

    @Property(trials = 250)
    public void notCalledWithSpecialNammes(String[] input) {
        assumeThat(input, not(anyOf(hasItemInArray("John"), hasItemInArray("Don"))));
        classUnderTest.checkSecurity(input);
        Mockito.verify(classUnderTest).someLaterCode("");

    }

}