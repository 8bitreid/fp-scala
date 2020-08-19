package com.devcake

import java.util.UUID

package object models {
  // TODO get UUID and DateTimes here...
  case class Bill(id: UUID, name: String, amount: Double, due: String, paid: Boolean)

}
