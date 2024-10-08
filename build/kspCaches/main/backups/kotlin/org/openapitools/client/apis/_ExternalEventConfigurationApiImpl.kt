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
import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.GetExternalEventConfigurationsResponse
import org.openapitools.client.models.PutExternalEventConfigurationsRequest

@OptIn(InternalKtorfitApi::class)
public class _ExternalEventConfigurationApiImpl(
  private val _ktorfit: Ktorfit,
) : ExternalEventConfigurationApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveExternalEventConfiguration():
      GetExternalEventConfigurationsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/externalevents/configuration")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetExternalEventConfigurationsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend
      fun updateExternalEventConfigurationsDetails(putExternalEventConfigurationsRequest: PutExternalEventConfigurationsRequest):
      CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/externalevents/configuration")
        }
        setBody(putExternalEventConfigurationsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<CommandProcessingResult>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ExternalEventConfigurationApiProvider : ClassProvider<ExternalEventConfigurationApi> {
  override fun create(_ktorfit: Ktorfit): ExternalEventConfigurationApi =
      _ExternalEventConfigurationApiImpl(_ktorfit)
}

public fun Ktorfit.createExternalEventConfigurationApi(): ExternalEventConfigurationApi =
    _ExternalEventConfigurationApiImpl(this)
