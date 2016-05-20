def drop[A](n: Int, l: List[A]):List[A] = {
    l.grouped(n).flatMap { _.take(n - 1) }.toList
}

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

def dropZip[A](n: Int, l: List[A]):List[A] = {
    l.zipWithIndex filter { e => (e._2 + 1) % n != 0 } map { _._1 }
}

dropZip(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
