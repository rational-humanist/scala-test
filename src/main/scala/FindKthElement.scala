/**
  * Created by varah_fd on 07-06-2016.
  */
class FindKthElement {
  def findKthElement[A](k:Int,ls:List[A]):A = (k,ls) match {
    case (1,h::tail) => h
    case (k, _::tail) if k > 1 => findKthElement(k-1,tail)
  }
}
