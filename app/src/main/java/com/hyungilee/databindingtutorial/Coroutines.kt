package com.hyungilee.databindingtutorial

import kotlinx.coroutines.*

object Coroutines {

    // after executing suspend function then get the result from callback.
    fun<T: Any> ioThenMain(work: suspend(() -> T?), callback: (T?)->Unit) =

        CoroutineScope(Dispatchers.Main).launch {
            val data = CoroutineScope(Dispatchers.IO).async rt@{
                return@rt work()
            }.await()
            callback(data)
        }

}