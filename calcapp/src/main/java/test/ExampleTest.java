package test;

import android.test.InstrumentationTestCase;

/**
 * Created by Pro9 on 2014-03-21.
 */
public class ExampleTest extends InstrumentationTestCase{
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}

/**
 * All test methods MUST start with the “test-” prefix or Android Studio will not
 * detect them as tests and you will get all kinds of weird errors and nothing will work.
 */