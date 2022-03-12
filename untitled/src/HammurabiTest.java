import org.testng.Assert;
import org.testng.annotations.Test;



public class HammurabiTest {

    @Test
    public void immigrantsTest() {
        //given
        int acres = 200;
        int amountOfGrain = 500;
        int population = 200;
        int expected =1;
        //when
        int result = Hammurabi.immigrants(population,acres,amountOfGrain );
        //then
        Assert.assertEquals(expected,result);
    }


        @Test
    public final void testImmigrants1() {
        int imm = Hammurabi.immigrants(10, 1200, 500);
        Assert.assertEquals( 25, imm);
    }


    @Test
    void starvationDeaths() {
    }

    @Test
    public final void testStarvationDeaths() {
        int deaths = Hammurabi.starvationDeaths(100, 1639);
        Assert.assertEquals(19, deaths);
        deaths = Hammurabi.starvationDeaths(100, 2500);
        if (deaths < 0) {
            Assert.fail("You starved a negative number of people!");
        }
    }

    @Test
    void uprising() {

    }

    @Test
        public void testUprising() {
        Assert.assertTrue(Hammurabi.uprising(1000, 451));
        Assert. assertFalse(Hammurabi.uprising(1000, 449));
    }

}