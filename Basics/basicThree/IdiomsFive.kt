package Basics.basicThree

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

/**
Extension Function
 */

fun main(args: Array<String>) {
   "My name is Chiradeep".giveMeLastWord()
    var a = 10
    a.addHundred()
    print("\n"+a)
}

fun String.giveMeLastWord(){
    print(this.substring(this.lastIndexOf(' ')))
}

fun Int.addHundred(){
    this + 100
}