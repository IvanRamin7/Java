import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        FizzBuzz fizzBuzz = new FizzBuzz(); //old version
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); //new version

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
