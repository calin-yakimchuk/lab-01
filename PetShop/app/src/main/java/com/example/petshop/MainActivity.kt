package com.example.petshop

import Cat
import Dog
import Happy
import Pet
import Pettable
import Sad
import Scorpion
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        val pettablePets = mutableListOf<Pettable>()
        pettablePets.add(cat)
        pettablePets.add(dog)
        //pettablePets.add(scorpion) // raises error

        // mood tests
        val happyMood = Happy("2026-09-04")
        val sadMood = Sad("2026-09-03")

        println(happyMood.getMood())
        println(sadMood.getMood())

        println(cat.speak())
        dog.pet()
    }
}

