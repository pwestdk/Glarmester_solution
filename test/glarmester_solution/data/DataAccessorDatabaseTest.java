package glarmester_solution.data;

import glarmester_solution.logic.FrameType;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

public class DataAccessorDatabaseTest {
    
    public DataAccessorDatabaseTest() {
    }
    
    // Fields
    DataAccessorDatabase DAD = new DataAccessorDatabase();

    @Test
    public void testGetGlassprice() {
        double epectedResult = DAD.getGlassprice();
        assertThat(epectedResult, is(300.0));
    }
    
    @Test
    public void testGetFramePrice() {
        double epectedResult = DAD.getFramePrice(FrameType.Simple);
        assertThat(epectedResult, is(100.0));
    }
    
    @Test (expected = NullPointerException.class)
    public void testGetFramePriceNull() {
        double epectedResult = DAD.getFramePrice(null);
    }
    
}
