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
import org.openapitools.client.models.PageClientSearchData
import org.openapitools.client.models.PagedRequestClientTextSearch

@OptIn(InternalKtorfitApi::class)
public class _ClientSearchV2ApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientSearchV2Api {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun searchByText(pagedRequestClientTextSearch: PagedRequestClientTextSearch?):
      PageClientSearchData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v2/clients/search")
        }
        setBody(pagedRequestClientTextSearch) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PageClientSearchData>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientSearchV2ApiProvider : ClassProvider<ClientSearchV2Api> {
  override fun create(_ktorfit: Ktorfit): ClientSearchV2Api = _ClientSearchV2ApiImpl(_ktorfit)
}

public fun Ktorfit.createClientSearchV2Api(): ClientSearchV2Api = _ClientSearchV2ApiImpl(this)
