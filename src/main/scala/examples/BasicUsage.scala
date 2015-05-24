package examples

import scala.collection.immutable.rrbvector._

object BasicUsage {

  def main(args: Array[String]) {
    // RRBVector exposes the same API as scala.collection.immutable.Vector
    // it provides an effective constant time ++ core operation for large vectors 
    // without loosing the performance of Vector in most cases.
    val vec = RRBVector(1, 2, 3, 4, 5)
    println(vec)
    println(vec ++ vec)
    println(vec(2))
    println(vec map (_+2))

    // It also provides a parallel version that takes advantage of 
    // the improved ++ operation to combine the parallel partial results.
    val parVec = vec.par
    println(parVec)
    
  }

}

