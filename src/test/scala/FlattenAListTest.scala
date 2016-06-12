/**
  * Created by varah_fd on 07-06-2016.
  */
import org.scalatest._

class FlattenAListTest
  extends FlatSpec with Matchers {
  "FlattenAList class' flattenList method" should "deconstruct lists" in
    {
      val FL = new FlattenAList
      //assert(FL.flattenList(List('A', 'B', List('C', 'D'), 'E')) == List('A','B','C','D','E'))
      println(FL.flattenList(List('A', 'B', List('C', 'D'), 'E')))
      FL.flattenList(List('A', 'B', List('C','D') ,'E')) should be (List('A','B','C','D','E'))
    }
}
