package com.devcake.service

import java.util.UUID

import com.devcake.db.DataBase
import com.devcake.models.Bill
import com.typesafe.scalalogging.StrictLogging

trait Service {
  def getBills(ids: List[UUID]): Option[List[Bill]]
  def getBill(id: UUID): Option[Bill]
}

class BillsService(db: DataBase) extends Service with StrictLogging {

  def getBills(ids: List[UUID]): Option[List[Bill]] = ???
  def getBill(id: UUID): Option[Bill] = ???
}
