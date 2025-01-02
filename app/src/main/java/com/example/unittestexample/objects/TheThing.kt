package com.example.unittestexample.objects

class TheThing {

    fun methodA(): Boolean {
        return true
    }

    /***
     * Takes in an array and returns the longest word
     */
    fun methodB(x: Array<String>): String {
        return x.maxByOrNull { it.length } ?: ""
    }

    fun multiplyXY(x: Int, y: Int): Int {
        return if (methodA()) x * y else 0
    }
}