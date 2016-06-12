/**
  * Created by varah_fd on 07-06-2016.
  */
  import org.scalatest._
  class FindKthElementTest
    extends FlatSpec with Matchers {
    "FindKthElement class' findKthElement method" should "pick the kth element in a list" in
      {
        val FKE = new FindKthElement
        //assert(FKE.findKthElement(2,List('A', 'B', 'C', 'D', 'E')) == 'B')
        println(FKE.findKthElement(2,List('A', 'B', 'C', 'D', 'E')))
        FKE.findKthElement(2,List('A', 'B', 'C', 'D', 'E')) should be ('B')
      }
  }
