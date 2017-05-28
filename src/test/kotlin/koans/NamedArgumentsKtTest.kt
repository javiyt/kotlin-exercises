package koans

import org.junit.Assert
import org.junit.Test

class NamedArgumentsKtTest {
    @Test fun testJoinToString() {
        Assert.assertEquals("[yes, no, may be]", joinOptions(listOf("yes", "no", "may be")))
    }
}