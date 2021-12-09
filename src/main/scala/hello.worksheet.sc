print("Hello world")
println("Hi world")

val x = 1
x * 2

val y =
  if x == 1 then 4
  else if x == 2 then 5
  else 0

case class Person(name: String, weight: Int)

val foo = List(
  Person("Mike", 3),
  Person("hala", 5),
  Person("bira", 4),
  Person("bira", 2)
)

foo.sortBy(_.name)

for
  grr <- Some(Some(3))
  mrr <- grr
yield mrr

for i <- 1 to 5 yield i * i
