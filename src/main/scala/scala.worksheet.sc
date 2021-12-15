extension (int: Int)
  infix def times(lambda: Int => Unit) =
    for
      i <- 0 until int
    do
      lambda(i)

5 times { i =>
  println(s"Hello $i")
}

def add(x: Int, y: Int) = x + y

val sub = (x: Int, y: Int) => x - y

val increment = add(1, _)
val decrement = sub(_, 1)

increment(30)
decrement(30)

def intuition = add(1, _)

intuition(30)
