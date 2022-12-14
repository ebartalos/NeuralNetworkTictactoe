package ai.neurons

open class Neuron {

    var value = 1.0

    open fun activationMethod(vector: Double): Double {
        return vector
    }

    fun calculate(vector: Double) {
        value = activationMethod(vector)
    }

    open fun derivative(): Double {
        return value
    }
}