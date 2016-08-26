object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val k = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }
    val modArr = arr.groupBy(_%k).filterKeys(_!=0);

    def pairCheck (arr: Map[Int, Array[Int]], i: Int) : List[Int]  = {
      if(i > arr.size/2){
        return List()
      } else if(i == arr.size/2) {
        return List(1)
      }
      if(arr(i).size > arr(k-i).size){
        return arr(i).toList ::: pairCheck(arr, i+1);
      } else {
        return arr(k-i).toList ::: pairCheck(arr, i+1);
      }
    }
    val res = pairCheck(modArr, 1);
    println(res.size);
  }
}
