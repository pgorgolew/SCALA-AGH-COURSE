object Appl41 {
  def factorial(n: Int) : Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def fibb(n: Int) : Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) n
    else fibb(n - 2) + fibb(n - 1)
  }

  def main(args: Array[String]) {
    println("5! = " + factorial(5))
    println("Fibb(10) = " + fibb(10))
  }
}

object Appl42 {
  def checkPredicate(pred: Boolean,
                     predAsString: String,
                     prefix: String = "Checking if ") {
    if (pred) println(prefix + predAsString + ": OK")
    else println(prefix + predAsString + ": Fail")
  }

  def sumArrayIter(elems: Array[Int]) = {
    var sum = 0
    for (i <- elems) sum += i
    sum
  }

    def sumArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size) elems(i) + sumArrayRec1(i + 1, elems)
    else 0
    }

    def sumArrayRec2(elems: Array[Int]) = {
    val size = elems.size
    def goFrom(i: Int): Int = {
        if (i < size) elems(i) + goFrom(i+1)
        else 0
    }
    goFrom(0)
    }

  def main(args: Array[String]) {
    val a1To5 = (1 to 5).toArray
    println("Testing with a1To5 = " +
            a1To5.mkString("Array(", ", ", ") ..."))
    val expectResult = 15
    checkPredicate(sumArrayIter(a1To5) == expectResult,
                   "sumArrayIter(0, a1To5) == " + expectResult)
    checkPredicate(sumArrayRec1(0, a1To5) == expectResult,
                   "sumArrayRec1(0, a1To5) == " + expectResult)
    checkPredicate(sumArrayRec2(a1To5) == expectResult,
                   "sumArrayRec2(a1To5) == " + expectResult)
  }
}

object Appl43 {
  def checkPredicate( /* ... */ ) { /* ... */ }
  def maxIter(elems: Array[Int]) = {
    var max = ___
    for (i <- elems) if (i > max) max = i
    max
  }
  def maxRec1(i: Int, maxEl: Int, elems: Array[Int]): Int = {
    if (i < elems.size) maxRec1(___, math.max(___, ___), elems)
    else ___
  }
  def maxRec2(elems: Array[Int]) = {
    def goFrom(i: Int, maxEl: Int, size: Int): Int = {
      if (i < size) goFrom(___, math.max(___, ___), size)
      else ___
    }
    goFrom(0, ___, ___)
  }
  def main(args: Array[String]) {
    val arr1 = Array(3, 12, 43, 4, 10)
    println("Testing with arr1 = " +
            arr1.mkString("Array(", ", ", ") ..."))
    val expectResult = 43
    checkPredicate(maxIter(arr1) == expectResult,
                   "maxIter(arr1) == " + expectResult)
    checkPredicate(maxRec1(0, ___, arr1) == expectResult,
                   "maxRec1(0, ___, arr1) == " + expectResult)
    checkPredicate(maxRec2(arr1) == expectResult,
                   "maxRec2(arr1) == " + expectResult)
  }
}