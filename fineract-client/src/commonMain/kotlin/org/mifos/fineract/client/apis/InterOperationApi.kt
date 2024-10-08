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
import de.jensklingenberg.ktorfit.http.HTTP
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import org.mifos.fineract.client.models.InteropAccountData
import org.mifos.fineract.client.models.InteropIdentifierAccountResponseData
import org.mifos.fineract.client.models.InteropIdentifierRequestData
import org.mifos.fineract.client.models.InteropIdentifiersResponseData
import org.mifos.fineract.client.models.InteropKycResponseData
import org.mifos.fineract.client.models.InteropQuoteRequestData
import org.mifos.fineract.client.models.InteropQuoteResponseData
import org.mifos.fineract.client.models.InteropTransactionRequestData
import org.mifos.fineract.client.models.InteropTransactionRequestResponseData
import org.mifos.fineract.client.models.InteropTransactionsData
import org.mifos.fineract.client.models.InteropTransferRequestData
import org.mifos.fineract.client.models.InteropTransferResponseData

@OptIn(ExperimentalSerializationApi::class)
interface InterOperationApi {
    /**
     * Calculate Interoperation Quote
     *
     * Responses:
     *  - 200: OK
     *
     * @param interopQuoteRequestData
     * @return [InteropQuoteResponseData]
     */
    @POST("v1/interoperation/quotes")
    suspend fun createQuote(@Body interopQuoteRequestData: InteropQuoteRequestData): InteropQuoteResponseData

    /**
     * Allow Interoperation Transaction Request
     *
     * Responses:
     *  - 200: OK
     *
     * @param interopTransactionRequestData
     * @return [InteropTransactionRequestResponseData]
     */
    @POST("v1/interoperation/requests")
    suspend fun createTransactionRequest(@Body interopTransactionRequestData: InteropTransactionRequestData): InteropTransactionRequestResponseData

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeDeleteAccountIdentifier(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Allow Interoperation Identifier registration
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param interopIdentifierRequestData
     * @return [InteropIdentifierAccountResponseData]
     */
    @HTTP(method = "DELETE", path = "v1/interoperation/parties/{idType}/{idValue}", hasBody = true)
    suspend fun deleteAccountIdentifier(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
        @Body interopIdentifierRequestData: InteropIdentifierRequestData,
    ): InteropIdentifierAccountResponseData

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeDeleteAccountIdentifier1(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Allow Interoperation Identifier registration
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @param interopIdentifierRequestData
     * @return [InteropIdentifierAccountResponseData]
     */
    @HTTP(method = "DELETE", path = "v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}", hasBody = true)
    suspend fun deleteAccountIdentifier1(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
        @Path("subIdOrType") subIdOrType: String,
        @Body interopIdentifierRequestData: InteropIdentifierRequestData,
    ): InteropIdentifierAccountResponseData

    /**
     * Disburse Loan by Account Id
     *
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @return [kotlin.String]
     */
    @POST("v1/interoperation/transactions/{accountId}/disburse")
    suspend fun disburseLoan(@Path("accountId") accountId: String): String

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeGetAccountByIdentifier(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Query Interoperation Account by secondary identifier
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @return [InteropIdentifierAccountResponseData]
     */
    @GET("v1/interoperation/parties/{idType}/{idValue}")
    suspend fun getAccountByIdentifier(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
    ): InteropIdentifierAccountResponseData

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeGetAccountByIdentifier1(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Query Interoperation Account by secondary identifier
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @return [InteropIdentifierAccountResponseData]
     */
    @GET("v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    suspend fun getAccountByIdentifier1(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
        @Path("subIdOrType") subIdOrType: String,
    ): InteropIdentifierAccountResponseData

    /**
     * Query Interoperation Account details
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropAccountData]
     */
    @GET("v1/interoperation/accounts/{accountId}")
    suspend fun getAccountDetails(@Path("accountId") accountId: String): InteropAccountData

    /**
     * Query Interoperation secondary identifiers by Account Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropIdentifiersResponseData]
     */
    @GET("v1/interoperation/accounts/{accountId}/identifiers")
    suspend fun getAccountIdentifiers(@Path("accountId") accountId: String): InteropIdentifiersResponseData

    /**
     * Query transactions by Account Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @param debit debit (optional, default to true)
     * @param credit credit (optional, default to false)
     * @param fromBookingDateTime fromBookingDateTime (optional)
     * @param toBookingDateTime toBookingDateTime (optional)
     * @return [InteropTransactionsData]
     */
    @GET("v1/interoperation/accounts/{accountId}/transactions")
    suspend fun getAccountTransactions(
        @Path("accountId") accountId: String,
        @Query("debit") debit: Boolean? = true,
        @Query("credit") credit: Boolean? = false,
        @Query("fromBookingDateTime") fromBookingDateTime: String? = null,
        @Query("toBookingDateTime") toBookingDateTime: String? = null,
    ): InteropTransactionsData

    /**
     * Query KYC by Account Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param accountId accountId
     * @return [InteropKycResponseData]
     */
    @GET("v1/interoperation/accounts/{accountId}/kyc")
    suspend fun getClientKyc(@Path("accountId") accountId: String): InteropKycResponseData

    /**
     * Query Interoperation Quote
     *
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param quoteCode quoteCode
     * @return [InteropQuoteResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/quotes/{quoteCode}")
    suspend fun getQuote(
        @Path("transactionCode") transactionCode: String,
        @Path("quoteCode") quoteCode: String,
    ): InteropQuoteResponseData

    /**
     * Query Interoperation Transaction Request
     *
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param requestCode requestCode
     * @return [InteropTransactionRequestResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/requests/{requestCode}")
    suspend fun getTransactionRequest(
        @Path("transactionCode") transactionCode: String,
        @Path("requestCode") requestCode: String,
    ): InteropTransactionRequestResponseData

    /**
     * Query Interoperation Transfer
     *
     * Responses:
     *  - 200: OK
     *
     * @param transactionCode transactionCode
     * @param transferCode transferCode
     * @return [InteropTransferResponseData]
     */
    @GET("v1/interoperation/transactions/{transactionCode}/transfers/{transferCode}")
    suspend fun getTransfer(
        @Path("transactionCode") transactionCode: String,
        @Path("transferCode") transferCode: String,
    ): InteropTransferResponseData

    /**
     * Query Interoperation Health Request
     *
     * Responses:
     *  - 200: OK
     *
     * @return [Unit]
     */
    @GET("v1/interoperation/health")
    suspend fun health(): Unit

    /**
     * Disburse Loan by Account Id
     *
     * Responses:
     *  - 0: default response
     *
     * @param accountId accountId
     * @return [kotlin.String]
     */
    @POST("v1/interoperation/transactions/{accountId}/loanrepayment")
    suspend fun loanRepayment(@Path("accountId") accountId: String): String

    /**
     * Prepare Interoperation Transfer
     *
     * Responses:
     *  - 200: OK
     *
     * @param interopTransferRequestData
     * @param action action (optional)
     * @return [InteropTransferResponseData]
     */
    @POST("v1/interoperation/transfers")
    suspend fun performTransfer(
        @Body interopTransferRequestData: InteropTransferRequestData,
        @Query("action") action: String? = null,
    ): InteropTransferResponseData

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeRegisterAccountIdentifier(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Interoperation Identifier registration
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param interopIdentifierRequestData
     * @return [InteropIdentifierAccountResponseData]
     */
    @POST("v1/interoperation/parties/{idType}/{idValue}")
    suspend fun registerAccountIdentifier(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
        @Body interopIdentifierRequestData: InteropIdentifierRequestData,
    ): InteropIdentifierAccountResponseData

    /**
     * enum for parameter idType
     */
    @Serializable
    enum class IdTypeRegisterAccountIdentifier1(val value: String) {
        @JsonNames("MSISDN")
        MSISDN("MSISDN"),

        @JsonNames("EMAIL")
        EMAIL("EMAIL"),

        @JsonNames("PERSONAL_ID")
        PERSONAL_ID("PERSONAL_ID"),

        @JsonNames("BUSINESS")
        BUSINESS("BUSINESS"),

        @JsonNames("DEVICE")
        DEVICE("DEVICE"),

        @JsonNames("ACCOUNT_ID")
        ACCOUNT_ID("ACCOUNT_ID"),

        @JsonNames("IBAN")
        IBAN("IBAN"),

        @JsonNames("ALIAS")
        ALIAS("ALIAS"),
    }

    /**
     * Interoperation Identifier registration
     *
     * Responses:
     *  - 200: OK
     *
     * @param idType idType
     * @param idValue idValue
     * @param subIdOrType subIdOrType
     * @param interopIdentifierRequestData
     * @return [InteropIdentifierAccountResponseData]
     */
    @POST("v1/interoperation/parties/{idType}/{idValue}/{subIdOrType}")
    suspend fun registerAccountIdentifier1(
        @Path("idType") idType: String,
        @Path("idValue") idValue: String,
        @Path("subIdOrType") subIdOrType: String,
        @Body interopIdentifierRequestData: InteropIdentifierRequestData,
    ): InteropIdentifierAccountResponseData
}
