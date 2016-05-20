def duplicateN[A](n: Int, l: List[A]):List[A] = {
    l flatMap { e => List.fill(n)(e) }
}
duplicateN(3, List('a, 'b, 'c, 'c, 'd))

def duplicateN2[A](n: Int, l: List[A]):List[A] = {
    l flatMap { List.fill(n)(_) }
}
duplicateN2(3, List('a, 'b, 'c, 'c, 'd))
