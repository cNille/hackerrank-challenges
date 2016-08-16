object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }

    /**
    * Pure solution
    */
      
    // Retrievies all sums of pairs that are divisible of k 
    // in a Vector(Vector(...)). 
    val arr = for(a_i <- 0 to n-2) yield { 
      for( 
        a_j <- a_i+1 to n-1 
        if (a(a_i) + a(a_j)) % k == 0 
      ) yield { 
        a(a_i) + a(a_j) 
      } 
    };

    // Arr is a 2d vector with numbers divisible with k. Sum their lengths to
    // get a total nbr of pairs divisible with k.
    val nbrs = for( ind <- 0 to arr.length-1) yield ( arr(ind).length );
    val tot = nbrs.foldLeft(0)( (x,y) => x + y );
    println(s"$tot");

    /**
    * UnPure solution
    */
    /*
    var count = 0 ;
    val arr = for(a_i <- 0 to n-2) yield { 
      for( 
        a_j <- a_i+1 to n-1 
        if (a(a_i) + a(a_j)) % k == 0 
      ) yield { 
        count += 1;
      } 
    };
    println(s"$count");
    */

  }
}

