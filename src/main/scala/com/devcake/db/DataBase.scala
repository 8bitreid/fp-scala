package com.devcake.db

import java.util.UUID

import com.devcake.models.Bill
import com.typesafe.scalalogging.StrictLogging
import doobie.free.connection.ConnectionIO
import doobie.implicits._
import doobie.util.transactor.Transactor
import fs2.Stream
import zio.Task

trait DataBase {
  // needs a connection
  // a connection needs a configuration
  def getBillById(id: UUID): Stream[Task, Bill]
  def addNewBill(bill: Bill): ConnectionIO[UUID]
  def getBills(ids: List[UUID]): ConnectionIO[Option[List[Bill]]]
  def addBills(bills: List[Bill]): ConnectionIO[List[UUID]]
}

class BillsDb() extends DataBase with StrictLogging {

  // Need a Transactor and Doobie here needs zio.ineterop.catz implicits
  import zio.interop.catz._

  val transactor: Transactor[Task] = Transactor.fromDriverManager(
    "org.postgresql.Driver",
    "jdbc:postgresql:fp",
    "postgres",
    ""
  )

  def getBillById(id: UUID): Stream[Task, Bill] = {
    sql"""SELECT * FROM bills WHERE id = ${id.toString}"""
      .stripMargin
      .query[Bill]
      .stream
      .transact(transactor)
  }
  def addNewBill(bill: Bill): ConnectionIO[UUID] = ???

  def getBills(
    ids: List[UUID]
  ): ConnectionIO[Option[List[Bill]]] = ???
  def addBills(bills: List[Bill]): ConnectionIO[List[UUID]] = ???
}
