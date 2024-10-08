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
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.GetFundsResponse
import org.openapitools.client.models.PostFundsRequest
import org.openapitools.client.models.PostFundsResponse
import org.openapitools.client.models.PutFundsFundIdRequest
import org.openapitools.client.models.PutFundsFundIdResponse

@OptIn(InternalKtorfitApi::class)
public class _FundsApiImpl(
  private val _ktorfit: Ktorfit,
) : FundsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun createFund(postFundsRequest: PostFundsRequest): PostFundsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/funds")
        }
        setBody(postFundsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostFundsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveFund(fundId: Long): GetFundsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/funds/${"$fundId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetFundsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveFunds(): List<GetFundsResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/funds")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetFundsResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateFund(fundId: Long, putFundsFundIdRequest: PutFundsFundIdRequest):
      PutFundsFundIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/funds/${"$fundId".encodeURLPath()}")
        }
        setBody(putFundsFundIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutFundsFundIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _FundsApiProvider : ClassProvider<FundsApi> {
  override fun create(_ktorfit: Ktorfit): FundsApi = _FundsApiImpl(_ktorfit)
}

public fun Ktorfit.createFundsApi(): FundsApi = _FundsApiImpl(this)
