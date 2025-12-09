package SealedClass

import java.lang.classfile.CodeTransform

sealed class Result <T> {
    data class Success<T> (val data : T) : Result<T>()
    data class Error<T>(val error: Throwable) : Result<T>()
}

//extension function
inline fun <T> Result<T>.onSuccess(
    block :(T) -> Unit
) : Result<T>{
    if(this is Result.Success) block(this.data)
    return this
}

inline fun <T> Result<T>.onError(
    block :(Throwable) -> Unit
) : Result<T>{
    if(this is Result.Error) block(this.error)
    return this
}

inline fun <A,T> Result<T>.map (
    transform :(T) -> A
) : Result<A>{
    return when(this){
        is Result.Success -> Result.Success(transform(data))
        is Result.Error -> Result.Error(error)
    }
}

