def flattenList(ls:List[Any]):List[Any] = ls match {
  case Nil => Nil
  case (h:List[_])::tail => flattenList(h):::flattenList(tail)
  case (h::tail) => h::flattenList(tail)
}
flattenList(List(1,List(3,4)))

def flattenList(ls:List[Any]):List[Any] = ls flatMap {
    case ls: List[_] => flattenList(ls)
    case h => List(h)
  }
flattenList(List(1,List(3,4)))
