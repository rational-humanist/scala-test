/**
  * Created by varah_fd on 11-06-2016.
  */

import org.scalatest._
class DuplicateNTimesTest
  extends FlatSpec with Matchers {
  "DuplicateNTimes class' duplicateN2 method" should "duplicate N times" in
    {
      val DNT = new DuplicateNTimes
      assert(DNT.duplicateN2(3,List('A', 'B', 'C')) == List('A','A','A','B','B','B','C','C','C'))
      println(DNT.duplicateN2(3,List('A', 'B', 'C')))
      DNT.duplicateN2(3,List('A', 'B', 'C')) should be (List('A','A','A','B','B','B','C','C','C'))
   }
}
