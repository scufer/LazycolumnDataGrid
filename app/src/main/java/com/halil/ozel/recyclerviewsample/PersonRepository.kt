package com.halil.ozel.recyclerviewsample

/**
 * Created by halilozel1903 on 11.05.2025.
 */
class PersonRepository {
    fun getAllData(): List<Person> = listOf(
        Person(
            firstName = "Taylor",
            lastName = "Swift",
            age = 35,
            nation = "USA",
            musicType = "Pop / Country"
        ),
        Person(
            firstName = "Nicki",
            lastName = "Minaj",
            age = 42,
            nation = "Trinidad and Tobago",
            musicType = "Hip Hop / Rap"
        ),
        Person(
            firstName = "Tate",
            lastName = "McRae",
            age = 21,
            nation = "Canada",
            musicType = "Pop"
        ),
        Person(
            firstName = "Gracie",
            lastName = "Abrams",
            age = 25,
            nation = "USA",
            musicType = "Indie Pop"
        ),
        Person(
            firstName = "Becky",
            lastName = "G",
            age = 28,
            nation = "USA",
            musicType = "Pop / Latin"
        ),
        Person(
            firstName = "Karol",
            lastName = "G",
            age = 34,
            nation = "Colombia",
            musicType = "Reggaeton / Latin Trap"
        ),
        Person(
            firstName = "Selena",
            lastName = "Gomez",
            age = 32,
            nation = "USA",
            musicType = "Pop"
        ),
        Person(
            firstName = "Natti",
            lastName = "Natasha",
            age = 38,
            nation = "Dominican Republic",
            musicType = "Reggaeton / Latin Pop"
        ),
        Person(
            firstName = "Megan",
            lastName = "Thee Stallion",
            age = 30,
            nation = "USA",
            musicType = "Hip Hop / Rap"
        )
    )
}