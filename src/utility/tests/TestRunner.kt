package utility.tests

import org.junit.runner.JUnitCore

    fun main(args: Array<String>) {
        val result = JUnitCore.runClasses(TestLadderProducer::class.java)

        for (failure in result.getFailures()) {
            System.out.println(failure.toString())
        }

        System.out.println(result.wasSuccessful())
    }