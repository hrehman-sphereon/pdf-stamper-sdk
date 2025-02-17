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
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/Border', 'SphereonSDKPdfStamper/model/Color', 'SphereonSDKPdfStamper/model/Connector', 'SphereonSDKPdfStamper/model/Point', 'SphereonSDKPdfStamper/model/StampComponent'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Border'), require('./Color'), require('./Connector'), require('./Point'), require('./StampComponent'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.TextComponent = factory(root.PdfStamper.ApiClient, root.PdfStamper.Border, root.PdfStamper.Color, root.PdfStamper.Connector, root.PdfStamper.Point, root.PdfStamper.StampComponent);
  }
}(this, function(ApiClient, Border, Color, Connector, Point, StampComponent) {
  'use strict';




  /**
   * The TextComponent model module.
   * @module SphereonSDKPdfStamper/model/TextComponent
   * @version 1.0
   */

  /**
   * Constructs a new <code>TextComponent</code>.
   * An text component to stamp text on a pdf
   * @alias module:SphereonSDKPdfStamper/model/TextComponent
   * @class
   * @extends module:SphereonSDKPdfStamper/model/StampComponent
   * @param type {String} The discriminator type for serialization of the different components
   * @param text {String} The text that will be displayed
   */
  var exports = function(type, text) {
    var _this = this;
    StampComponent.call(_this, type);



    _this['text'] = text;

  };

  /**
   * Constructs a <code>TextComponent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/TextComponent} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/TextComponent} The populated <code>TextComponent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      StampComponent.constructFromObject(data, obj);
      if (data.hasOwnProperty('nonStrokingColor')) {
        obj['nonStrokingColor'] = Color.constructFromObject(data['nonStrokingColor']);
      }
      if (data.hasOwnProperty('fontName')) {
        obj['fontName'] = ApiClient.convertToType(data['fontName'], 'String');
      }
      if (data.hasOwnProperty('fontSize')) {
        obj['fontSize'] = ApiClient.convertToType(data['fontSize'], 'Number');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
      if (data.hasOwnProperty('lineSpacing')) {
        obj['lineSpacing'] = ApiClient.convertToType(data['lineSpacing'], 'Number');
      }
    }
    return obj;
  }

  exports.prototype = Object.create(StampComponent.prototype);
  exports.prototype.constructor = exports;

  /**
   * The color of the text
   * @member {module:SphereonSDKPdfStamper/model/Color} nonStrokingColor
   */
  exports.prototype['nonStrokingColor'] = undefined;
  /**
   * The font of the text
   * @member {String} fontName
   */
  exports.prototype['fontName'] = undefined;
  /**
   * The size of the text
   * @member {Number} fontSize
   */
  exports.prototype['fontSize'] = undefined;
  /**
   * The text that will be displayed
   * @member {String} text
   */
  exports.prototype['text'] = undefined;
  /**
   * Linespacing ratio. The default is 0.5 (meaning half a line height). The spacing is only applicable to newlines within a single text component
   * @member {Number} lineSpacing
   */
  exports.prototype['lineSpacing'] = undefined;



  return exports;
}));


