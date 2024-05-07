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

  def prodPunto(v1: Vector[Int], v2: Vector[Int]): Int ={
    (v1 zip v2).map({case(i,j)=>(i*j)}).sum
  }

  def transpuesta(m: Matriz): Matriz ={
    val l = m.length
    Vector.tabulate(l,l)((i,j)=>m(j)(i))
  }

}
