package com.example.myflipcard2

class FlipCard2 (var rank:String, var suit: String, var flip: Boolean=true){
    fun flip()
    {
        flip = !flip;
    }

    fun printDetails() {
        if(flip) {
            println("$rank $suit")
        }else {
            println("----")
        }
    }
}