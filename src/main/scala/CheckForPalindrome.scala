/**
  * Created by varah_fd on 11-06-2016.
  */
class CheckForPalindrome {
  def isPalindrome[A](ls: List[A]): Boolean = ls match {
    case Nil => true
    case FirstLastRem(a, b, c) => (a == b) && isPalindrome(c)
  }
}

object FirstLastRem {
  def unapply[A](ls: List[A]) = ls match {
    case Nil => None
    case ls if (ls.length == 1) => Some(ls.head, ls.last, List())
    case ls => Some(ls.head, ls.last, ls.init.tail)
  }
}
