package lab

import org.junit.Test

class ListLabTest {
  @Test
  def sumAllTest(){
    val listLab = new ListLab()
    val myList = List(1,2,3)
    val myRet = listLab.sumAll(myList)
    print(myRet)
  }

}
