using Microsoft.ExtendedReflection.DataAccess;
using Microsoft.Pex.Engine.Exceptions;
using Microsoft.Pex.Framework.Generated;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ArrayListProject;
// <auto-generated>
// This file contains automatically generated tests.
// Do not modify this file manually.
// 
// If the contents of this file becomes outdated, you can delete it.
// For example, if it no longer compiles.
// </auto-generated>
using System;

namespace ArrayListProject.Tests
{
    public partial class ArrayListTest
    {


[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest199()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest762()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    this.addTest(arrayList, "test", 1);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException23()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.Create();
      this.addTest(arrayList, (object)null, 9);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}



[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException415()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.Create();
      this.addTest(arrayList, (object)null, int.MinValue);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest442()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    object box = (object)(default(DateTime));
    this.addTest(arrayList, box, 1);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest977()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.creatEmpty();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException793()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.creatEmpty();
      this.addTest(arrayList, (object)null, 1);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest246()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.creatEmpty();
    object boxb = (object)(default(bool));
    this.addTest(arrayList, boxb, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest62()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    object boxl = (object)(default(ulong));
    this.addTest(arrayList, boxl, 3);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest19901()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest76201()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    this.addTest(arrayList, "test", 1);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException2301()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.Create();
      this.addTest(arrayList, (object)null, 9);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException41501()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.Create();
      this.addTest(arrayList, (object)null, int.MinValue);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest44201()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    object box = (object)(default(DateTime));
    this.addTest(arrayList, box, 1);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[ExpectedException(typeof(InsufficientMemoryException))]
public void addTestThrowsInsufficientMemoryException569()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.createFull();
    this.addTest(arrayList, (object)null, 0);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[ExpectedException(typeof(InsufficientMemoryException))]
public void addTestThrowsInsufficientMemoryException613()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.createFull();
    object boxi = (object)(default(int));
    this.addTest(arrayList, boxi, 3);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest97701()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.creatEmpty();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException79301()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.creatEmpty();
      this.addTest(arrayList, (object)null, 1);
      throw 
        new AssertFailedException("expected an exception of type ContractException");
    }
    catch(Exception ex)
    {
      if (!PexContract.IsContractException(ex))
        throw ex;
    }
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest24601()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.creatEmpty();
    object boxb = (object)(default(bool));
    this.addTest(arrayList, boxb, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest6201()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    object boxl = (object)(default(ulong));
    this.addTest(arrayList, boxl, 3);
    Assert.IsNotNull((object)arrayList);
}
    }
}
