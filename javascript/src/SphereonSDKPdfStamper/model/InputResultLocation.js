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
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/StreamLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./StreamLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.InputResultLocation = factory(root.PdfStamper.ApiClient, root.PdfStamper.StreamLocation);
  }
}(this, function(ApiClient, StreamLocation) {
  'use strict';




  /**
   * The InputResultLocation model module.
   * @module SphereonSDKPdfStamper/model/InputResultLocation
   * @version 1.0
   */

  /**
   * Constructs a new <code>InputResultLocation</code>.
   * Input and result streamlocation pair allows to specify an optional result location for the input stream lcoation
   * @alias module:SphereonSDKPdfStamper/model/InputResultLocation
   * @class
   * @param input {module:SphereonSDKPdfStamper/model/StreamLocation} The input stream location of the pre stamped PDF file
   */
  var exports = function(input) {
    var _this = this;


    _this['input'] = input;

  };

  /**
   * Constructs a <code>InputResultLocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/InputResultLocation} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/InputResultLocation} The populated <code>InputResultLocation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('result')) {
        obj['result'] = StreamLocation.constructFromObject(data['result']);
      }
      if (data.hasOwnProperty('input')) {
        obj['input'] = StreamLocation.constructFromObject(data['input']);
      }
      if (data.hasOwnProperty('correlationId')) {
        obj['correlationId'] = ApiClient.convertToType(data['correlationId'], 'String');
      }
    }
    return obj;
  }

  /**
   * Optional result stream location, otherwise the default job settings will be honored for the results
   * @member {module:SphereonSDKPdfStamper/model/StreamLocation} result
   */
  exports.prototype['result'] = undefined;
  /**
   * The input stream location of the pre stamped PDF file
   * @member {module:SphereonSDKPdfStamper/model/StreamLocation} input
   */
  exports.prototype['input'] = undefined;
  /**
   * The id to associate with this input result location pair. Will be created (using a UUID) if not provided
   * @member {String} correlationId
   */
  exports.prototype['correlationId'] = undefined;



  return exports;
}));


