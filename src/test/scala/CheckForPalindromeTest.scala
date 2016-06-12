/**
  * Created by varah_fd on 11-06-2016.
  */
import org.scalatest._
class CheckForPalindromeTest
  extends FlatSpec with Matchers {
  "CheckForPalindrome class' isPalindrome method" should "return true or false" in
    {
      val CFP = new CheckForPalindrome
      //assert(CFP.isPalindrome(List('A', 'B', 'C', 'B', 'A')) == true)
      //assert(CFP.isPalindrome(List('A', 'B', 'C', 'D', 'E')) == false)
     println(CFP.isPalindrome(List('A', 'B', 'C', 'B', 'A')))
      println(CFP.isPalindrome(List('A', 'B', 'C', 'D', 'E')))
      CFP.isPalindrome(List('A', 'B', 'C', 'B', 'A')) should be (true)
      CFP.isPalindrome(List('A', 'B', 'C', 'D', 'E')) should be (false)

    }
}
