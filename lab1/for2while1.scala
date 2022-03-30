import util.control.Breaks._

var i = 1
while (i <= 10) {
    val x = 2 * i + 1
    breakable{
        if (x % 3 != 0)
            break()
        println(i,x)
    }
    i += 1
}