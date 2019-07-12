import scala.math.pow

def g(n: Int, p: Double): Double = {
  p * pow(1-p,n-1)
}

def gDuring(n:Int, p:Double):Double = {
  (1 to n).map((i)=>g(i,p)).foldLeft(0.0){(a,b)=>a+b}
}


def r(d:Double) = Math.round(d * 1000) / 1000.0
