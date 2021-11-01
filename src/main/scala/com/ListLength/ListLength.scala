package com.ListLength

class ListLength {

  def tailRecursion(list: List[Int], accumulator: Int): BigInt =
    if (list.isEmpty) accumulator else tailRecursion(list.tail,accumulator + 1)

}
object run extends App{
  val n = new ListLength
  println(n.tailRecursion(List(1,2,3,4,5),0))
}
