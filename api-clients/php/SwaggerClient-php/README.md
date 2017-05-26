# SwaggerClient-php
This is an open, canonical database of cannabis seed companies, strains, brands, products, retailers, and studies from [Otreeba](https://otreeba.com). It is written on the OpenAPI Specification AKA Swagger. You can find out more about the Open API Initiative at [https://www.openapis.org/](https://www.openapis.org), or more info on Swagger at [http://swagger.io/](http://swagger.io/).

This PHP package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.0
- Build package: io.swagger.codegen.languages.PhpClientCodegen

## Requirements

PHP 5.4.0 and later

## Installation & Usage
### Composer

To install the bindings via [Composer](http://getcomposer.org/), add the following to `composer.json`:

```
{
  "repositories": [
    {
      "type": "git",
      "url": "https://github.com//.git"
    }
  ],
  "require": {
    "/": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
    require_once('/path/to/SwaggerClient-php/autoload.php');
```

## Tests

To run the unit tests:

```
composer install
./vendor/bin/phpunit
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BrandsApi();
$ocpc = "ocpc_example"; // string | OCPC of the brand to return.

try {
    $result = $api_instance->getBrandByOcpc($ocpc);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BrandsApi->getBrandByOcpc: ', $e->getMessage(), PHP_EOL;
}

?>
```

## Documentation for API Endpoints

All URIs are relative to *https://api.otreeba.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BrandsApi* | [**getBrandByOcpc**](docs/Api/BrandsApi.md#getbrandbyocpc) | **GET** /brands/{ocpc} | Find brand by Open Cannabis Product Code (OCPC).
*BrandsApi* | [**getBrandEdibles**](docs/Api/BrandsApi.md#getbrandedibles) | **GET** /brands/{ocpc}/edibles | Get a list of all current edibles for the given brand.
*BrandsApi* | [**getBrandExtracts**](docs/Api/BrandsApi.md#getbrandextracts) | **GET** /brands/{ocpc}/extracts | Get a list of all current extracts for the given brand.
*BrandsApi* | [**getBrandFlowers**](docs/Api/BrandsApi.md#getbrandflowers) | **GET** /brands/{ocpc}/flowers | Get a list of all current flowers for the given brand.
*BrandsApi* | [**getBrandProducts**](docs/Api/BrandsApi.md#getbrandproducts) | **GET** /brands/{ocpc}/products | Get a list of all current products for the given brand.
*BrandsApi* | [**getBrands**](docs/Api/BrandsApi.md#getbrands) | **GET** /brands | Get a list of all current brands.
*EdiblesApi* | [**getEdibleByOcpc**](docs/Api/EdiblesApi.md#getediblebyocpc) | **GET** /edibles/{ocpc} | Find edible by Open Cannabis Product Code (OCPC).
*EdiblesApi* | [**getEdibles**](docs/Api/EdiblesApi.md#getedibles) | **GET** /edibles | Get a list of all current edibles.
*ExtractsApi* | [**getExtractByOcpc**](docs/Api/ExtractsApi.md#getextractbyocpc) | **GET** /extracts/{ocpc} | Find extract by Open Cannabis Product Code (OCPC).
*ExtractsApi* | [**getExtracts**](docs/Api/ExtractsApi.md#getextracts) | **GET** /extracts | Get a list of all current extracts.
*FlowersApi* | [**getFlowerByOcpc**](docs/Api/FlowersApi.md#getflowerbyocpc) | **GET** /flowers/{ocpc} | Find flower by Open Cannabis Product Code (OCPC).
*FlowersApi* | [**getFlowers**](docs/Api/FlowersApi.md#getflowers) | **GET** /flowers | Get a list of all current flowers.
*ProductsApi* | [**getProductByOcpc**](docs/Api/ProductsApi.md#getproductbyocpc) | **GET** /products/{ocpc} | Find product by Open Cannabis Product Code (OCPC).
*ProductsApi* | [**getProducts**](docs/Api/ProductsApi.md#getproducts) | **GET** /products | Get a list of all current products.
*SeedCompaniesApi* | [**getSeedCompanies**](docs/Api/SeedCompaniesApi.md#getseedcompanies) | **GET** /seed-companies | Get a list of all current seed companies.
*SeedCompaniesApi* | [**getSeedCompanyByOcpc**](docs/Api/SeedCompaniesApi.md#getseedcompanybyocpc) | **GET** /seed-companies/{ocpc} | Find seed company by Open Cannabis Product Code (OCPC).
*SeedCompaniesApi* | [**getSeedCompanyStrainsByOcpc**](docs/Api/SeedCompaniesApi.md#getseedcompanystrainsbyocpc) | **GET** /seed-companies/{ocpc}/strains | Find strains for a seed company by Open Cannabis Product Code (OCPC).
*StrainsApi* | [**getStrainByOcpc**](docs/Api/StrainsApi.md#getstrainbyocpc) | **GET** /strains/{ocpc} | Find strain by Open Cannabis Product Code (OCPC).
*StrainsApi* | [**getStrains**](docs/Api/StrainsApi.md#getstrains) | **GET** /strains | Get a list of all current strains.


## Documentation For Models

 - [Brand](docs/Model/Brand.md)
 - [Edible](docs/Model/Edible.md)
 - [Error](docs/Model/Error.md)
 - [Extract](docs/Model/Extract.md)
 - [Flower](docs/Model/Flower.md)
 - [InlineResponse200](docs/Model/InlineResponse200.md)
 - [InlineResponse2001](docs/Model/InlineResponse2001.md)
 - [InlineResponse20010](docs/Model/InlineResponse20010.md)
 - [InlineResponse20010Meta](docs/Model/InlineResponse20010Meta.md)
 - [InlineResponse20011](docs/Model/InlineResponse20011.md)
 - [InlineResponse20011Meta](docs/Model/InlineResponse20011Meta.md)
 - [InlineResponse2001Meta](docs/Model/InlineResponse2001Meta.md)
 - [InlineResponse2002](docs/Model/InlineResponse2002.md)
 - [InlineResponse2002Meta](docs/Model/InlineResponse2002Meta.md)
 - [InlineResponse2003](docs/Model/InlineResponse2003.md)
 - [InlineResponse2003Meta](docs/Model/InlineResponse2003Meta.md)
 - [InlineResponse2004](docs/Model/InlineResponse2004.md)
 - [InlineResponse2004Meta](docs/Model/InlineResponse2004Meta.md)
 - [InlineResponse2005](docs/Model/InlineResponse2005.md)
 - [InlineResponse2005Meta](docs/Model/InlineResponse2005Meta.md)
 - [InlineResponse2006](docs/Model/InlineResponse2006.md)
 - [InlineResponse2006Meta](docs/Model/InlineResponse2006Meta.md)
 - [InlineResponse2007](docs/Model/InlineResponse2007.md)
 - [InlineResponse2007Meta](docs/Model/InlineResponse2007Meta.md)
 - [InlineResponse2008](docs/Model/InlineResponse2008.md)
 - [InlineResponse2008Meta](docs/Model/InlineResponse2008Meta.md)
 - [InlineResponse2009](docs/Model/InlineResponse2009.md)
 - [InlineResponse2009Meta](docs/Model/InlineResponse2009Meta.md)
 - [InlineResponse200Meta](docs/Model/InlineResponse200Meta.md)
 - [Pagination](docs/Model/Pagination.md)
 - [Product](docs/Model/Product.md)
 - [SeedCompany](docs/Model/SeedCompany.md)
 - [Strain](docs/Model/Strain.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author

api@otreeba.com

