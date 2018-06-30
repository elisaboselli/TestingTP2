using Microsoft.Pex.Engine.Exceptions;
using Microsoft.Pex.Framework.Generated;
using Microsoft.VisualStudio.TestTools.UnitTesting;
// <auto-generated>
// This file contains automatically generated tests.
// Do not modify this file manually.
// 
// If the contents of this file becomes outdated, you can delete it.
// For example, if it no longer compiles.
// </auto-generated>
using System;

namespace EjerciciosPex.Tests
{
    public partial class EjerciciosPexTest
    {

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
public void calTest376()
{
    int i;
    i = this.calTest(2, 2, 2, 2, 768);
    Assert.AreEqual<int>(0, i);
}

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
public void calTest144()
{
    int i;
    i = this.calTest(4, 2, 5, 2, 768);
    Assert.AreEqual<int>(30, i);
}

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
public void calTest27()
{
    int i;
    i = this.calTest(4, 2, 5, 2, 300);
    Assert.AreEqual<int>(30, i);
}

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
public void calTest460()
{
    int i;
    i = this.calTest(1, 2, 3, 2, 1021);
    Assert.AreEqual<int>(59, i);
}

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
public void calTest581()
{
    int i;
    i = this.calTest(4, 2, 7, 2, 1021);
    Assert.AreEqual<int>(91, i);
}

[TestMethod]
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void calTestThrowsContractException26001()
{
    try
    {
      int i;
      i = this.calTest(0, 2, 0, 2, 768);
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
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void calTestThrowsContractException26101()
{
    try
    {
      int i;
      i = this.calTest(2, 0, 2, 2, 768);
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
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void calTestThrowsContractException49301()
{
    try
    {
      int i;
      i = this.calTest(2, 2, 2, 2, -939114004);
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
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void calTestThrowsContractException56801()
{
    try
    {
      int i;
      i = this.calTest(2, 2, 2, 0, 768);
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
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException(PexExceptionState.Expected)]
public void calTestThrowsContractException184()
{
    try
    {
      int i;
      i = this.calTest(1, 2, 0, 2, 300);
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
[PexGeneratedBy(typeof(EjerciciosPexTest))]
[PexRaisedContractException]
public void calTestThrowsContractException545()
{
    int i;
    i = this.calTest(2, 24, 2, 2, 768);
}
    }
}
