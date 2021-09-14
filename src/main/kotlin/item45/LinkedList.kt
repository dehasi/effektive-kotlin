package item45

import java.math.BigInteger

sealed class LinkedList<out T>

class Node<T>(
    val head: T,
    val tail: LinkedList<T>
) : LinkedList<T>()

object Empty : LinkedList<Nothing>()

val list: LinkedList<Int> = Node(1, Node(2, Node(3, Empty)))
val list2: LinkedList<String> = Node("A", Node("B", Empty))
