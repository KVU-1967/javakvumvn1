import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javakvu.BonusService;

public class BonusServiceTest {

    @Test
    public void testRegisteredUnderlimit() {
        BonusService service = new BonusService();

        long amount = 1_000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredOverThelimitlimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredUnderlimit() {
        BonusService service = new BonusService();

        long amount = 1_000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredOverThelimitlimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //System.out.println("1. " + expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }
}
