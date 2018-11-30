import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LargestNumberTest.
 *
 * @author  Dave Avis
 * @version 11.29.2018
 */
public class LargestNumberTest
{
    @Test(timeout=2000)
    public void getLargestTest()
    {
        String[] input = {
                "564 33 654 8321 15",
                "10 225 4557 254",
                "22 39 22 45 33 11 19",
                "1 2 3 4 5 6 7",
                "-10 9 1 8 -999",
                "-1 2 3 4 5 6 7",
                "0 34 45 23 12"
            };
        int[] expected = { 8321, 4557, 45, 7, 9, 7, 45 };
        
        for( int i = 0; i < input.length; i++ )
        {
            assertEquals( "getLargest( \"" + input[i] + "\" ) failed.", expected[i], LargestNumber.getLargest( input[i] ) );
        }
    }
}
