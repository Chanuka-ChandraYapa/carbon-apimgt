/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.apk.apimgt.impl;

import org.wso2.apk.apimgt.api.APIManagementException;
import org.wso2.apk.apimgt.api.PasswordResolver;

/**
 * This factory class is used to initiate Password Resolver class defined in api-manager.xml
 */
public class PasswordResolverFactory {

    private PasswordResolverFactory() {
    }

    /**
     * Read values from APIManagerConfiguration.
     *
     * @throws APIManagementException
     */
    //TODO use proper init strategy with configs
//    public static void initializePasswordResolver() throws APIManagementException {
//
//        APIManagerConfiguration configuration = ServiceReferenceHolder.getInstance()
//                .getAPIManagerConfigurationService().getAPIManagerConfiguration();
//        if (configuration != null) {
//            String passwordResolverImplClass = configuration
//                    .getFirstProperty(APIConstants.PASSWORD_RESOLVER_IMPL_CLASS);
//            if (passwordResolverImplClass == null) {
//                passwordResolver = new DefaultPasswordResolverImpl();
//            } else {
//                try {
//                    passwordResolver = (PasswordResolver) APIUtil.getClassInstance(passwordResolverImplClass);
//                } catch (InstantiationException e) {
//                    log.error("Error while instantiating class " + passwordResolverImplClass, e);
//                    throw new APIManagementException("Error while instantiating class " + passwordResolverImplClass);
//                } catch (IllegalAccessException e) {
//                    log.error("Illegal access to " + passwordResolverImplClass, e);
//                    throw new APIManagementException("Illegal access to " + passwordResolverImplClass);
//                } catch (ClassNotFoundException e) {
//                    log.error("Cannot find the class " + passwordResolverImplClass + e);
//                    throw new APIManagementException("Cannot find the class " + passwordResolverImplClass);
//                }
//            }
//        }
//    }

    /**
     * This method will take hardcoded class name for password resolver from api-manager.xml file and will return
     * an instance of PasswordResolver.
     *
     * @return PasswordResolver instance.
     */
    public static PasswordResolver getInstance() {

//        return passwordResolver;
        return new DefaultPasswordResolverImpl(); //Dummy return
    }
}
