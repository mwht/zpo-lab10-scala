object Amicable {
  def main(args: Array[String]): Unit = {
    var x:Int = 1184
    var y:Int = 1210

    def sumOfDiv(number:Int): Int = {
      var sum:Int = 1
      for(i <- 2 to math.sqrt(number).toInt) {
        if(number % i == 0) {
          sum += i
          // kwadraty
          if(number / i != i) {
            sum += number / i
          }
        }
      }
      return sum
    }

    def isAmicable(a:Int, b:Int): Boolean = (sumOfDiv(a) == b) && (sumOfDiv(b) == a)

    isAmicable(x,y) match {
      case true => println(x + " and " + y + " are amicable.")
      case false => println(x + " and " + y + " are not amicable.")
    }
  }
}
