package SealedClass

sealed class State{
    object Success : State()
    object Loading : State()
    object Error : State()
}

fun <T> genericType(param : T) : T{
    return param;
}

class Box<T>(private val item : T){
    fun getName() : T{
        return item;
    }
}

class Pair<K,V>(val key : K,val value : V)

//fake du lieu tra ve 1 so tu 1 den 10
fun fakeData() : Result<Int>{
    return Result.Success((1 .. 10).random())
}

fun main() {
    val state = State.Loading
    checkState(state)

    fakeData().onSuccess {number ->
        println(number)
    }.onError {
        println("Something wrong")
    }.map { it * 10 }
        .onSuccess {
            println(it)
        }
//    println(genericType(10))

//    val box = Box("hoa");
//    println(box.getName())

//    val pair = Pair("hoa",12)
//    println(pair.key)
//    println(pair.value)



}

fun String.toStringCustom() : String{
    return "Name $this"
}

fun checkState(state: State){
    when(state){
        is State.Success -> {
            println("Success")
        }
        is State.Loading -> {
            println("Loading")
        }
        is State.Error -> {
            println("Error")
        }
    }
}