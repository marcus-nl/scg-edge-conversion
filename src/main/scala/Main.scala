import scalax.collection.GraphEdge.DiEdge
import scalax.collection.GraphPredef._
import scalax.collection.Graph

object Main extends App {

  type IntDiGraph = Graph[Int, DiEdge]
  val g: IntDiGraph = Graph(1 ~> 2, 2 ~> 3)

  // doesn't work with Scala 2.13
  def print1(edge: Graph[Int, DiEdge]#EdgeT): Unit = {
    val source = edge.source
    val target = edge.target
    println(s"1: $source ~> $target")
  }

  // doesn't work with Scala 2.13
  def print2(edge: IntDiGraph#EdgeT): Unit = {
    val source = edge.source
    val target = edge.target
    println(s"2: $source ~> $target")
  }

  // does work
  def print3(edge: g.EdgeT): Unit = {
    val source = edge.source
    val target = edge.target
    println(s"3: $source ~> $target")
  }

  for (edge <- g.edges) {
    print1(edge)
    print2(edge)
    print3(edge)

    // does work
    val source = edge.source
    val target = edge.target
    println(s"4: $source ~> $target")
  }
}
