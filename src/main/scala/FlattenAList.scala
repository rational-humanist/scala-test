/**
  * Created by varah_fd on 07-06-2016.
  */
class FlattenAList {
  def flattenList(ls:List[Any]):List[Any] = ls flatMap {
    case ls: List[_] => flattenList(ls)
    case h => List(h)
  }
  flattenList(List(1,List(3,4)))
}
