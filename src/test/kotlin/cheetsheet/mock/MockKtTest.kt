package cheetsheet.mock

import cheetsheet.factory.FoodOrder
import cheetsheet.factory.testFunction
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class MockKtTest {
    @MockK
    lateinit var foodMock: FoodOrder

    @Test
    fun `top level function mocking`() {
        mockkStatic("cheetsheet.mock.MockKt")
        every { add(any(), any()) } answers { 1 }

        val add = add(1, 1)
        val add1 = add(1, 3)

        assertThat(add).isEqualTo(1)
        assertThat(add1).isEqualTo(1)
    }

    @Test
    fun `companion object mocking`() {
        mockkObject(FoodOrder)
        every { FoodOrder.normalBread() } answers { FoodOrder.specialBread() }

        val normalBread = FoodOrder.normalBread()
        assertThat(normalBread.bread).isEqualTo("specialBread")

        verify(exactly = 1) { FoodOrder.normalBread() }

        testFunction()
        verify(exactly = 1) { FoodOrder.specialBread("qwer") }
    }

    @Test
    fun `class mocking`() {
        every { foodMock.a() } answers {}
        foodMock.a()

        verify(exactly = 1) { foodMock.a() }
    }
}