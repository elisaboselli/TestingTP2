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
public void addTest220()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.Create();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
public void addTest890()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.creatEmpty();
    this.addTest(arrayList, (object)null, 0);
    Assert.IsNotNull((object)arrayList);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[ExpectedException(typeof(InsufficientMemoryException))]
public void addTestThrowsInsufficientMemoryException806()
{
    ArrayList arrayList;
    arrayList = ArrayListFactory.createFull();
    this.addTest(arrayList, (object)null, 0);
}

[TestMethod]
[PexGeneratedBy(typeof(ArrayListTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void addTestThrowsContractException20601()
{
    try
    {
      ArrayList arrayList;
      arrayList = ArrayListFactory.Create();
      this.addTest(arrayList, (object)null, 10);
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
public void addTestThrowsContractException15301()
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
    }
}
