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

@OptIn(InternalKtorfitApi::class)
public class _CashiersApiImpl(
  private val _ktorfit: Ktorfit,
) : CashiersApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun getCashierData(
    officeId: Long?,
    tellerId: Long?,
    staffId: Long?,
    date: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/cashiers")
        officeId?.let{ parameter("officeId", "$it") }
        tellerId?.let{ parameter("tellerId", "$it") }
        staffId?.let{ parameter("staffId", "$it") }
        date?.let{ parameter("date", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _CashiersApiProvider : ClassProvider<CashiersApi> {
  override fun create(_ktorfit: Ktorfit): CashiersApi = _CashiersApiImpl(_ktorfit)
}

public fun Ktorfit.createCashiersApi(): CashiersApi = _CashiersApiImpl(this)
