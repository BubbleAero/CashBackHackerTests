import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
        private final CashbackHackService service = new CashbackHackService();

        @Test
        public void shouldReturnZero() {
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainForAmountLessThanBoundary() {
            int amount = 500;
            int expected = 500;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainForAmountGreaterThanBoundary() {
            int amount = 1500;
            int expected = 500;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainForZeroAmount() {
            int amount = 0;
            int expected = 1000;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldRemainForExactBoundaryAmount() {
            int amount = 2000;
            int expected = 1000;
            int actual = service.remain(amount);
            Assert.assertEquals(expected, actual);
        }
    }

