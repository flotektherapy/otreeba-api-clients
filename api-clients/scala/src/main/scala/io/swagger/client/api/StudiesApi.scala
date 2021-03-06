/**
 * Otreeba Open Cannabis API
 * This is an open, canonical database of cannabis seed companies, strains, brands, products, retailers, and studies from [Otreeba](https://otreeba.com). It is written on the OpenAPI Specification AKA Swagger. You can find out more about the Open API Initiative at [https://www.openapis.org/](https://www.openapis.org), or more info on Swagger at [http://swagger.io/](http://swagger.io/).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@otreeba.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import io.swagger.client.model.InlineResponse20012
import io.swagger.client.model.InlineResponse20013
import io.swagger.client.model.Study
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class StudiesApi(val defBasePath: String = "https://api.otreeba.com/v1",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Get a list of all current studies.
   * Returns a paginated list of studies.
   * @param page Page to be returned. (optional)
   * @param count The number of items to return. Default 10. Max 50. (optional, default to 10)
   * @param sort How to sort the items. (optional, default to -createdAt)
   * @return InlineResponse20012
   */
  def getStudies(page: Option[Integer] = None, count: Option[Integer] /* = 10*/, sort: Option[String] /* = -createdAt*/): Option[InlineResponse20012] = {
    // create path and map variables
    val path = "/studies".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    count.map(paramVal => queryParams += "count" -> paramVal.toString)
    sort.map(paramVal => queryParams += "sort" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[InlineResponse20012]).asInstanceOf[InlineResponse20012])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of all current studies for a given condition.
   * Returns a paginated list of studies.
   * @param conditionSlug Slug of the condition to return studies for. 
   * @param page Page to be returned. (optional)
   * @param count The number of items to return. Default 10. Max 50. (optional, default to 10)
   * @param sort How to sort the items. (optional, default to -year)
   * @return InlineResponse20013
   */
  def getStudiesByCondition(conditionSlug: String, page: Option[Integer] = None, count: Option[Integer] /* = 10*/, sort: Option[String] /* = -year*/): Option[InlineResponse20013] = {
    // create path and map variables
    val path = "/studies/conditions/{conditionSlug}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "conditionSlug" + "\\}",apiInvoker.escape(conditionSlug))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (conditionSlug == null) throw new Exception("Missing required parameter 'conditionSlug' when calling StudiesApi->getStudiesByCondition")

    page.map(paramVal => queryParams += "page" -> paramVal.toString)
    count.map(paramVal => queryParams += "count" -> paramVal.toString)
    sort.map(paramVal => queryParams += "sort" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[InlineResponse20013]).asInstanceOf[InlineResponse20013])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Get a list of all current conditions for studies.
   * Returns a list of all current conditions for studies.
   * @param sort How to sort the items. (optional, default to name)
   * @return Any
   */
  def getStudiesConditions(sort: Option[String] /* = name*/): Option[Any] = {
    // create path and map variables
    val path = "/studies/conditions".replaceAll("\\{format\\}", "json")

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    sort.map(paramVal => queryParams += "sort" -> paramVal.toString)
    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[Any]).asInstanceOf[Any])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Find study by DOI, PubMed ID, or slug.
   * Returns a single study.
   * @param identifierType Type of identifier to for the study to return. 
   * @param identifier Identifier for the study to return. 
   * @return Study
   */
  def getStudyByIdentifier(identifierType: String, identifier: String): Option[Study] = {
    // create path and map variables
    val path = "/studies/{identifierType}/{identifier}".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "identifierType" + "\\}",apiInvoker.escape(identifierType)).replaceAll("\\{" + "identifier" + "\\}",apiInvoker.escape(identifier))

    val contentTypes = List("application/json")
    val contentType = contentTypes(0)

    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if (identifierType == null) throw new Exception("Missing required parameter 'identifierType' when calling StudiesApi->getStudyByIdentifier")

    if (identifier == null) throw new Exception("Missing required parameter 'identifier' when calling StudiesApi->getStudyByIdentifier")

    

    var postBody: AnyRef = null

    if (contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart
      postBody = mp
    } else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(apiInvoker.deserialize(s, "", classOf[Study]).asInstanceOf[Study])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}
