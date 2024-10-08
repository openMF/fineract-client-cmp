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
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import org.openapitools.client.models.GetClientsClientIdTransactionsResponse
import org.openapitools.client.models.GetClientsClientIdTransactionsTransactionIdResponse
import org.openapitools.client.models.PostClientsClientIdTransactionsTransactionIdResponse

@OptIn(InternalKtorfitApi::class)
public class _ClientTransactionApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientTransactionApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveAllClientTransactions(
    clientId: Long,
    offset: Int?,
    limit: Int?,
  ): GetClientsClientIdTransactionsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/transactions")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllClientTransactions1(
    clientExternalId: String,
    offset: Int?,
    limit: Int?,
  ): GetClientsClientIdTransactionsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$clientExternalId".encodeURLPath()}/transactions")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveClientTransaction(clientId: Long, transactionId: Long):
      GetClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveClientTransaction1(clientId: Long, transactionExternalId: String):
      GetClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/transactions/external-id/${"$transactionExternalId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveClientTransaction2(clientExternalId: String, transactionId: Long):
      GetClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$clientExternalId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveClientTransaction3(clientExternalId: String,
      transactionExternalId: String): GetClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$clientExternalId".encodeURLPath()}/transactions/external-id/${"$transactionExternalId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun undoClientTransaction(
    clientId: Long,
    transactionId: Long,
    command: String?,
  ): PostClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun undoClientTransaction1(
    clientId: Long,
    transactionExternalId: String,
    command: String?,
  ): PostClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/transactions/external-id/${"$transactionExternalId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun undoClientTransaction2(
    clientExternalId: String,
    transactionId: Long,
    command: String?,
  ): PostClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$clientExternalId".encodeURLPath()}/transactions/${"$transactionId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun undoClientTransaction3(
    clientExternalId: String,
    transactionExternalId: String,
    command: String?,
  ): PostClientsClientIdTransactionsTransactionIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$clientExternalId".encodeURLPath()}/transactions/external-id/${"$transactionExternalId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdTransactionsTransactionIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientTransactionApiProvider : ClassProvider<ClientTransactionApi> {
  override fun create(_ktorfit: Ktorfit): ClientTransactionApi = _ClientTransactionApiImpl(_ktorfit)
}

public fun Ktorfit.createClientTransactionApi(): ClientTransactionApi =
    _ClientTransactionApiImpl(this)
