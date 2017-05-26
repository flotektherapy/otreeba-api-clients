/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Flower
import io.swagger.client.model.Inline_response_200_4
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object FlowersApi {

  /**
   * Returns a single flower.
   * 
   * Expected answers:
   *   code 200 : Flower (Successful operation.)
   *   code 400 :  (Invalid OCPC supplied.)
   *   code 401 :  (Unauthorized action.)
   *   code 404 :  (Flower not found.)
   * 
   * @param ocpc OCPC of the flower to return.
   */
  def getFlowerByOcpc(ocpc: String): ApiRequest[Flower] =
    ApiRequest[Flower](ApiMethods.GET, "https://api.otreeba.com/v1", "/flowers/{ocpc}", "application/json")
      .withPathParam("ocpc", ocpc)
      .withSuccessResponse[Flower](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
        /**
   * Returns a paginated list of flowers.
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_4 (Successful operation.)
   *   code 400 :  (Invalid OCPC supplied.)
   *   code 401 :  (Unauthorized action.)
   *   code 404 :  (Flower not found.)
   * 
   * @param page Page to be returned.
   * @param count The number of items to return. Default 10. Max 50.
   * @param sort How to sort the items.
   */
  def getFlowers(page: Option[Int] = None, count: Option[Int], sort: Option[String]): ApiRequest[Inline_response_200_4] =
    ApiRequest[Inline_response_200_4](ApiMethods.GET, "https://api.otreeba.com/v1", "/flowers", "application/json")
      .withQueryParam("page", page)
      .withQueryParam("count", count)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_4](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      

}
