object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var x = new Array[Int](n);
    var y = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      x(a_i) = sc.nextInt();
    }
    for(a_i <- 0 to n-1) {
      y(a_i) = sc.nextInt();
    }
    def medianCalc(list: List[Int]) : Double = {
      val l = list.length
      return (list(l / 2) + list(l/2 - 1 + l%2)) / 2.0
    }

    val l = x.zip(y).map( z => List.fill(z._2)(z._1) ).flatten
    val list = l.sorted.toList
    val q2 = medianCalc(list);
    val (lowerhalf:List[Int], upperhalf:List[Int]) = list.filter(_!=q2).partition(_ < q2)
    val q1 = medianCalc(lowerhalf);
    val q3 = medianCalc(upperhalf);
    println(q3 - q1);
    println(q3);
    println(q1);
    println(lowerhalf);
    println(upperhalf);

  }
}
