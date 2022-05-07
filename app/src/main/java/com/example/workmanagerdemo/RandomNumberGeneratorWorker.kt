package com.example.workmanagerdemo

import android.util.Log
import kotlin.random.Random

class RandomNumberGeneratorWorker {
    val numeroRandom = Random(30)

    fun generarSecuencia(){
        var i=0
        while(i<5){
            try{
                Thread.sleep(1000)
                val mRandoNumber = numeroRandom.nextInt(100)
                Log.i("Numero Random", "Numero aleatorio: $mRandoNumber")
                i++
            }catch (e:Exception){
                Log.i("Numero Random", "Error")
            }
        }
    }
}