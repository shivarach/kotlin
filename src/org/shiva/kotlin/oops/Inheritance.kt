package org.shiva.kotlin.oops

fun main() {
    Parent("parent shiva")
    Child("child shiva")
    AnotherChild("child Shiva", 33)
}

interface Base

class BaseImpl : Base

open class Parent(val name: String)
class Child(name: String) : Parent(name) //observe val is not provided

class AnotherChild(name: String, age: Int) : Parent(name) {
}