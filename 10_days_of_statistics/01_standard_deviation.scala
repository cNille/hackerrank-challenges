object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      arr(a_i) = sc.nextInt();
    }
 
    // Variables needed.
    val l = arr.length
    val mean = arr.sum / l.toFloat

    // Variation
    val variation = (arr.map( x => (x - mean) * (x - mean) ).sum / l)

    // Square root methods.
    def square(x:Double):Double = x*x
    def abs(x: Double) = if (x >= 0) x else -x
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)
    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2
    def isGoodEnough(guess: Double, x: Double) =
      abs(square(guess) - x) < 0.001
    def sqrt(x: Double) = sqrtIter(1.0, x)

    // Std
    val std = sqrt(variation);

    // Module-rounded pattern. Might miss a 1*10^-10.... But kind of works.
    val std_rounded = std - (std % 0.01);
    print(std_rounded);

  }
}
