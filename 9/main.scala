object Solution {
  def main(args: Array[String]): Unit = {
    args match {
      case _ if args.isEmpty => println("false")
      case _ if args.length > 0 => {
        println(args(0).toIntOption.map(isPalindrome).getOrElse(false))
      }
    }
  }

  def isPalindrome(x: Int): Boolean = {
    x match {
      case _ if x < 0 => false
      case _ if x % 10 == 0 && x != 0 => false
      case value => {
        var input = value

        var reversed = 0
        while(input > reversed) {
          reversed = reversed * 10 + input % 10

          input /= 10
        }

        input == reversed || input == reversed / 10
      }
    }
  }
}
