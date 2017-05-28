package koans

import org.junit.Assert
import org.junit.Test

class HelloWorldKtTest {
    @Test fun testOk() {
        Assert.assertEquals("OK", start())
    }
}