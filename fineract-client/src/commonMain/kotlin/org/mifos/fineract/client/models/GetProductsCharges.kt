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
 *
 *
 * @param active
 * @param amount
 * @param chargeAppliesTo
 * @param chargeCalculationType
 * @param chargePaymentMode
 * @param chargeTimeType
 * @param currency
 * @param id
 * @param name
 * @param penalty
 */

@Serializable
data class GetProductsCharges(

    val active: kotlin.Boolean? = null,

    val amount: kotlin.Int? = null,

    val chargeAppliesTo: GetChargeAppliesTo? = null,

    val chargeCalculationType: GetChargeCalculationType? = null,

    val chargePaymentMode: GetChargePaymentMode? = null,

    val chargeTimeType: GetChargeTimeType? = null,

    val currency: GetChargesCurrency? = null,

    val id: kotlin.Long? = null,

    val name: kotlin.String? = null,

    val penalty: kotlin.Boolean? = null,

)
