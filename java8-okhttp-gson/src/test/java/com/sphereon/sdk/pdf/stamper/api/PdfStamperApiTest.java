/*
 * PDF stamper
 * The PDF stamper API enables the possibility to add both static and dynamic stamps on existing PDFs. The stamps can consist of one or more text, image or barcode elements.    The flow is generally as follows:  1. Make sure a configuration is present using the config API  2. Create a job specifying the desired configuration  3. Add one or more PDF files to the job  4. Start the job, optionally   5. Retrieve the processed files   A simplified flow is available using the sync controller    Full API Documentation: https://docs.sphereon.com/api/pdf/stamp/0.1/html  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.1
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sphereon.sdk.pdf.stamper.api;

import com.sphereon.sdk.pdf.stamper.handler.ApiClient;
import com.sphereon.sdk.pdf.stamper.handler.ApiException;
import com.sphereon.sdk.pdf.stamper.handler.Configuration;
import com.sphereon.sdk.pdf.stamper.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * API tests for JobsApi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PdfStamperApiTest {

    private static String jobId;
    private static String configId;
    private static StreamLocation imageStreamLocation;
    private final ConfigApi configApi = new ConfigApi();
    private final JobsApi jobsApi = new JobsApi();

    @Before
    public void initClient() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        String accessToken = System.getenv("sphereon.access.token"); // YOUR ACCESS TOKEN
        apiClient.setAccessToken(accessToken);
        apiClient.setConnectTimeout(10000);
        configApi.setApiClient(apiClient);
        jobsApi.setApiClient(apiClient);
    }

    /**
     * Create PDF stamper configuration
     * <p>
     * Create / initialize a new PDF stamper configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _01_createConfigurationTest() throws ApiException {
        // Create an offset to the left and up
        Point offset = new Point();
        offset.setX(-10f);
        offset.setY(10f);

        // Create an invisible hyperlink at the offset
        HyperlinkComponent hyperlinkComponent = new HyperlinkComponent();
        hyperlinkComponent.setAddress("https://sphereon.com");
        hyperlinkComponent.setWidth(100);
        hyperlinkComponent.setHeight(90);
        hyperlinkComponent.setOffset(offset);
        hyperlinkComponent.setConnectors(new ArrayList<>());

        // Add the hyperlink to a canvas connector
        Connector canvasConnector = new Connector();
        canvasConnector.setHorizontalAnchorPoint(Connector.HorizontalAnchorPointEnum.RIGHT);
        canvasConnector.setVerticalAnchorPoint(Connector.VerticalAnchorPointEnum.BOTTOM);
        canvasConnector.setComponents(Arrays.asList(hyperlinkComponent));

        // Create the canvas component on the first page and add the canvas connecter as the only connector on the page
        CanvasComponent canvasComponent = new CanvasComponent();
        canvasComponent.setPageOperation(CanvasComponent.PageOperationEnum.STAMP);
        canvasComponent.setPageSelector(CanvasComponent.PageSelectorEnum.FIRST_PAGE);
        canvasComponent.setConnectors(Arrays.asList(canvasConnector));
        canvasComponent.setSpecificPages(new ArrayList<>());
        canvasComponent.setPosition(CanvasComponent.PositionEnum.FOREGROUND);

        // Create a configuration with the above
        StamperConfig config = new StamperConfig();
        config.setCanvasComponents(Arrays.asList(canvasComponent));

        StamperConfigResponse response = configApi.createConfiguration(config);

        Assert.assertNotNull(response);
        configId = response.getConfigId();

        Assert.assertNotNull(configId);
        Assert.assertEquals(StamperConfigResponse.ConfigStatusEnum.CREATED, response.getConfigStatus());

        Assert.assertEquals(config, response.getConfig());
    }

    /**
     * Upload resource
     * <p>
     * Upload a resource needed by a configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _02_uploadResourceTest() throws ApiException {
        File resource = resource("/logo.png");
        imageStreamLocation = configApi.uploadResource(configId, resource);

        Assert.assertNotNull(imageStreamLocation);
        Assert.assertNotNull(imageStreamLocation.getContainerId());
        Assert.assertNotNull("logo.png", imageStreamLocation.getFilename());
    }

    /**
     * Update PDF stamper configuration
     * <p>
     * Update an existing PDF stamper configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _03_updateConfigurationTest() throws ApiException {
        Point offset = new Point();
        offset.setX(-10f);
        offset.setY(10f);

        Dimension scaledDimension = new Dimension();
        scaledDimension.setHeight(50f);
        scaledDimension.setWidth(50f);

        ImageComponent logoComponent = new ImageComponent();
        logoComponent.setImageStreamLocation(imageStreamLocation);
        logoComponent.setScaledDimension(scaledDimension);

        Color borderColor = new Color();
        borderColor.setName(Color.NameEnum.BLACK);

        Border hyperlinkBorder = new Border();
        hyperlinkBorder.setColor(borderColor);

        HyperlinkComponent hyperlinkComponent = new HyperlinkComponent();
        hyperlinkComponent.setAddress("https://sphereon.com");
        hyperlinkComponent.setWidth(50);
        hyperlinkComponent.setHeight(50);
        hyperlinkComponent.setBorder(hyperlinkBorder);

        Connector rightComponentConnector = new Connector();
        rightComponentConnector.setHorizontalAnchorPoint(Connector.HorizontalAnchorPointEnum.RIGHT);
        rightComponentConnector.setVerticalAnchorPoint(Connector.VerticalAnchorPointEnum.BOTTOM);
        rightComponentConnector.setComponents(Arrays.asList(logoComponent, hyperlinkComponent));
        rightComponentConnector.setOffset(offset);

        CanvasComponent firstPageCanvasComponent = new CanvasComponent();
        firstPageCanvasComponent.setPageOperation(CanvasComponent.PageOperationEnum.STAMP);
        firstPageCanvasComponent.setPageSelector(CanvasComponent.PageSelectorEnum.FIRST_PAGE);
        firstPageCanvasComponent.setConnectors(Arrays.asList(rightComponentConnector));

        Point textOffset = new Point();
        textOffset.setX(0f);
        textOffset.setY(13f);

        TextComponent textComponent = new TextComponent();
        textComponent.setText("Text example: ${example-variable}");
        textComponent.setFontSize(9f);
        textComponent.setOffset(textOffset);

        Point lineTo = new Point();
        lineTo.setX(150f);
        lineTo.setY(0f);

        Point lineOffset = new Point();
        lineOffset.setX(0f);
        lineOffset.setY(3f);

        RGBValue redRGB = new RGBValue();
        redRGB.setR(255);
        redRGB.setG(0);
        redRGB.setB(0);

        Color lineColor = new Color();
        lineColor.setRgbValue(redRGB);

        LineComponent lineComponent = new LineComponent();
        lineComponent.setColor(lineColor);
        lineComponent.setLineWidth(1f);
        lineComponent.setLineTo(lineTo);
        lineComponent.setOffset(lineOffset);

        Connector barcodeConnector = new Connector();
        barcodeConnector.setHorizontalAnchorPoint(Connector.HorizontalAnchorPointEnum.LEFT);
        barcodeConnector.setVerticalAnchorPoint(Connector.VerticalAnchorPointEnum.TOP);
        barcodeConnector.setComponents(Arrays.asList(lineComponent, textComponent));

        Point barcodeOffset = new Point();
        barcodeOffset.setX(10f);
        barcodeOffset.setY(10f);

        BarcodeComponent barcodeComponent = new BarcodeComponent();
        barcodeComponent.setBarcodeFormat(BarcodeComponent.BarcodeFormatEnum.QR_CODE);
        barcodeComponent.setContent("https://store.sphereon.com/store/");
        barcodeComponent.setWidth(20);
        barcodeComponent.setHeight(20);
        barcodeComponent.setOffset(barcodeOffset);
        barcodeComponent.setConnectors(Arrays.asList(barcodeConnector));

        Connector leftCanvasConnector = new Connector();
        leftCanvasConnector.setHorizontalAnchorPoint(Connector.HorizontalAnchorPointEnum.LEFT);
        leftCanvasConnector.setVerticalAnchorPoint(Connector.VerticalAnchorPointEnum.BOTTOM);
        leftCanvasConnector.setComponents(Arrays.asList(barcodeComponent));

        CanvasComponent allPageCanvasComponent = new CanvasComponent();
        allPageCanvasComponent.setPageOperation(CanvasComponent.PageOperationEnum.STAMP);
        allPageCanvasComponent.setPageSelector(CanvasComponent.PageSelectorEnum.ALL_PAGES);
        allPageCanvasComponent.setConnectors(Arrays.asList(leftCanvasConnector));

        StamperConfig config = new StamperConfig();
        config.setCanvasComponents(Arrays.asList(allPageCanvasComponent, firstPageCanvasComponent));

        StamperConfigResponse response = configApi.updateConfiguration(configId, config);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getConfigId());
        Assert.assertEquals(StamperConfigResponse.ConfigStatusEnum.UPDATED, response.getConfigStatus());

        // assert deep config equals
        Assert.assertEquals(config.getCanvasComponents().size(), response.getConfig().getCanvasComponents().size());
    }

    /**
     * Get PDF stamper configuration
     * <p>
     * Retrieve a PDF stamper configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _04_getConfigurationTest() throws ApiException {
        StamperConfigResponse response = configApi.getConfiguration(configId);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getConfigId());
        Assert.assertEquals(StamperConfigResponse.ConfigStatusEnum.UPDATED, response.getConfigStatus());
    }

    /**
     * Create PDF stamper job
     * <p>
     * Create a job using the given settings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _10_createJobTest() throws ApiException {
        PdfStamperJobRequest jobRequest = new PdfStamperJobRequest();
        jobRequest.addConfigIdsItem(configId);
        jobRequest.putVariablesItem("example-variable", "Hello Stamp World");
        PdfStamperJobResult response = jobsApi.createJob(jobRequest);

        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getJobId());
        Assert.assertEquals(PdfStamperJobResult.JobStatusEnum.CREATED, response.getJobStatus());

        jobId = response.getJobId();
    }

    /**
     * Upload a file
     * <p>
     * Upload an image, office or pdf for conversion to PDF. Please note that you can upload multiple files. Conversion will not be started yet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _11_addInputFileTest() throws ApiException {
        File stream = resource("/canvas.pdf");
        PdfStamperJobResult response = jobsApi.addInputFile(jobId, stream);

        Assert.assertNotNull(response);
        Assert.assertEquals(1, response.getInputResults().size());
        Assert.assertNotNull(response.getInputResults().get(0).getInput());
        Assert.assertEquals(PdfStamperJobResult.JobStatusEnum.INPUTS_UPLOADED, response.getJobStatus());
    }

    /**
     * Submit PDF job for processing
     * <p>
     * Start PDF conversion. Convert the previously uploaded file(s) to PDF. The settings supplied with the job in the request body are used for the conversion. You can only submit the job after a new Job is created with status INPUTS_UPLOADED or resubmit an existing Job with status ERROR. In all cases the job Id in the path must match the jobId in the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _12_submitJobTest() throws ApiException {
        Map<String, String> variables = new HashMap<>();
        variables.put("variable", "created by an unit test");

        PdfStamperJobRequest jobSettings = new PdfStamperJobRequest();
        jobSettings.addConfigIdsItem(configId);
        jobSettings.setVariables(variables);

        PdfStamperJobResult response = jobsApi.submitJob(jobId);

        Assert.assertNotNull(response);
        Assert.assertEquals(PdfStamperJobResult.JobStatusEnum.PROCESSING, response.getJobStatus());
    }

    /**
     * Job definition and state
     * <p>
     * Get the PDF job definition and current state. Please note that you can differentiate based on http response status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _13_getJobTest() throws ApiException, InterruptedException {
        // poll the job until it's finished processing
        int count = 180;
        while (count > 0) {
            Thread.sleep(1000);
            count--;

            PdfStamperJobResult response = jobsApi.getJob(jobId);
            if (response.getJobStatus() != PdfStamperJobResult.JobStatusEnum.PROCESSING) {
                System.out.println("job finished processing: " + response);
                break;
            }
        }
    }

    /**
     * Get the current result stream
     * <p>
     * Get the PDF as binary stream/file.  Our API generation does not allow changing the media type based on the Accepted header unfortunately.  This means we use a seperate path postfix with the value &#39;/stream&#39;.  This API only returns the PDF when the response status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _14_getStreamTest() throws ApiException, IOException {
        byte[] response = jobsApi.getFirstStream(jobId);

        File tempFile= File.createTempFile("unit-test",".pdf");
        try (FileOutputStream fos = new FileOutputStream(tempFile)) {
            fos.write(response);
        }

        Assert.assertNotNull(response);
    }

    /**
     * Delete PDF stamper configuration
     * <p>
     * Delete a PDF stamper configuration.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _20_deleteConfigurationTest() throws ApiException {
        StamperConfigResponse response = configApi.deleteConfiguration(configId);

        Assert.assertNotNull(response);
        Assert.assertEquals(StamperConfigResponse.ConfigStatusEnum.DELETED, response.getConfigStatus());
    }

    /**
     * Delete a job manually
     * <p>
     * Delete the PDF job and all related files.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void _21_deleteJobTest() throws ApiException {
        PdfStamperJobResult response = jobsApi.deleteJob(jobId);

        Assert.assertNotNull(response);
        Assert.assertEquals(PdfStamperJobResult.JobStatusEnum.DELETED, response.getJobStatus());
    }

    private File resource(String filename) {
        return new File(getClass().getResource(filename).getFile());
    }

}
