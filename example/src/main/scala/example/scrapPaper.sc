import scala.annotation.tailrec

def sum(a: Int, b: Int): Int = {
    @tailrec
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, a + acc)
    }
    loop(a, b)
}

sum(5,10)







def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)

