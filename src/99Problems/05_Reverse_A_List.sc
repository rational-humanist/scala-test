/*
The below approach uses pattern matching and recursion to reverse a list. 
1. the "match" function not only matches but also executes the reversing using recursion.
The ":::" operator does the concatenation.
2. Input was reverse(List(1, 1, 2, 3, 5, 8))
*/
def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
}

/*
****************************************
Alternate approach in recursion: 
****************************************
*/
def reverse[A](l: List[A]): List[A] = {
    def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
        case Nil => res
        case h :: tail => _reverse(h :: res, tail)
    }
    _reverse(Nil, l)
}


/*
****************************************
Alternate approach using foldLeft: 
****************************************
*/
def reverse[A](ls: List[A]): List[A] =
ls.foldLeft(List[A]()) { (r, h) => h :: r }
//reverse(List(1,2,3,4,5))
