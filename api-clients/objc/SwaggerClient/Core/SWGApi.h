#import <Foundation/Foundation.h>

@class SWGApiClient;

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


@protocol SWGApi <NSObject>

@property(readonly, nonatomic, strong) SWGApiClient *apiClient;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient;

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key;
-(NSString*) defaultHeaderForKey:(NSString*)key;

-(NSDictionary *)defaultHeaders;

@end
