object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var x = new Array[Int](n);
    var w = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      x(a_i) = sc.nextInt();
    }
    for(a_i <- 0 to n-1) {
      w(a_i) = sc.nextInt();
    }

    val res = x.zip(w).map( x => x._1 * x._2).sum / w.sum.toFloat
    val rounded = Math.round(res * 10.0) / 10.0
    println(rounded)
  }
}
