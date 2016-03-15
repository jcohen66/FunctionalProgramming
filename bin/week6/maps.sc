package week6

object maps {

	val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
	
	val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)
	
	capitalOfCountry("US")                    //> res0: String = Washington

	capitalOfCountry.getOrElse("Andorra", "Not found")
                                                  //> res1: String = Not found
	capitalOfCountry.get("Andorra")           //> res2: Option[String] = None
	
}