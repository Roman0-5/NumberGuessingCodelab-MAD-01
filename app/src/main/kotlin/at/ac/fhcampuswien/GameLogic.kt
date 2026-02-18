package at.ac.fhcampuswien

import at.ac.fhcampuswien.GuessResult

class GameLogic(initialDigitsToGuess: Int) {
    // Kotlin has getters and setters on public by default
    var digitsToGuess = initialDigitsToGuess
        private set // declare private setter
}