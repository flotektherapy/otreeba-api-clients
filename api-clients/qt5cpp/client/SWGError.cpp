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


#include "SWGError.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGError::SWGError(QString* json) {
    init();
    this->fromJson(*json);
}

SWGError::SWGError() {
    init();
}

SWGError::~SWGError() {
    this->cleanup();
}

void
SWGError::init() {
    code = 0;
    message = new QString("");
}

void
SWGError::cleanup() {
    

    if(message != nullptr) {
        delete message;
    }
}

SWGError*
SWGError::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGError::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&code, pJson["code"], "qint32", "");
    ::Swagger::setValue(&message, pJson["message"], "QString", "QString");
}

QString
SWGError::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGError::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("code", QJsonValue(code));

    toJsonValue(QString("message"), message, obj, QString("QString"));

    return obj;
}

qint32
SWGError::getCode() {
    return code;
}
void
SWGError::setCode(qint32 code) {
    this->code = code;
}

QString*
SWGError::getMessage() {
    return message;
}
void
SWGError::setMessage(QString* message) {
    this->message = message;
}


}

