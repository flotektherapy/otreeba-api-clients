#import <Foundation/Foundation.h>

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


extern NSString * SWGPercentEscapedStringFromString(NSString *string);

extern NSString * const kSWGApplicationJSONType;

@protocol SWGSanitizer <NSObject>

/**
 * Sanitize object for request
 *
 * @param object The query/path/header/form/body param to be sanitized.
 */
- (id) sanitizeForSerialization:(id) object;

/**
 * Convert parameter to NSString
 */
- (NSString *) parameterToString: (id) param;

/**
 * Detects Accept header from accepts NSArray
 *
 * @param accepts NSArray of header
 *
 * @return The Accept header
 */
-(NSString *) selectHeaderAccept:(NSArray *)accepts;

/**
 * Detects Content-Type header from contentTypes NSArray
 *
 * @param contentTypes NSArray of header
 *
 * @return The Content-Type header
 */
-(NSString *) selectHeaderContentType:(NSArray *)contentTypes;

@end

@interface SWGSanitizer : NSObject <SWGSanitizer>



@end