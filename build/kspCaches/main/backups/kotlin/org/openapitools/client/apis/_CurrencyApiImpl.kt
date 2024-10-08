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
import kotlin.OptIn
import kotlin.Suppress
import org.openapitools.client.models.GetCurrenciesResponse
import org.openapitools.client.models.PutCurrenciesRequest
import org.openapitools.client.models.PutCurrenciesResponse

@OptIn(InternalKtorfitApi::class)
public class _CurrencyApiImpl(
  private val _ktorfit: Ktorfit,
) : CurrencyApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveCurrencies(): GetCurrenciesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/currencies")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetCurrenciesResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateCurrencies(putCurrenciesRequest: PutCurrenciesRequest):
      PutCurrenciesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/currencies")
        }
        setBody(putCurrenciesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutCurrenciesResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _CurrencyApiProvider : ClassProvider<CurrencyApi> {
  override fun create(_ktorfit: Ktorfit): CurrencyApi = _CurrencyApiImpl(_ktorfit)
}

public fun Ktorfit.createCurrencyApi(): CurrencyApi = _CurrencyApiImpl(this)
