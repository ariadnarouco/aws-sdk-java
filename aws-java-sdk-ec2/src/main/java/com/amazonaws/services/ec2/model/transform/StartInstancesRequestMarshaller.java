/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StartInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstancesRequestMarshaller implements Marshaller<Request<StartInstancesRequest>, StartInstancesRequest> {

    public Request<StartInstancesRequest> marshall(StartInstancesRequest startInstancesRequest) {

        if (startInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartInstancesRequest> request = new DefaultRequest<StartInstancesRequest>(startInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "StartInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> startInstancesRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) startInstancesRequest
                .getInstanceIds();
        if (!startInstancesRequestInstanceIdsList.isEmpty() || !startInstancesRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String startInstancesRequestInstanceIdsListValue : startInstancesRequestInstanceIdsList) {
                if (startInstancesRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(startInstancesRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (startInstancesRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(startInstancesRequest.getAdditionalInfo()));
        }

        return request;
    }

}
