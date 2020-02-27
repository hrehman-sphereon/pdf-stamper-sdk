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
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/InputResultLocation', 'SphereonSDKPdfStamper/model/InputSettings', 'SphereonSDKPdfStamper/model/Lifecycle', 'SphereonSDKPdfStamper/model/ResultSettings', 'SphereonSDKPdfStamper/model/StamperConfig'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./InputResultLocation'), require('./InputSettings'), require('./Lifecycle'), require('./ResultSettings'), require('./StamperConfig'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.PdfStamperJobRequest = factory(root.PdfStamper.ApiClient, root.PdfStamper.InputResultLocation, root.PdfStamper.InputSettings, root.PdfStamper.Lifecycle, root.PdfStamper.ResultSettings, root.PdfStamper.StamperConfig);
  }
}(this, function(ApiClient, InputResultLocation, InputSettings, Lifecycle, ResultSettings, StamperConfig) {
  'use strict';




  /**
   * The PdfStamperJobRequest model module.
   * @module SphereonSDKPdfStamper/model/PdfStamperJobRequest
   * @version 1.0
   */

  /**
   * Constructs a new <code>PdfStamperJobRequest</code>.
   * PDF stamper job request settings
   * @alias module:SphereonSDKPdfStamper/model/PdfStamperJobRequest
   * @class
   * @param configIds {Array.<String>} A list of configuration ids that have to be applied during executing the job.
   * @param inputResults {Array.<module:SphereonSDKPdfStamper/model/InputResultLocation>} The input(s) and optional result(s)
   */
  var exports = function(configIds, inputResults) {
    var _this = this;





    _this['configIds'] = configIds;
    _this['inputResults'] = inputResults;

  };

  /**
   * Constructs a <code>PdfStamperJobRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/PdfStamperJobRequest} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/PdfStamperJobRequest} The populated <code>PdfStamperJobRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('jobLifecycles')) {
        obj['jobLifecycles'] = ApiClient.convertToType(data['jobLifecycles'], [Lifecycle]);
      }
      if (data.hasOwnProperty('inlineConfig')) {
        obj['inlineConfig'] = StamperConfig.constructFromObject(data['inlineConfig']);
      }
      if (data.hasOwnProperty('variables')) {
        obj['variables'] = ApiClient.convertToType(data['variables'], {'String': 'String'});
      }
      if (data.hasOwnProperty('resultSettings')) {
        obj['resultSettings'] = ResultSettings.constructFromObject(data['resultSettings']);
      }
      if (data.hasOwnProperty('configIds')) {
        obj['configIds'] = ApiClient.convertToType(data['configIds'], ['String']);
      }
      if (data.hasOwnProperty('inputResults')) {
        obj['inputResults'] = ApiClient.convertToType(data['inputResults'], [InputResultLocation]);
      }
      if (data.hasOwnProperty('inputSettings')) {
        obj['inputSettings'] = InputSettings.constructFromObject(data['inputSettings']);
      }
    }
    return obj;
  }

  /**
   * The lifecycles of the job itself
   * @member {Array.<module:SphereonSDKPdfStamper/model/Lifecycle>} jobLifecycles
   */
  exports.prototype['jobLifecycles'] = undefined;
  /**
   * Optional job specific config that can be supplied inline. Will be merged with the specified configuration. 
   * @member {module:SphereonSDKPdfStamper/model/StamperConfig} inlineConfig
   */
  exports.prototype['inlineConfig'] = undefined;
  /**
   * A map with key-values used to replace template variables in components.
   * @member {Object.<String, String>} variables
   */
  exports.prototype['variables'] = undefined;
  /**
   * The result file and lifecycle settings
   * @member {module:SphereonSDKPdfStamper/model/ResultSettings} resultSettings
   */
  exports.prototype['resultSettings'] = undefined;
  /**
   * A list of configuration ids that have to be applied during executing the job.
   * @member {Array.<String>} configIds
   */
  exports.prototype['configIds'] = undefined;
  /**
   * The input(s) and optional result(s)
   * @member {Array.<module:SphereonSDKPdfStamper/model/InputResultLocation>} inputResults
   */
  exports.prototype['inputResults'] = undefined;
  /**
   * The input file and lifecycle settings
   * @member {module:SphereonSDKPdfStamper/model/InputSettings} inputSettings
   */
  exports.prototype['inputSettings'] = undefined;



  return exports;
}));


