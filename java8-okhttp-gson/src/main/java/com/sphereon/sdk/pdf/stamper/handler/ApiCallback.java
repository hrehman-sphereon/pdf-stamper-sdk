/*
 * PDF stamper
 * The PDF Stamper API enables the possibility to add both static and dynamic stamps on existing PDFs. The stamps can consist of one or more barcode, hyperlink, image, line or text elements.    The flow is generally as follows:  1. Make a configuration containing the stamp information  2. Create a job specifying the desired configuration  3. Add one or more PDF files to the job  4. Start the job for processing  5. Retrieve the processed files    Full API Documentation: https://docs.sphereon.com/api/pdf-stamper/1.0  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 1.0
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.pdf.stamper.handler;

import java.io.IOException;

import java.util.Map;
import java.util.List;

/**
 * Callback for asynchronous API call.
 *
 * @param <T> The return type
 */
public interface ApiCallback<T> {
    /**
     * This is called when the API call fails.
     *
     * @param e The exception causing the failure
     * @param statusCode Status code of the response if available, otherwise it would be 0
     * @param responseHeaders Headers of the response if available, otherwise it would be null
     */
    void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API call succeeded.
     *
     * @param result The result deserialized from response
     * @param statusCode Status code of the response
     * @param responseHeaders Headers of the response
     */
    void onSuccess(T result, int statusCode, Map<String, List<String>> responseHeaders);

    /**
     * This is called when the API upload processing.
     *
     * @param bytesWritten bytes Written
     * @param contentLength content length of request body
     * @param done write end
     */
    void onUploadProgress(long bytesWritten, long contentLength, boolean done);

    /**
     * This is called when the API downlond processing.
     *
     * @param bytesRead bytes Read
     * @param contentLength content lenngth of the response
     * @param done Read end
     */
    void onDownloadProgress(long bytesRead, long contentLength, boolean done);
}
