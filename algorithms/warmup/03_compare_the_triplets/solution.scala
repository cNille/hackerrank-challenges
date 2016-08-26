object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();
    //TODO: Implement
    val aScore = List(a0 > b0, a1 > b1, a2 > b2).map(if(_) 1 else 0).reduceLeft(_+_)
    val bScore = List(a0 < b0, a1 < b1, a2 < b2).map(if(_) 1 else 0).reduceLeft(_+_)
    println(s"$aScore $bScore")
  }
}

