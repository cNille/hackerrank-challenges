object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var x = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      x(a_i) = sc.nextInt();
    }
    def medianCalc(list: List[Int]) : Double = {
      val l = list.length
      return (list(l / 2) + list(l/2 - 1 + l%2)) / 2.0
    }
    val list = x.sorted.toList
    val q2 = medianCalc(list);
    val (lowerhalf:List[Int], upperhalf:List[Int]) = list.filter(_!=q2).partition(_ < q3)
    val q1 = medianCalc(lowerhalf);
    val q3 = medianCalc(upperhalf);
    println(q1.toInt);
    println(q2.toInt);
    println(q3.toInt);

  }
}
