import common._
import scala.util.Random
package object Matrices {
  val random = new Random()

  type Matriz = Vector[Vector[Int]]

  def matrizAlAzar(long: Int, vals: Int): Matriz ={
    val v = Vector.fill(long,long){random.nextInt(vals)}
    v
  }

  def vectorAlAzar(long:Int, vals: Int): Vector[Int] ={
    val v = Vector.fill(long){random.nextInt(vals)}
    v
  }


}
