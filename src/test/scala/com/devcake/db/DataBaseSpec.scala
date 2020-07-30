package com.devcake.db

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class DataBaseSpec extends AnyFunSpec with Matchers {
  describe("db") {
    describe("getBillById") {
      it("should return 1 bill given the Id") {
        //TODO spec out functions
      }
      it("should return None given the wrong Id") {
        //TODO spec out functions
      }
    }
    describe("addNewBill"){
      it("should insert 1 bill into the DB"){
        //TODO spec out functions
      }
      it("should upsert 1 bill if already in existence"){
        //TODO spec out functions
      }
    }
    describe("getBills"){
      it("should return all bills given a list of Ids") {
        //TODO spec out functions
      }
      it("should return None given a list of the wrong Id") {
        //TODO spec out functions
      }
    }
    describe("addBills"){
      it("should insert many bill into the DB"){
        //TODO spec out functions
      }
      it("should upsert many bill if already in existence"){
        //TODO spec out functions
      }
    }
  }

}
