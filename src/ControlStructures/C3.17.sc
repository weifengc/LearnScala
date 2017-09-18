import java.io._

object CopyBytes extends App{
    var in = None : Option[FileInputStream]
    var out = None : Option[FileInputStream]

    try{
        in  = Some( new FileInputStream("/tmp/Test.class"))
        out = Some (new FileOutputStream("/tmp/Test.class.copy"))
        var c = 0
        while ({ c = in.get.read; c != -1 }){
            out.get.write(c)
        }

    }catch {
        case e : IOException => e.printStackTrace()
    } finally {
        println("enterer finally ...")
        if(in.isDefined ) in.get.close()
        if( out.isDefined ) out.get.close()
    }

}