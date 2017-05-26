/* 
 * Otreeba Open Cannabis API
 *
 * This is an open, canonical database of cannabis seed companies, strains, brands, products, retailers, and studies from [Otreeba](https://otreeba.com). It is written on the OpenAPI Specification AKA Swagger. You can find out more about the Open API Initiative at [https://www.openapis.org/](https://www.openapis.org), or more info on Swagger at [http://swagger.io/](http://swagger.io/).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@otreeba.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing StrainsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class StrainsApiTests
    {
        private StrainsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new StrainsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of StrainsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' StrainsApi
            //Assert.IsInstanceOfType(typeof(StrainsApi), instance, "instance is a StrainsApi");
        }

        
        /// <summary>
        /// Test GetStrainByOcpc
        /// </summary>
        [Test]
        public void GetStrainByOcpcTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string ocpc = null;
            //var response = instance.GetStrainByOcpc(ocpc);
            //Assert.IsInstanceOf<Strain> (response, "response is Strain");
        }
        
        /// <summary>
        /// Test GetStrains
        /// </summary>
        [Test]
        public void GetStrainsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? count = null;
            //string sort = null;
            //var response = instance.GetStrains(page, count, sort);
            //Assert.IsInstanceOf<InlineResponse20011> (response, "response is InlineResponse20011");
        }
        
    }

}