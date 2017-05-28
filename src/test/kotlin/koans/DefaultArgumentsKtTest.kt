package koans

import org.junit.Assert
import org.junit.Test

class DefaultArgumentsKtTest {
    @Test fun testDefaultAndNamedParams() {
        Assert.assertEquals(listOf("a42", "b1", "C42", "D2"), useFoo())
    }
}