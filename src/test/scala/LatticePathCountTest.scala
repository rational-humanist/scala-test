/**
  * Created by varah_fd on 12-06-2016.
  */

import org.scalatest._
class LatticePathCountTest
  extends FlatSpec with Matchers {
  "LatticePathCount class' latticePath method" should "calculate the number of paths" in
    {
      val LPC = new LatticePathCount
      assert(LPC.latticePath(2) == 6)
      println(LPC.latticePath(10))
      LPC.latticePath(2) should be (6)
    }
}
