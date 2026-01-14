var age: Int = 18
    set(value) {
        if ((value > 0) and (value < 100))
            field = value
    }

fun main () {
    println(age)
    age =25
    println(age)
    age = -345
    println(age)
}