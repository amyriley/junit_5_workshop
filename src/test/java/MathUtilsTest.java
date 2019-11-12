import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running MathUtils")
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("add method")
    class AddTest {

        @Test
        @DisplayName("when adding two positive numbers")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1),
                    "should return the right sum");
        }

        @Test
        @DisplayName("when adding two negative numbers")
        void testAddNegative() {
            assertEquals(-2, mathUtils.add(-1, -1),
                    "should return the right sum");
        }
    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2,2)),
                () -> assertEquals(0, mathUtils.multiply(2,0)),
                () -> assertEquals(-2, mathUtils.multiply(2,-1))
        );
    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "Divide by 0 should throw");
    }

    @Test
    @DisplayName("Testing compute circle radius method")
    void testComputeCircleRadius() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return correct circle area");
    }
}