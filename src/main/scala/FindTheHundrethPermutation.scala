/**
  * Created by varah_fd on 11-06-2016.
  */
class FindTheHundrethPermutation {
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

  def permutationFrame(k:Int,l:List[Int]):String = {
      var j = ""
      permutations(l).map(x => x.mkString("")).sortWith(_ < _).zipWithIndex.foreach
      { case (e, i) => if ((i + 1) == k) j = e  }
    j
    }
}
