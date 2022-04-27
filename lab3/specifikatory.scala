//podstawowo private-tylko w typie widoczne, protected - tylko w typie i dziedziczonych, public*

/*
private[p1] C1 -> means, że klasa jest prywatna ale widoczna w pakiecie p1
można tylko jeden pakiet zrobić, żeby inne pakiety chciały to muszą brać ten pakiet

protected[p1] def doSth -> metoda widoczna we wszystkich klasach z p1 i dziedziczace z tej klasy
private[this] val ... -> tylko obiekt posiadający ten obiekt może się odwołać do swojej wartości




CASE CLASS - służą w zamyśle do przehcowywania strukutr danych

case class Person(name: String, surname: String)
nie ma val ani var - to są wszystko niemodyfikowalne (czyli val) domyślnie
po kompilacji dostaniemy:
    equals, 
    hashCode na podstawie parametrów konstruktora, 
    toString, 
    copy
    object Person z .apply()
    object Person z .unapply() -> p match {
                                            case Person("Jan", "Kowalski") => ...
                                            }



ENUMY DRUGI SPOSÓB
sealed trait A -> sealed oznacza, że tego traita nie moge rozszerzyć w żadnym innym pliku niż w tym, w którym jest zdefioniowany
case class B extends A
case class C extends A

A to ENUM (B,C)