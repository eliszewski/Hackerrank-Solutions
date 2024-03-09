package leetcode


class SolutionsE {
    fun main(){
        val y = arrayOf(1,2,3)
        val newArr = y.copyOf(y.size * 2)
        for ((counter, i) in (y.size..newArr.size).withIndex()){
            newArr[i] = y[counter];
        }
        println(newArr)
    }
}