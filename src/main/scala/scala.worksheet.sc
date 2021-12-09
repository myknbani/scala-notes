extension (int: Int)
  infix def times(lambda: Int => Unit) =
    for
      i <- 0 until int
    do
      lambda(i)

5 times { i =>
  println(s"Hello $i")
}
