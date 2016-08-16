object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val t = sc.nextInt();

    for(i <- 1 to t){
      val n = sc.nextInt();
      val k = sc.nextInt();
      val delayed = ( for(j <- 1 to n) yield sc.nextInt() ).filter(_ > 0).size;
      println( if( delayed > n-k) { "YES" } else { "NO" } )
    }
  }
}
