package com.example.myapplication

class Myclass {

    companion object{
        @JvmStatic

        fun main(args: Array<String>) {
            println("hello world")
            //declartion of variables in kotlin semicolon is not needed

            val a:Int = 10
            val b:Int = 20
            println(a+b)
            val name:String = "John"
            println(name)
            //var is mutable while val is immutable
            //examples of variables
            var c:Int = 10
            c = 20
            println(c)
            val d:Int = 30
            //d = 40 give you error because it is immutable

            println(d)





        }
    }
}