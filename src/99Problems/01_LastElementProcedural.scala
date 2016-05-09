/*
Varaha: 5-May-2016:
the code below finds the last element in the list by using "last" method in a List collection: 
it is imperative in the sense that it does not say how the "last" is to be identified from scratch
*/

def last[A](l:List[A]):A = l.last
last(List('A','B','C','D','E'))


