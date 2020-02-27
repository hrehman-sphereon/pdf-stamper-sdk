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
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/Point', 'SphereonSDKPdfStamper/model/StampComponent'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Point'), require('./StampComponent'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.Connector = factory(root.PdfStamper.ApiClient, root.PdfStamper.Point, root.PdfStamper.StampComponent);
  }
}(this, function(ApiClient, Point, StampComponent) {
  'use strict';




  /**
   * The Connector model module.
   * @module SphereonSDKPdfStamper/model/Connector
   * @version 1.0
   */

  /**
   * Constructs a new <code>Connector</code>.
   * Connection between components containing anchor points and offset of the component
   * @alias module:SphereonSDKPdfStamper/model/Connector
   * @class
   * @param horizontalAnchorPoint {module:SphereonSDKPdfStamper/model/Connector.HorizontalAnchorPointEnum} The horizontal anchor point to which the components are connected
   * @param verticalAnchorPoint {module:SphereonSDKPdfStamper/model/Connector.VerticalAnchorPointEnum} The vertical anchor point to which the components are connected
   */
  var exports = function(horizontalAnchorPoint, verticalAnchorPoint) {
    var _this = this;



    _this['horizontalAnchorPoint'] = horizontalAnchorPoint;
    _this['verticalAnchorPoint'] = verticalAnchorPoint;
  };

  /**
   * Constructs a <code>Connector</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/Connector} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/Connector} The populated <code>Connector</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('components')) {
        obj['components'] = ApiClient.convertToType(data['components'], [StampComponent]);
      }
      if (data.hasOwnProperty('offset')) {
        obj['offset'] = Point.constructFromObject(data['offset']);
      }
      if (data.hasOwnProperty('horizontalAnchorPoint')) {
        obj['horizontalAnchorPoint'] = ApiClient.convertToType(data['horizontalAnchorPoint'], 'String');
      }
      if (data.hasOwnProperty('verticalAnchorPoint')) {
        obj['verticalAnchorPoint'] = ApiClient.convertToType(data['verticalAnchorPoint'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:SphereonSDKPdfStamper/model/StampComponent>} components
   */
  exports.prototype['components'] = undefined;
  /**
   * The offset op the components relative to the parent component
   * @member {module:SphereonSDKPdfStamper/model/Point} offset
   */
  exports.prototype['offset'] = undefined;
  /**
   * The horizontal anchor point to which the components are connected
   * @member {module:SphereonSDKPdfStamper/model/Connector.HorizontalAnchorPointEnum} horizontalAnchorPoint
   */
  exports.prototype['horizontalAnchorPoint'] = undefined;
  /**
   * The vertical anchor point to which the components are connected
   * @member {module:SphereonSDKPdfStamper/model/Connector.VerticalAnchorPointEnum} verticalAnchorPoint
   */
  exports.prototype['verticalAnchorPoint'] = undefined;


  /**
   * Allowed values for the <code>horizontalAnchorPoint</code> property.
   * @enum {String}
   * @readonly
   */
  exports.HorizontalAnchorPointEnum = {
    /**
     * value: "LEFT"
     * @const
     */
    "LEFT": "LEFT",
    /**
     * value: "CENTER"
     * @const
     */
    "CENTER": "CENTER",
    /**
     * value: "RIGHT"
     * @const
     */
    "RIGHT": "RIGHT"  };

  /**
   * Allowed values for the <code>verticalAnchorPoint</code> property.
   * @enum {String}
   * @readonly
   */
  exports.VerticalAnchorPointEnum = {
    /**
     * value: "TOP"
     * @const
     */
    "TOP": "TOP",
    /**
     * value: "MIDDLE"
     * @const
     */
    "MIDDLE": "MIDDLE",
    /**
     * value: "BOTTOM"
     * @const
     */
    "BOTTOM": "BOTTOM"  };


  return exports;
}));


