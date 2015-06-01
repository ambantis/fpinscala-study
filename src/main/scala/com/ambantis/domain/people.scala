package com.ambantis.pattern.matching.com.ambantis.domain

/**
 * people
 * User: Alexandros Bantis
 * Date: 5/31/15
 * Time: 8:14 PM
 */

sealed trait Person {
  def name: String
  def luckyNumber: Int
}

trait Coder extends Person {
  def hasStandingDesk: Boolean
  def projects: List[Project]
  def languages: List[Language]
  def badgeColor: Option[Color]
}

case class Contractor(name: String,
                      luckyNumber: Int,
                      hasStandingDesk: Boolean,
                      projects: List[Project],
                      languages: List[Language]) extends Coder {
  val badgeColor = None

}

case class Employee(name: String,
                     luckyNumber: Int,
                     hasStandingDesk: Boolean,
                     projects: List[Project],
                     languages: List[Language],
                     luckyColor: Color) extends Coder {
  val badgeColor = Some(luckyColor)
}

case class Intern(name: String,
                   luckyNumber: Int,
                   languages: List[Language]) extends Coder {
  val projects = Nil
  def hasStandingDesk = false
  val badgeColor = None
}


