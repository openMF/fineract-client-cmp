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
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query
import org.mifos.fineract.client.models.BatchRequest
import org.mifos.fineract.client.models.BatchResponse

interface BatchAPIApi {
    /**
     * Batch requests in a single transaction
     * The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#39;400&#39; status code and a body consisting of the error details of the first failed request.
     * Responses:
     *  - 200: Success
     *
     * @param batchRequest
     * @param enclosingTransaction enclosingTransaction (optional, default to false)
     * @return [kotlin.collections.List<BatchResponse>]
     */
    @POST("v1/batches")
    suspend fun handleBatchRequests(
        @Body batchRequest: List<BatchRequest>,
        @Query("enclosingTransaction") enclosingTransaction: Boolean? = false,
    ): List<BatchResponse>
}
