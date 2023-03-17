package com.example.contextmenu
lateinit var g1:String;
class Overloaded {
    var q1:Float= 0F;
    var q2:Float= 0F;
    var q3:Float= 0F;


    constructor(q1:Float,q2:Float){
    this.q1= q1
    this.q2 = q2

    }
    constructor(q1: Float,q2: Float,q3:Float){
        this.q1= q1
        this.q2 = q2
        this.q3= q3
    }
    open fun calc(arg:Float,arg2:Float):String {
        val flt:Float = 1f
        var ans:String =""

         if(arg==1f){
             val res:Float = arg2-32 * 5/9
             ans = res.toString()

        }

        else if(arg==2f){
             val res:Float = (arg2 * 9/5)+ 32
             ans = res.toString()

        }

         else if(arg==3f){
             val res: Double =  arg2 + 273.15
             ans = res.toString()

        }

         else if(arg==4f){
             val res: Double = arg2 - 273.15
             ans = res.toString()

        }

         else if(arg==5f) {
             val res: Double = arg2 * 1899.1005
             ans = res.toString()


         }
        return ans
    }



}