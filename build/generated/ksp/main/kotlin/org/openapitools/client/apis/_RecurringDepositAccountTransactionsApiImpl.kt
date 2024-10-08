// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import org.openapitools.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
import org.openapitools.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
import org.openapitools.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest
import org.openapitools.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse
import org.openapitools.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse

@OptIn(InternalKtorfitApi::class)
public class _RecurringDepositAccountTransactionsApiImpl(
  private val _ktorfit: Ktorfit,
) : RecurringDepositAccountTransactionsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun handleTransactionCommands(
    recurringDepositAccountId: Long,
    transactionId: Long,
    postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest: PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest,
    command: String?,
  ): PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/recurringdepositaccounts/${"$recurringDepositAccountId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo =
        typeInfo<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne21(recurringDepositAccountId: Long, transactionId: Long):
      GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/recurringdepositaccounts/${"$recurringDepositAccountId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo =
        typeInfo<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate16(recurringDepositAccountId: Long, command: String?):
      GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/recurringdepositaccounts/${"$recurringDepositAccountId".encodeURLPath()}/transactions/template")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo =
        typeInfo<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun transaction1(
    recurringDepositAccountId: Long,
    postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest: PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest,
    command: String?,
  ): PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/recurringdepositaccounts/${"$recurringDepositAccountId".encodeURLPath()}/transactions")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo =
        typeInfo<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _RecurringDepositAccountTransactionsApiProvider :
    ClassProvider<RecurringDepositAccountTransactionsApi> {
  override fun create(_ktorfit: Ktorfit): RecurringDepositAccountTransactionsApi =
      _RecurringDepositAccountTransactionsApiImpl(_ktorfit)
}

public fun Ktorfit.createRecurringDepositAccountTransactionsApi():
    RecurringDepositAccountTransactionsApi = _RecurringDepositAccountTransactionsApiImpl(this)
