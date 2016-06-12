/**
  * Created by varah_fd on 30-05-2016.
  */

import org.scalatest._
class FindPenultimateElementTest
  extends FlatSpec with Matchers {
    "FindPenultimateElement's penultimate method" should "pick the second last element in a list" in
      {
        val FLE = new FindPenultimateElement
        //assert(FLE.penultimate(List('A', 'B', 'C', 'D', 'E')) == 'D')
        println(FLE.penultimate(List('A', 'B', 'C', 'D', 'E')))
        FLE.penultimate(List('A', 'B', 'C', 'D', 'E')) should be ('D')
      }
  }
