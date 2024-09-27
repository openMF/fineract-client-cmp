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

import kotlinx.serialization.Serializable

/**
 * PutOfficesOfficeIdRequest
 *
 * @param dateFormat
 * @param externalId
 * @param locale
 * @param name
 * @param openingDate
 */

@Serializable
data class PutOfficesOfficeIdRequest(

    val dateFormat: kotlin.String? = null,

    val externalId: kotlin.String? = null,

    val locale: kotlin.String? = null,

    val name: kotlin.String? = null,

    val openingDate: kotlin.String? = null,

)
