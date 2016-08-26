object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    def cutSticks(arr: Array[Int]) = {
      if(arr.length > 0){
        println(arr.length);
        cutSticks(arr.map(_ - arr.min).filter(_ > 0));
      }
    }
    cutSticks(arr);
  }
}

