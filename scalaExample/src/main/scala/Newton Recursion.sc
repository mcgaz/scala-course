object session {
  def abs(x: Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x: Double) =
//    abs(guess * guess - x) < x / 100
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x: Double) = (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)
}

session.sqrt(2)
session.sqrt(0.001)
session.sqrt(0.1e-20)
session.sqrt(1.0e20)
session.sqrt(1e60)
session.sqrt(1e-6)

def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n-1)

def factorial(n: Int): Int = {
  def loop(acc: Int, n: Int): Int =
    if (n == 0) acc
    else loop(acc * n, n - 1)
  loop(1, n)
}


