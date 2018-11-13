package Functions.extensionFun

/**
 * Created by Chiradeep Banerjee
 * Email : chiradeep.banerjee72@gmail.com.
 */

var list:MutableList<Int>? = null //Initialized with nullable value


fun main(args:Array<String>){
    list = mutableListOf(1,2,3)
    list!!.swap(index1 = 1,index2 = 2) //!! non-null cast

    print(list) //Swapped function called

    list!!.printelement()
}


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun MutableList<Int>.printelement(){
    repeat(this.size,{
        print("\nElement no $it and element val ${this.get(it)}")
    })
}
