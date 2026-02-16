package is.hi.hbv202g.ass5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack = new IntStack();

        assertFalse(stack.isFull());
    }

}
