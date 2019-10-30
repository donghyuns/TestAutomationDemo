package selenium.testng.tests;

import org.testng.annotations.*;

public class TestBase {
    @BeforeTest
    public void initFramework() throws Exception {
        //
    }

    @BeforeTest
    public void initTests() throws Exception{
        //
    }

    @BeforeMethod
    public void setUpTests() {
        try {
            //
        } catch (Exception e) {
            //
        }
    }

    @AfterMethod
    public void tearDownTests() throws Exception{
        try {
            try {
              //
            } catch (Exception f){ };
            //
        } catch (Exception e) {
            //
        }
    }

    @AfterTest
    public void cleanUp() {
        try {

            try {
                //
                //
            } catch (Exception f){ }
            //
        } catch (Exception e) {
            //
        }
    }

}
