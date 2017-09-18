package playground.greedySnake

import scala.collection.mutable.ListBuffer

/**
  * Created by weifengc on 1/4/17.
  */
object Main {
    case class Snake(body : List[(Int, Int)])

    def main(args : Array[String]) : Unit = {
        println("Welcome to Scala GreedySnake")
        var board = Array.ofDim[Int](10, 10)

        var snake = new Snake(List((1,1)))
        snake =  move("up", snake)


    }

    // make a method for show snake position and validate
    def validate(snake: Snake, limit : Int): Boolean = {
        for( (row, col) <- snake.body){
            if( row < 0 || row >= limit || col < 0 || col >= limit){
                return false
            }
        }
        //todo: also check the duplicate

        return true
    }

    def move(direction : String, snake: Snake) : Snake = {
        val body = snake.body
        val head = snake.body(0)
        var newHead : (Int, Int) = head
        direction.toLowerCase() match {
            case "up" => newHead = (head._1 - 1, head._2 )
            case "down" => newHead = (head._1 + 1, head._2)
            case "left" => newHead = (head._1, head._2 - 1)
            case "right" => newHead = (head._1, head._2 + 1)
        }
        //remove the last ele in body and put new head to be in the front of body
        var newBody = body
        if(body.length == 1){
            newBody = List(newHead)
        }else{
            var buffer = body.to[ListBuffer]
            buffer.remove(body.length - 1)
            newBody = newHead :: buffer.toList
        }
        new Snake(newBody)
    }
}
