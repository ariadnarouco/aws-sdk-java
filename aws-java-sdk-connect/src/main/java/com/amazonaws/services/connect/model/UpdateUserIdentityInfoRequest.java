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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateUserIdentityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserIdentityInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity information for the user.
     * </p>
     */
    private UserIdentityInfo identityInfo;
    /**
     * <p>
     * The identifier of the user account.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The identity information for the user.
     * </p>
     * 
     * @param identityInfo
     *        The identity information for the user.
     */

    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * The identity information for the user.
     * </p>
     * 
     * @return The identity information for the user.
     */

    public UserIdentityInfo getIdentityInfo() {
        return this.identityInfo;
    }

    /**
     * <p>
     * The identity information for the user.
     * </p>
     * 
     * @param identityInfo
     *        The identity information for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserIdentityInfoRequest withIdentityInfo(UserIdentityInfo identityInfo) {
        setIdentityInfo(identityInfo);
        return this;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @param userId
     *        The identifier of the user account.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @return The identifier of the user account.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @param userId
     *        The identifier of the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserIdentityInfoRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserIdentityInfoRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: ").append(getIdentityInfo()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserIdentityInfoRequest == false)
            return false;
        UpdateUserIdentityInfoRequest other = (UpdateUserIdentityInfoRequest) obj;
        if (other.getIdentityInfo() == null ^ this.getIdentityInfo() == null)
            return false;
        if (other.getIdentityInfo() != null && other.getIdentityInfo().equals(this.getIdentityInfo()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserIdentityInfoRequest clone() {
        return (UpdateUserIdentityInfoRequest) super.clone();
    }

}
