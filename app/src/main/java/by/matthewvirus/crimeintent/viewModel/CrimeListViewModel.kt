package by.matthewvirus.crimeintent.viewModel

import androidx.lifecycle.ViewModel
import by.matthewvirus.crimeintent.model.Crime

class CrimeListViewModel: ViewModel() {

    var crimesList = mutableListOf<Crime>()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crime.requiresPolice = i % 2 == 0
            crimesList += crime
        }
    }
}