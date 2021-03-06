#import "SWGFlower.h"

@implementation SWGFlower

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"ocpc": @"ocpc", @"brand": @"brand", @"type": @"type", @"strain": @"strain", @"_description": @"description", @"qr": @"qr", @"url": @"url", @"image": @"image", @"labTest": @"labTest", @"thc": @"thc", @"cbd": @"cbd", @"createdAt": @"createdAt", @"updatedAt": @"updatedAt" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"ocpc", @"brand", @"type", @"strain", @"_description", @"qr", @"url", @"image", @"labTest", @"thc", @"cbd", @"createdAt", @"updatedAt"];
  return [optionalProperties containsObject:propertyName];
}

@end
