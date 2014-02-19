package us.tonym.cassandra_test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import us.tonym.cassandra_test.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
		String[] args = new String[5];
		App.main(args);
        assertTrue( true );
    }
}