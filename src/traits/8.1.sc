trait BaseSoundPlayer {
    def play
//    def close
//    def pause
//    def stop
//    def resume
}


trait Dog {
    def speak(whatToSay : String)

    def wagTail(enabled : Boolean)
}

class Mp3SoundPlayer extends BaseSoundPlayer{
    def play: Unit ={
        println("play")
    }
}




