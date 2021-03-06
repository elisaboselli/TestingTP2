using Microsoft.Pex.Framework.Suppression;
using System;
using System.Globalization;
using Microsoft.Pex.Framework.Coverage;
using Microsoft.Pex.Framework.Creatable;
using Microsoft.Pex.Framework.Instrumentation;
using Microsoft.Pex.Framework.Settings;
using Microsoft.Pex.Framework.Validation;

// Microsoft.Pex.Framework.Settings
[assembly: PexAssemblySettings(TestFramework = "VisualStudioUnitTest")]

// Microsoft.Pex.Framework.Instrumentation
[assembly: PexAssemblyUnderTest("ConsoleApplication")]
[assembly: PexInstrumentAssembly("System.Core")]

// Microsoft.Pex.Framework.Creatable
[assembly: PexCreatableFactoryForDelegates]

// Microsoft.Pex.Framework.Validation
[assembly: PexAllowedContractRequiresFailureAtTypeUnderTestSurface]
[assembly: PexAllowedXmlDocumentedException]

// Microsoft.Pex.Framework.Coverage
[assembly: PexCoverageFilterAssembly(PexCoverageDomain.UserOrTestCode, "System.Core")]
[assembly: PexInstrumentType(typeof(DateTimeFormatInfo))]
[assembly: PexInstrumentType("mscorlib", "System.DateTimeParse")]
[assembly: PexInstrumentType("mscorlib", "System.DateTimeResult")]
[assembly: PexInstrumentType("mscorlib", "System.DateTimeRawInfo")]
[assembly: PexInstrumentType("mscorlib", "System.__DTString")]
[assembly: PexInstrumentType(typeof(Environment))]
[assembly: PexInstrumentType("mscorlib", "System.Globalization.CultureData")]
[assembly: PexSuppressUninstrumentedMethodFromType(typeof(CompareInfo))]
[assembly: PexSuppressUninstrumentedMethodFromType(typeof(GregorianCalendar))]
[assembly: PexSuppressUninstrumentedMethodFromType("System.Globalization.CultureData")]
[assembly: PexSuppressUninstrumentedMethodFromType("System.Globalization.CalendarData")]
[assembly: PexSuppressUninstrumentedMethodFromType(typeof(OperatingSystem))]
[assembly: PexSuppressUninstrumentedMethodFromType("System.Globalization.DateTimeFormatInfoScanner")]
[assembly: PexSuppressUninstrumentedMethodFromType(typeof(Calendar))]
[assembly: PexSuppressUninstrumentedMethodFromType("System.DTSubString")]
[assembly: PexSuppressUninstrumentedMethodFromType(typeof(Environment))]

