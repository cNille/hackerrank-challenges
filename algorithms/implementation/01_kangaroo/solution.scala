
def main(args: Array[String]) { val sc = new java.util.Scanner (System.in);
  var x1 = sc.nextInt();
  var v1 = sc.nextInt();
  var x2 = sc.nextInt();
  var v2 = sc.nextInt();
  
  def kangooCalc (x1: Int, v1: Int, x2: Int, v2: Int): Boolean = {
      if( (x1 > x2 && v1 >= v2) || (x1 < x2 && v1 <= v2)  ){
          false
      } else if( x1 == x2) {
          true
      } else { 
          kangooCalc(x1 + v1, v1, x2 + v2, v2)
      }
  }
  
  val res = kangooCalc(x1,v1,x2,v2);
  if( res ) {
      println("YES");
  } else {
      println("NO");
  }
}
