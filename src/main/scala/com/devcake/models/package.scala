package com.devcake

import java.time.ZonedDateTime
import java.util.UUID

package object models {

  case class Bill(id: UUID, name: String, ammount: Double, dueDate: ZonedDateTime, paid: Boolean)

}
