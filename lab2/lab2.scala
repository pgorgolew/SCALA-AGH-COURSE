class Person(val name: String, var surname: String, protected val id: String){
    def getFullName = name + " " + surname
}
// val name -> od razu mamy akseosr
// var surname -> od razu mamy aksesor oraz modifikator
/* val p = Person(bla,bla,bla)
p.surname = 'costam' <- to jest modifikotor
println(p.name) <- to jest aksesor


UAM -> mamy odwoływać się do metod oraz atrybutów w taki sam sposób (bez () na koncu)
Z tego powodu def 'getFullName =' a nie 'getFullName() =' 

METODY KTÓRE COŚ ZMIENIAJĄ - jakiś stan obiektu. Wtedy trzeba definiować z nawiasami i wywoływać też

Po wpisaniu private mamy aksesor prywatny only

PLIKI NAZYWAJĄ SIĘ OBOJĘTNIE JAK! `scalac <plik>` skompiluje nam wszystkie klasy z pliku
*/



/*klasy sa defaultowo publiczne, atrybuty tez
class Person {
    val id: String -> to jest final, var to zmienna
    var surname: String
}
-> powstanie prywatny atrybut oraz publiczna metoda ktora nazywa sie tak samo jak pole



*/

object Appl extends App {
    val p = new Person("Jan", "Kowalski", "1234567890")
    println(p.name)
}


// Cos z unary() ze działa tylko na - + ~ !

/*
Dodatnie obiektu w tym samym pliku i o takiej samiej nazwie jak klasa
ma on dostep do wszystkiego co klasa
zazwyczaj dodaje sie tam 
def apply() = new int2DVec(0,0)
def apply(x: Int) = new int2DVec(x,x)

val v1 = Int2DVec.apply() = Int2DVec() <- z obiektu
val v1 = new Int2DVec() <- z konstruktora

metoda apply to metoda fabryczna, dostarcza ona obiekt
Jest ona spoko bo konstrutkor w klasie za kazdym razem tworzy go lub wywala wyjątek

Zrobienie class <nazwa> private (paramterty) sprawia, że konstruktor jest dostępny tylko dla nas.

KARTKÓWKA DO 8
*/