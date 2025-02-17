/**
 * PDF stamper
 * The PDF Stamper API enables the possibility to add both static and dynamic stamps on existing PDFs. The stamps can consist of one or more barcode, hyperlink, image, line or text elements.    The flow is generally as follows:  1. Make a configuration containing the stamp information  2. Create a job specifying the desired configuration  3. Add one or more PDF files to the job  4. Start the job for processing  5. Retrieve the processed files    Full API Documentation: https://docs.sphereon.com/api/pdf-stamper/1.0  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 1.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.3.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/Border', 'SphereonSDKPdfStamper/model/Connector', 'SphereonSDKPdfStamper/model/Dimension', 'SphereonSDKPdfStamper/model/Point', 'SphereonSDKPdfStamper/model/StampComponent', 'SphereonSDKPdfStamper/model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Border'), require('./Connector'), require('./Dimension'), require('./Point'), require('./StampComponent'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.ImageComponent = factory(root.PdfStamper.ApiClient, root.PdfStamper.Border, root.PdfStamper.Connector, root.PdfStamper.Dimension, root.PdfStamper.Point, root.PdfStamper.StampComponent, root.PdfStamper.StreamLocation);
  }
}(this, function(ApiClient, Border, Connector, Dimension, Point, StampComponent, StreamLocation) {
  'use strict';




  /**
   * The ImageComponent model module.
   * @module SphereonSDKPdfStamper/model/ImageComponent
   * @version 1.0
   */

  /**
   * Constructs a new <code>ImageComponent</code>.
   * An image component to stamp an image on a pdf
   * @alias module:SphereonSDKPdfStamper/model/ImageComponent
   * @class
   * @extends module:SphereonSDKPdfStamper/model/StampComponent
   * @param type {String} The discriminator type for serialization of the different components
   */
  var exports = function(type) {
    var _this = this;
    StampComponent.call(_this, type);



  };

  /**
   * Constructs a <code>ImageComponent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/ImageComponent} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/ImageComponent} The populated <code>ImageComponent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      StampComponent.constructFromObject(data, obj);
      if (data.hasOwnProperty('imageData')) {
        obj['imageData'] = ApiClient.convertToType(data['imageData'], 'String');
      }
      if (data.hasOwnProperty('scaledDimension')) {
        obj['scaledDimension'] = Dimension.constructFromObject(data['scaledDimension']);
      }
      if (data.hasOwnProperty('imageStreamLocation')) {
        obj['imageStreamLocation'] = StreamLocation.constructFromObject(data['imageStreamLocation']);
      }
    }
    return obj;
  }

  exports.prototype = Object.create(StampComponent.prototype);
  exports.prototype.constructor = exports;

  /**
   * The image as a base64 string if a stream location is not being used
   * @member {String} imageData
   */
  exports.prototype['imageData'] = undefined;
  /**
   * The preferred dimension of the image
   * @member {module:SphereonSDKPdfStamper/model/Dimension} scaledDimension
   */
  exports.prototype['scaledDimension'] = undefined;
  /**
   * The stream location of the image. This is used if image data hasn't been set
   * @member {module:SphereonSDKPdfStamper/model/StreamLocation} imageStreamLocation
   */
  exports.prototype['imageStreamLocation'] = undefined;



  return exports;
}));


