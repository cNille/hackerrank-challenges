object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var s = sc.next();
    println( s.filter(Character.isUpperCase(_)).length + 1 );
  }
}

