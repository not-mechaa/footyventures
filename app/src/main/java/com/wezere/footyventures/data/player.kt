package com.wezere.footyventures.data

data class PlayerStats(
    val name: String,
    val goals: Int,
    val matches: Int,
    val height: Double, // in meters
    val weight: Double  // in kilograms
)
val samplePlayer = PlayerStats(
    name = "Lenny James",
    goals = 35,
    matches = 34,
    height = 1.85,
    weight = 69.5
)
