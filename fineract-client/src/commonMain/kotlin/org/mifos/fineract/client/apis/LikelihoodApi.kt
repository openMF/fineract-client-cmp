/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
package org.mifos.fineract.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path

interface LikelihoodApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId
     * @param ppiName
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun retrieve(
        @Path("likelihoodId") likelihoodId: Long,
        @Path("ppiName") ppiName: String,
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param ppiName
     * @return [kotlin.String]
     */
    @GET("v1/likelihood/{ppiName}")
    suspend fun retrieveAll11(@Path("ppiName") ppiName: String): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param likelihoodId
     * @param ppiName
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/likelihood/{ppiName}/{likelihoodId}")
    suspend fun update4(
        @Path("likelihoodId") likelihoodId: Long,
        @Path("ppiName") ppiName: String,
        @Body body: String? = null,
    ): String
}
