def penultimate[A](ls:List[A]):A = ls match {
//case h :: Nil => h
case h :: List(t) => h
case h :: tail => lastElement(tail)
case Nil => throw new NoSuchElementException
}
penultimate(List(1,2,3,4,5))
