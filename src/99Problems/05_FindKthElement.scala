/*
this solution uses a powerful pattern matching feature in Scala: to be able to do pattern matching for a tuple.
I am beginning to love Scala.
*/
def findKthElement[A](k:Int,ls:List[A]):A = (k,ls) match {
  case (1,h::tail) => h
  case (k, _::tail) if k > 1 => findKthElement(k-1,tail)
}
//findKthElement(3,List(1,2,3,4,5))
