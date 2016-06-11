/**
  * Created by varah_fd on 30-05-2016.
  */
class FindLastElement {
  def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
  }
}
