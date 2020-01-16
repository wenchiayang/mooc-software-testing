package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    GettingStarted gs;

    @BeforeEach
    public void setup() {
        gs = new GettingStarted();
    }

    @Test
    public void addFiveTo20() {
        int result = gs.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = gs.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = gs.addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    @Test
    public void addFiveToMinusFive() {
        int result = gs.addFive(-5);
        Assertions.assertEquals(0, result);
    }
}
