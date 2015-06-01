package com.ambantis.pattern

import com.ambantis.pattern.matching.com.ambantis.domain._

object DeptABC {

  val x234 = Project("x234", false, 234L)
  val x352 = Project("x352", false, 253L)
  val x127 = Project("x127", false, 0L)

  val service = Project("service", true, 150L)
  val dishes = Project("dishes", true, 235)


  val stan = Employee("stan", 1, true, List(x234, service), List(Ruby, Java), Blue)
  val cartman = Employee("cartman", 2, true, List(x127, dishes), List(Java), Yellow)
  val kenny = Employee("kenny", 13, false, List(x352, dishes), List(Scala, ScalaJS), Orange)
  val kyle = Employee("kyle", 5, false, List(service, dishes), List(Java, Python), Pink)
  val butters = Contractor("butters", 27, false, List(service), List(Java, Php))
  val wendy = Contractor("wendy", 6, false, List(dishes), List(Java))
  val ike = Contractor("ike", 0, true, List(service), List(Java))
  val token = Contractor("token", 6, false, List(service), List(Java, Scala))
  val pip = Intern("pip", 15, List(CustomLanguage("ada", true, false)))

  val team: List[Person] = List(stan, cartman, kenny, kyle, butters, wendy, ike, token, pip)
}

object DemoBasics {

  // walk through scala school basics  http://twitter.github.io/scala_school/basics.html

}

object DemoLooping {

  // insert here examples of inner loops

}

object DemoPatternMatching {

  // insert here examples of how to do pattern matching

}



object Demo

object Practice {

  def maybeBadgeColor(p: Person): Option[Color] = ???
  //assert(team.map(maybeBadgeColor).flatten.size == 4)

  def knowsScala(p: Person): Boolean = ???
  //assert(team.filter(knowsScala).size == 2)

  def isMultiLingual(p: Person): Boolean = ???
  //assert(team.filterNot(isMultiLingual).size == 3)

  def coolLanguages(p: Person): List[Language] = ???
  // assert(team.flatMap(coolLanguages).size == 3)

  def hasProjectNameMatchingStartTime(p: Person): Boolean = ???
  //assert(team.filter(hasProjectNameMatchingStartTime).size == 1)

}
