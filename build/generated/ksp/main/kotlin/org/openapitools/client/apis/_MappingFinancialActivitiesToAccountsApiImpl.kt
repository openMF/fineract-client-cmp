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
import kotlin.collections.List
import org.openapitools.client.models.DeleteFinancialActivityAccountsResponse
import org.openapitools.client.models.GetFinancialActivityAccountsResponse
import org.openapitools.client.models.PostFinancialActivityAccountsRequest
import org.openapitools.client.models.PostFinancialActivityAccountsResponse
import org.openapitools.client.models.PutFinancialActivityAccountsResponse

@OptIn(InternalKtorfitApi::class)
public class _MappingFinancialActivitiesToAccountsApiImpl(
  private val _ktorfit: Ktorfit,
) : MappingFinancialActivitiesToAccountsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend
      fun createGLAccount(postFinancialActivityAccountsRequest: PostFinancialActivityAccountsRequest?):
      PostFinancialActivityAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts")
        }
        setBody(postFinancialActivityAccountsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostFinancialActivityAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteGLAccount(mappingId: Long): DeleteFinancialActivityAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts/${"$mappingId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteFinancialActivityAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retreive(mappingId: Long): GetFinancialActivityAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts/${"$mappingId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetFinancialActivityAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll(): List<GetFinancialActivityAccountsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetFinancialActivityAccountsResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateGLAccount(mappingId: Long,
      postFinancialActivityAccountsRequest: PostFinancialActivityAccountsRequest?):
      PutFinancialActivityAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/financialactivityaccounts/${"$mappingId".encodeURLPath()}")
        }
        setBody(postFinancialActivityAccountsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutFinancialActivityAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _MappingFinancialActivitiesToAccountsApiProvider :
    ClassProvider<MappingFinancialActivitiesToAccountsApi> {
  override fun create(_ktorfit: Ktorfit): MappingFinancialActivitiesToAccountsApi =
      _MappingFinancialActivitiesToAccountsApiImpl(_ktorfit)
}

public fun Ktorfit.createMappingFinancialActivitiesToAccountsApi():
    MappingFinancialActivitiesToAccountsApi = _MappingFinancialActivitiesToAccountsApiImpl(this)
