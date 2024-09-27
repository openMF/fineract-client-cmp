/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 * GetDelinquencyTagHistoryResponse
 *
 * @param addedOnDate
 * @param delinquencyRange
 * @param id
 * @param liftedOnDate
 * @param loanId
 */

@Serializable
data class GetDelinquencyTagHistoryResponse(

    @Contextual
    val addedOnDate: LocalDate? = null,

    val delinquencyRange: GetDelinquencyRangesResponse? = null,

    val id: kotlin.Long? = null,

    @Contextual
    val liftedOnDate: LocalDate? = null,

    val loanId: kotlin.Long? = null,

)
