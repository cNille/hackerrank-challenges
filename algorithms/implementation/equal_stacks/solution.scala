object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n1 = sc.nextInt();
    var n2 = sc.nextInt();
    var n3 = sc.nextInt();
    var h1 = new Array[Int](n1);
    for(h1_i <- 0 to n1-1) {
      h1(h1_i) = sc.nextInt();
    }
    var h2 = new Array[Int](n2);
    for(h2_i <- 0 to n2-1) {
      h2(h2_i) = sc.nextInt();
    }
    var h3 = new Array[Int](n3);
    for(h3_i <- 0 to n3-1) {
      h3(h3_i) = sc.nextInt();
    }
    // TODO: Implement solution
  }
}
