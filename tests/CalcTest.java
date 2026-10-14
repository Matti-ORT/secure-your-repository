import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CalcTest {
    @Test
    void CalcTestClientNormal() {
        // Arrange
        Calc calc = new Calc();
        // Act
        calc.doIt(null, 1);
        // Assert
        assertNotNull(calc);
    }
    @Test
    void CalcTestClientFidele() {
        //Arrange
        Calc calc = new Calc();
        //Act
        calc.doIt(null, 2);
        //Assert
        assertNotNull(calc);
    }

}