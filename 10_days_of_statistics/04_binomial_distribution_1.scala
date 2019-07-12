package day4_1
import scala.math.pow

//Bernoulli Random Variable and Distribution
// f(x) = p^x(1-p)^(1-x)
// for x E {0,1}

def berand(p: Double, x: Int):Double = {
  pow(p,x) * pow(1-p, 1-x)
}

// n over k
// n! / k!(n-k)!

object Helpers {
  implicit class IntWithOver(x: Int) {
    def !():Int = (1 to x).foldLeft(1){ (acc, curr) => acc * curr }
    def over(k:Int):Int = x.! / ( k.! * (x-k).! )
  }
}
import Helpers._
//Binomial distribution
// b(x,n,p) = (n over x)* p^x * q^(n-x) 

def b(x: Int, n: Int, p: Double):Double = {
  (n over x) * pow(p,x) * pow(1-p, n-x)  
}

def bLeast(x: Int, n: Int, p: Double):Double = {
  (x to n).map((i) => b(i,n,p)).foldLeft(0.0){ (a,b) => a+b}
} 
def bMost(x: Int, n: Int, p: Double):Double = {
  (0 to x).map((i) => b(i,n,p)).foldLeft(0.0){ (a,b) => a+b}
}

def ratioToProc(ratio: Double):Double = {
  (1 / (1+ratio)) * ratio
}

def ratioLeast(x:Int,n:Int,ratio:Double):Double = {
  bLeast(x,n,ratioToProc(ratio))
}
