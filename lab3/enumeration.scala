object ThreeColors extends Enumeration{
    type ThreeColors = Value
    val Blue, White, Red = Value //value to klasa wewnętrzna w Enumeration
} // = value to jest to samo co = value.apply()
//dzieki typeowaniu, ThreeColors.ThreeColors.Red

import ThreeColors._
object utils{
    def leadingActor(part: ThreeColors) = part match {
        case Blue => "Juliette Binoche"
        case White => "Zbigi"
        case Red => "Irena"
    }
}

object Appl{
    def main(args: Array[String]){
        for(part <- ThreeColors.values)
            println(part.toString + ": " + utils.leadingActor(part))
    }
}

