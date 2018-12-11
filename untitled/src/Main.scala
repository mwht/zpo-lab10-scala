object Main {
  def main(args: Array[String]): Unit = {
    var expression:String = "-3 + 4 - 1 + 1 + 12 - 5 + 6"
    var total:Int = 0
    var nextOp:Int = 0

    try {
      var symbols = expression.split(" ")

      for (symbol <- symbols) {
        symbol match {
          case "+" => nextOp = 1
          case "-" => nextOp = -1
          case number => {
            nextOp match {
              case 0 => total = number.toInt
              case 1 => total += number.toInt
              case -1 => total -= number.toInt
            }
          }
        }
      }
      println(total)
    } catch {
      case ex: Exception => println("!!! EXCEPTION !!!")
    }
  }
}
