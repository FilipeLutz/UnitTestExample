package com.example.unittestexample

import com.example.unittestexample.objects.TheThing
import org.junit.Assert.*
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.Date

class ExampleUnitTest {

    private fun printTimestamp() {
        val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
        println("Test run at: $timestamp")
    }

    @Test
    fun addition_isCorrect() {
        printTimestamp()
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testTwo() {
        printTimestamp()
        assert(1 > 0)
    }

    @Test
    fun testMethodA_ReturnsTrue() {
        val thing = TheThing()
        assertTrue(thing.methodA())
    }

    @Test
    fun testMethodB() {
        printTimestamp()
        val a = TheThing()
        val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
        val b = a.methodB(cars)
        assertNotEquals("BMW", b)
    }

    @Test
    fun testMultiplyXY_Multiplication() {
        printTimestamp()
        val thing = TheThing()
        val result = thing.multiplyXY(3, 5)
        assertEquals(15, result)
    }

    @Test
    fun testMultiplyXY_PositiveResult() {
        printTimestamp()
        val thing = TheThing()
        val result = thing.multiplyXY(3, 5)
        assert(result > 0)
    }
}