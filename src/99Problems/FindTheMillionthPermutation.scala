def interleave(x:Int, l:List[Int]):List[List[Int]] = {
  l match {
    case Nil => List(List(x))
    case (head::tail) =>
      (x :: head :: tail) :: interleave(x, tail).map(head :: _)
  }
}

def permutations(l:List[Int]):List[List[Int]] = {
  l match {
    case Nil => List(List())
    case (head::tail) =>
      for(p0 <- permutations(tail); p1 <- interleave(head, p0)) yield p1
  }
}

permutations(List(1,2,3,4,5,6,7,8,9)).map(x => x.mkString("")).sortWith(_<_).toInt.zipWithIndex.foreach {case (e,i) => if ( ((i+1) % 1000000) == 0)println(e) }
