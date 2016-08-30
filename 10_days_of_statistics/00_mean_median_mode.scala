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
    val arrSort = arr.sorted

    // Calc mean
    val mean = arr.sum / l.toFloat
    println(mean)

    // Sort array

    // Calc median
    val median = (arrSort(l/2) + arrSort(l/2-1+l%2)) / 2.0
    println(median)

    // Calc mode
    val modeArr = arr.groupBy(identity).mapValues(_.size).toList.sortBy( x => (-x._2, x._1))
    println(modeArr(0)._1)


  }
}

