def NoOfElementsInList[A](ls:List[A]):Int = {
  def tupleCounter[A](k:Int,ls:List[A]):Int = (k,ls) match {
    case (k,h :: Nil) => k+1
    case (k,h :: tail) => tupleCounter(k+1,tail)
    case (k, Nil) => throw new NoSuchElementException
  }
  tupleCounter(0,ls)
}
//println(NoOfElementsInList(List(1,2,3,4,5,6,7,8,9,10)))
