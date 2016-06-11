/**
  * Created by varah_fd on 30-05-2016.
  */
class FindPenultimateElement {
  def penultimate[A](ls:List[A]):A = ls match {
    //case h :: Nil => h
    case h :: List(t) => h
    case h :: tail => penultimate(tail)
    case Nil => throw new NoSuchElementException
  }
}
