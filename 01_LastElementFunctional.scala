/*
Varaha: 05-May-2016
This is the functional programming approach: 
the program applies recursion by calling the same function with progressively smaller list; 
smaller list is obtained by subsetting the larger list (exclude the first element and process the rest)
the end condition is when there is only one element in the list
In an imperative language, there is going to be if-check to catch the end condition. 
In this program, pattern matching identifies the end-condition versus the rest of the loops. 
The program was executed on REPL on local desktop on IntelliJ IDEA 15.0.4
*/
def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
}
last(List('A','B','C','D','E'))

/* 
======================
Output from REPL - 

<console>:11: warning: match may not be exhaustive.
It would fail on the following input: Nil
def last[A](l:List[A]):A = l match {
                           ^
last: [A](l: List[A])A
scala> res2: Char = E
========================
*/
