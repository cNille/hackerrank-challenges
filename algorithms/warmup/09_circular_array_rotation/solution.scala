object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val k = sc.nextInt();
    val q = sc.nextInt();
    val rot = k % n;

    val nums: Map[Int, Int] = { for(i <- 0 to n-1) yield i -> sc.nextInt() }.toMap;

    for (i <- 1 to q) {
      val idx = sc.nextInt();
      if(idx-rot >= 0){
        print(nums(idx-rot))
      } else {
        print(nums(idx-rot+nums.size))
      }
    }
  }
}
