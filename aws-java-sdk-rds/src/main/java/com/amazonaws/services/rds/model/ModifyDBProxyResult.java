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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DBProxy</code> object representing the new settings for the proxy.
     * </p>
     */
    private DBProxy dBProxy;

    /**
     * <p>
     * The <code>DBProxy</code> object representing the new settings for the proxy.
     * </p>
     * 
     * @param dBProxy
     *        The <code>DBProxy</code> object representing the new settings for the proxy.
     */

    public void setDBProxy(DBProxy dBProxy) {
        this.dBProxy = dBProxy;
    }

    /**
     * <p>
     * The <code>DBProxy</code> object representing the new settings for the proxy.
     * </p>
     * 
     * @return The <code>DBProxy</code> object representing the new settings for the proxy.
     */

    public DBProxy getDBProxy() {
        return this.dBProxy;
    }

    /**
     * <p>
     * The <code>DBProxy</code> object representing the new settings for the proxy.
     * </p>
     * 
     * @param dBProxy
     *        The <code>DBProxy</code> object representing the new settings for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyResult withDBProxy(DBProxy dBProxy) {
        setDBProxy(dBProxy);
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
        if (getDBProxy() != null)
            sb.append("DBProxy: ").append(getDBProxy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyResult == false)
            return false;
        ModifyDBProxyResult other = (ModifyDBProxyResult) obj;
        if (other.getDBProxy() == null ^ this.getDBProxy() == null)
            return false;
        if (other.getDBProxy() != null && other.getDBProxy().equals(this.getDBProxy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxy() == null) ? 0 : getDBProxy().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBProxyResult clone() {
        try {
            return (ModifyDBProxyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
