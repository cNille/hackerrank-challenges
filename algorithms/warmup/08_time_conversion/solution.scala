object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    //var time = sc.next();
    //var time = "07:05:45PM";
    //var time = "12:40:22AM";
    //var time = "06:40:03AM";
    var time = "01:00:00AM";
    val chars: List[Char] = time.toList;
    val i = chars.map( (i: Char) => i - '0');
    val h = i(0) * 10 + i(1);
    test(h)

    def test(h: Int): Unit = {
      if(chars(8) == 'P'){
        val sub = if( h != 12 ) { 12 } else { 0 }
        printTime(h + sub, chars);
      } else {
        printTime(if(h == 12) { 0 } else { h }, chars);
      }

      def printTime(h: Int, chars: List[Char]){
        def intToStr(x: Int): String = {
          if(x < 10) { s"0$x" } else { x.toString }
        }
        val H = intToStr(h);
        val s = chars.drop(2).take(6).mkString;
        println(s"$H$s");
      }
    }
  }
}

