package com.bridgelabz.Day34;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

class AppTest extends TestCase
{
        public AppTest( String testName )
        {
            super( testName );
        }

        public static Test suite()
        {
            return (Test) new TestSuite( AppTest.class );
        }

        public void testApp()
        {
            assertTrue( true );
        }
}