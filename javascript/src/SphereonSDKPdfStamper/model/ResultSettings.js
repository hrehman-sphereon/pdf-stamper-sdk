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
    define(['SphereonSDKPdfStamper/ApiClient', 'SphereonSDKPdfStamper/model/Lifecycle', 'SphereonSDKPdfStamper/model/StorageLocation'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Lifecycle'), require('./StorageLocation'));
  } else {
    // Browser globals (root is window)
    if (!root.PdfStamper) {
      root.PdfStamper = {};
    }
    root.PdfStamper.ResultSettings = factory(root.PdfStamper.ApiClient, root.PdfStamper.Lifecycle, root.PdfStamper.StorageLocation);
  }
}(this, function(ApiClient, Lifecycle, StorageLocation) {
  'use strict';




  /**
   * The ResultSettings model module.
   * @module SphereonSDKPdfStamper/model/ResultSettings
   * @version 1.0
   */

  /**
   * Constructs a new <code>ResultSettings</code>.
   * Result settings
   * @alias module:SphereonSDKPdfStamper/model/ResultSettings
   * @class
   * @param storageMode {module:SphereonSDKPdfStamper/model/ResultSettings.StorageModeEnum} Storage mode. Can be a configured storage location on the storage API, a job id folder in the supplied storage location or completely replacing the input files (streamlocations).
   */
  var exports = function(storageMode) {
    var _this = this;

    _this['storageMode'] = storageMode;


  };

  /**
   * Constructs a <code>ResultSettings</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:SphereonSDKPdfStamper/model/ResultSettings} obj Optional instance to populate.
   * @return {module:SphereonSDKPdfStamper/model/ResultSettings} The populated <code>ResultSettings</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('storageMode')) {
        obj['storageMode'] = ApiClient.convertToType(data['storageMode'], 'String');
      }
      if (data.hasOwnProperty('storageLocation')) {
        obj['storageLocation'] = StorageLocation.constructFromObject(data['storageLocation']);
      }
      if (data.hasOwnProperty('lifecycles')) {
        obj['lifecycles'] = ApiClient.convertToType(data['lifecycles'], [Lifecycle]);
      }
    }
    return obj;
  }

  /**
   * Storage mode. Can be a configured storage location on the storage API, a job id folder in the supplied storage location or completely replacing the input files (streamlocations).
   * @member {module:SphereonSDKPdfStamper/model/ResultSettings.StorageModeEnum} storageMode
   */
  exports.prototype['storageMode'] = undefined;
  /**
   * Result Storage location
   * @member {module:SphereonSDKPdfStamper/model/StorageLocation} storageLocation
   */
  exports.prototype['storageLocation'] = undefined;
  /**
   * The lifecycle of result files
   * @member {Array.<module:SphereonSDKPdfStamper/model/Lifecycle>} lifecycles
   */
  exports.prototype['lifecycles'] = undefined;


  /**
   * Allowed values for the <code>storageMode</code> property.
   * @enum {String}
   * @readonly
   */
  exports.StorageModeEnum = {
    /**
     * value: "STORAGE_LOCATION"
     * @const
     */
    "STORAGE_LOCATION": "STORAGE_LOCATION",
    /**
     * value: "STORAGE_LOCATION_JOB_IDS"
     * @const
     */
    "STORAGE_LOCATION_JOB_IDS": "STORAGE_LOCATION_JOB_IDS",
    /**
     * value: "REPLACE_INPUT"
     * @const
     */
    "REPLACE_INPUT": "REPLACE_INPUT"  };


  return exports;
}));


