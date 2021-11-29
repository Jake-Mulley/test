import org.junit.Test;
import static org.junit.Assert.assertEquals;
import example.a03.MessageUtil;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }

    @Test
    public void testChecker() {
        assertEquals(true, messageUtil.emailFormCheck("some@thing"));
    }
}