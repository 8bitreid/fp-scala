package com.devcake.service

import java.util.UUID

import com.devcake.db.DataBase
import com.devcake.models.Bill

trait Service {
  def getBills(ids: List[UUID]): Option[List[Bill]]
  def getBill(id: UUID): Option[Bill]
}

class BillsService(db: DataBase) extends Service {

  def getBills(ids: List[UUID]): Option[List[Bill]] = db.getBills(ids)
  def getBill(id: UUID): Option[Bill] = db.getBillById(id)
}
