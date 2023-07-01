package ProducerAndConsumer

object Sorting extends App {

  var a = Array(2, 4, 1, 6, 22, 88)

  println(a.length)

  for (i <- 0 until a.length - 1) {
    println(i)
    for (j <- 0 until a.length - 1) {
      println("fffffj " +j)
      if (a(j) > a(j + 1)) {
        var temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
      }
    }
  }

  println(a.mkString(","))
}
