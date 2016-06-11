/**
  * Created by varah_fd on 11-06-2016.
  */
class DuplicateNTimes {
  def duplicateN2[A](n: Int, l: List[A]):List[A] = {
    l flatMap { List.fill(n)(_) }
  }
  }
