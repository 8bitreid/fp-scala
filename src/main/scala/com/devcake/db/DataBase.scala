package com.devcake.db

import java.util.UUID

import com.devcake.models.Bill

trait DataBase {
  // needs a connection
  // a connection needs a configuration
  def getBillById(id: UUID): Option[Bill]
  def addNewBill(bill: Bill): Unit
  def getBills(ids: List[UUID]): Option[List[Bill]]
  def addBills(bills: List[Bill]): Unit
}
