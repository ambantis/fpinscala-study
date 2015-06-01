package com.ambantis.domain

/**
 * projects
 * User: Alexandros Bantis
 * Date: 5/31/15
 * Time: 9:02 PM
 */

case class Project(name: String,
                   disclosed: Boolean,
                   began: Long = System.currentTimeMillis())

sealed trait Language {
  def name: String
  def isBackend: Boolean
  def rocks: Boolean = false
}

case object Scala extends Language {
  val name = "Scala"
  val isBackend = true
  override def rocks = true
}

case object Java extends Language {
  val name = "Java"
  val isBackend = true
}

case object Javascript extends Language {
  val name = "Javascript"
  val isBackend = false
}

case object Php extends Language {
  val name = "php"
  val isBackend = true
}

case object Ruby extends Language {
  val name = "Ruby"
  val isBackend = true
}

case object ScalaJS extends Language {
  val name = "ScalaJS"
  val isBackend = false
  override def rocks = true
}

case object Python extends Language {
  val name = "Python"
  val isBackend = true
  override def rocks = true
}

case class CustomLanguage(name: String,
                          isBackend: Boolean,
                          override val rocks: Boolean) extends Language

sealed trait Color

case object Pink extends Color
case object Purple extends Color
case object Blue extends Color
case object Yellow extends Color
case object Orange extends Color
