package koans

import org.junit.Assert
import org.junit.Test

class JavaToKotlinKtTest {
    @Test fun collection() {
        Assert.assertEquals("[1, 2, 3, 42, 555]", toJSON(listOf(1, 2, 3, 42, 555)))
    }
}