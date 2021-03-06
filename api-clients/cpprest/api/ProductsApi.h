/**
 * Otreeba Open Cannabis API
 * This is an open, canonical database of cannabis seed companies, strains, brands, products, retailers, and studies from [Otreeba](https://otreeba.com). It is written on the OpenAPI Specification AKA Swagger. You can find out more about the Open API Initiative at [https://www.openapis.org/](https://www.openapis.org), or more info on Swagger at [http://swagger.io/](http://swagger.io/).
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@otreeba.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.2.3.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * ProductsApi.h
 *
 * 
 */

#ifndef ProductsApi_H_
#define ProductsApi_H_


#include "ApiClient.h"

#include "Inline_response_200_10.h"
#include "Product.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  ProductsApi
{
public:
    ProductsApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~ProductsApi();
    /// <summary>
    /// Find product by Open Cannabis Product Code (OCPC).
    /// </summary>
    /// <remarks>
    /// Returns a single product.
    /// </remarks>
    /// <param name="ocpc">OCPC of the product to return.</param>
    pplx::task<std::shared_ptr<Product>> getProductByOcpc(utility::string_t ocpc);
    /// <summary>
    /// Get a list of all current products.
    /// </summary>
    /// <remarks>
    /// Returns a paginated list of products.
    /// </remarks>
    /// <param name="page">Page to be returned. (optional)</param>/// <param name="count">The number of items to return. Default 10. Max 50. (optional, default to 10)</param>/// <param name="sort">How to sort the items. (optional, default to -createdAt)</param>
    pplx::task<std::shared_ptr<Inline_response_200_10>> getProducts(int32_t page, int32_t count, utility::string_t sort);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ProductsApi_H_ */

