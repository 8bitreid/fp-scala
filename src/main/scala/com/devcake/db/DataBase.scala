package com.devcake.db

import java.util.UUID

import com.devcake.models.Bill
import com.typesafe.scalalogging.StrictLogging
import doobie.free.connection.ConnectionIO
import doobie.util.transactor.Transactor
import zio.Task
import zio.interop.catz._

trait DataBase {
  // needs a connection
  // a connection needs a configuration
  def getBillById(id: UUID): ConnectionIO[Option[Bill]]
  def addNewBill(bill: Bill): ConnectionIO[UUID]
  def getBills(ids: List[UUID]): ConnectionIO[Option[List[Bill]]]
  def addBills(bills: List[Bill]): ConnectionIO[List[UUID]]
}

class BillsDb() extends DataBase with StrictLogging {

  // Need a Transactor
  val transactor: Transactor[Task] = Transactor.fromDriverManager(
    "org.postgresql.Driver",
    "jdbc:postgresql:fp",
    "postgres",
    ""
  )

  def getBillById(id: UUID): ConnectionIO[Option[Bill]] = ???
  def addNewBill(bill: Bill): ConnectionIO[UUID] = ???

  def getBills(
    ids: List[UUID]
  ): ConnectionIO[Option[List[Bill]]] = ???
  def addBills(bills: List[Bill]): ConnectionIO[List[UUID]] = ???
}
