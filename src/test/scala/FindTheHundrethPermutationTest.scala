/**
  * Created by varah_fd on 11-06-2016.
  */

  import org.scalatest._
  class FindTheHundrethPermutationTest
    extends FlatSpec with Matchers {
    "FindTheHundrethPermutation class' permutations method" should "calculate the Nth permutation" in
      {
        val FTHP = new FindTheHundrethPermutation
        assert(FTHP.permutationFrame(3,List(1,2,3)) == "213")
        println(FTHP.permutationFrame(3,List(1,2,3)))
        FTHP.permutationFrame(3,List(1,2,3)) should be ("213")
      }
  }

