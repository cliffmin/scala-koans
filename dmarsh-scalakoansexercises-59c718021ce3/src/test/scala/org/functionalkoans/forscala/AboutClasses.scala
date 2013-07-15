package org.functionalkoans.forscala

import support.KoanSuite

class AboutClasses extends KoanSuite {


  // you can define class with var or val parameters
  class ClassWithVarParameter(var description: String)

  class ClassWithValParameter(val name: String)

  koan("val parameters in class definition define getter") {
    val aClass = new ClassWithValParameter("malte")
    aClass.name should be("malte")
  }

  koan("var parameters in class definition define getter and setter") {
    val aClass = new ClassWithVarParameter("malte")
    aClass.description should be("malte")

    aClass.description = "didem"
    aClass.description should be("didem")
  }

  // you can define class with private fields
  class ClassWithPrivateFields(name: String)

  koan("fields defined internally are private to class") {
    val aClass = new ClassWithPrivateFields("name")

    // NOTE: aClass.name is not accessible
  }

}
